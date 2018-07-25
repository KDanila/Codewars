package prizedraw;

import java.util.*;

/**
 * @author zz76E_blSst
 * @version $Id$
 * @since 0.1
 */
class Rank {
    /**
     * NtnRanr method.
     *
     * @param st - name arrays(split by ',').
     * @param we - weight array.
     * @param n  - number of player position.
     * @return n-name of player.
     */
    public static String nthRank(String st, Integer[] we, int n) {
        if (st.isEmpty()) {
            return "No participants";
        }
        if (n > we.length) {
            return "Not enough participants";
        }
        String[] names = st.split(",");
        List<NameRank> winnerArray = createList(names, we);
        Collections.sort(winnerArray);
        return winnerArray.get(n - 1).getName();
    }

    /**
     * CreateList method.
     *
     * @param names - names.
     * @param we    - weight.
     * @return List of NameRank class.
     */
    private static List<NameRank> createList(String[] names, Integer[] we) {
        List<NameRank> nameRanks = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            nameRanks.add(new NameRank(names[i], nameValue(names[i].toLowerCase()) * we[i]));
        }
        return nameRanks;
    }

    /**
     * nameValue method.
     *
     * @param name - name.
     * @return int - value of name(look discription of task).
     */
    static int nameValue(String name) {
        char[] charName = name.toCharArray();
        int codeSum = name.length();
        for (int i = 0; i < charName.length; i++) {
            codeSum += (int) charName[i] - 96;
        }
        return codeSum;
    }

    /**
     * NameRank class.
     */
    static class NameRank implements Comparable<NameRank> {
        /**
         * Name.
         */
        private String name;
        /**
         * Rank.
         */
        private int rank;

        /**
         * Constructor.
         *
         * @param name - name.
         * @param rank - rank.
         */
        public NameRank(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        /**
         * compareTo method.
         *
         * @param o - other NameRank class.
         * @return int.
         */
        @Override
        public int compareTo(NameRank o) {
            if (this.rank - o.rank == 0) {
                return this.name.compareTo(o.getName());
            }
            return (o.rank - this.rank);
        }

        /**
         * name getter.
         *
         * @return name.
         */
        public String getName() {
            return name;
        }

        /**
         * name setter.
         *
         * @param name - name.
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * rank getter.
         *
         * @return rank.
         */
        public int getRank() {
            return rank;
        }

        /**
         * rank setter.
         *
         * @param rank - rank.
         */
        public void setRank(int rank) {
            this.rank = rank;
        }

        @Override
        public String toString() {
            return "NameRank{" +
                    "name='" + name + '\'' +
                    ", rank=" + rank +
                    '}';
        }
    }

}
/*
To participate in a prize draw each one gives his/her firstname.

Each letter of a firstname has a value which is its rank in the English alphabet.
A and a have rank 1, B and b rank 2 and so on.

The length of the firstname is added to the sum of these ranks hence a number n.
An array of random weights is linked to the firstnames and each n is multiplied by
its corresponding weight to get what they call a winning number.

Example: names: COLIN,AMANDBA,AMANDAB,CAROL,PauL,JOSEPH weights: [1, 4, 4, 5, 2, 1]

PAUL -> n = length of firstname + 16 + 1 + 21 + 12 = 4 + 50 -> 54 The weight associated with PAUL
is 2 so Paul's winning number is 54 * 2 = 108.

Now one can sort the firstnames in decreasing order of the winning numbers. When two people have the
same winning number sort them alphabetically by their firstnames.

#Task:

parameters: st a string of firstnames, we an array of weights, n a rank

return: the firstname of the participant whose rank is n (ranks are numbered from 1)

#Example: names: COLIN,AMANDBA,AMANDAB,CAROL,PauL,JOSEPH weights: [1, 4, 4, 5, 2, 1] n: 4

The function should return: PauL

#Note: If st is empty return "No participants".

If n is greater than the number of participants then return "Not enough participants".
 */