package test;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class test {
    public static void main(String[] args) {

        List<Borrower> borrowers = createBorrower();
        Map<Integer, List<Borrower>> bo =  borrowers.stream()
                .collect(groupingBy(borrower -> borrower.getIdCa(), mapping(borrower1 -> borrower1, toList())));


        System.out.println(bo);
        System.out.println(bo.get(1));
        System.out.println(bo.get(3));
        System.out.println(bo.get(4));

    }

    static List<Borrower> createBorrower(){
        Borrower on1 = Borrower.builder()
                .idCa(1)
                .name("first")
                .build();
        Borrower on2 = Borrower.builder()
                .idCa(2)
                .name("second")
                .build();
        Borrower on3 = Borrower.builder()
                .idCa(1)
                .name("third")
                .build();
        Borrower on4 = Borrower.builder()
                .idCa(4)
                .name("fourth")
                .build();
        Borrower on5 = Borrower.builder()
                .idCa(2)
                .name("fifth")
                .build();
        List<Borrower> borrowers = new ArrayList<>();
        borrowers.add(on1);
        borrowers.add(on2);
        borrowers.add(on3);
        borrowers.add(on4);
        borrowers.add(on5);

        return borrowers;
    }

    @Getter
    @Builder
    @ToString
    static class Borrower{
        int idCa;
        String name;
    }
}
