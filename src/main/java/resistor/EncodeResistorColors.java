package resistor;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Integer.parseInt;

/*
 Цветовая кодировка резисторов Цвет 	как число 	как десятичный множитель 	как точность в % 	как ТКС в ppm/°C 	как % отказов
серебристый 	— 	1·10−2 = «0,01» 	10 	— 	—
золотой 	— 	1·10−1 = «0,1» 	5 	— 	—
чёрный 	0 	1·100 = 1 	— 	— 	—
коричневый 	1 	1·101 = «10» 	1 	100 	1 %
красный 	2 	1·10² = «100» 	2 	50 	0,1 %
оранжевый 	3 	1·10³ = «1000» 	— 	15 	0,01 %
жёлтый 	4 	1·104 = «10 000» 	— 	25 	0,001 %
зелёный 	5 	1·105 = «100 000» 	0,5 	— 	—
синий 	6 	1·106 = «1 000 000» 	0,25 	10 	—
фиолетовый 	7 	1·107 = «10 000 000» 	0,1 	5 	—
серый 	8 	1·108 = «100 000 000» 	0,05 	— 	—
белый 	9 	1·109 = «1 000 000 000» 	— 	1 	—
отсутствует 	— 	— 	20 % 	— 	—

    Пример
    Допустим, на резисторе имеются четыре полосы: коричневая, чёрная, красная и золотая. Первые две полоски дают 1 0,
     третья 100, четвёртая даёт точность 5 %, итого — резистор сопротивлением 10·100 Ом = 1 кОм, с точностью ±5 %.
 */
public class EncodeResistorColors {
    private final Map<String, String[]> colorCode;

    public EncodeResistorColors() {
        this.colorCode = new HashMap<>();
        String[] silver = new String[]{"-", "0,01", "10", "-", "-"};
        String[] gold = new String[]{"-", "0,1", "5", "-", "-"};
        String[] black = new String[]{"0", "1", "-", "-", "-"};
        String[] brown = new String[]{"1", "10", "1", "100", "1"};
        String[] red = new String[]{"2", "100", "2", "50", "0,1"};
        String[] orange = new String[]{"3", "1000", "-", "15", "0,01"};
        String[] yellow = new String[]{"4", "10000", "-", "25", "0,001"};
        String[] green = new String[]{"5", "100000", "0,5", "-", "-"};
        String[] blue = new String[]{"6", "1000000", "0,25", "10", "-"};
        String[] violet = new String[]{"7", "10000000", "0,1", "5", "-"};
        String[] gray = new String[]{"8", "100000000", "0,05", "-", "-"};
        String[] white = new String[]{"8", "1000000000", "0,05", "-", "-"};
        colorCode.put("silver", silver);
        colorCode.put("gold", gold);
        colorCode.put("black", black);
        colorCode.put("brown", brown);
        colorCode.put("red", red);
        colorCode.put("orange", orange);
        colorCode.put("yellow", yellow);
        colorCode.put("green", green);
        colorCode.put("blue", blue);
        colorCode.put("violet", violet);
        colorCode.put("gray", gray);
        colorCode.put("white", white);
        //0: black, 1: brown, 2: red, 3: orange, 4: yellow, 5: green, 6: blue, 7: violet, 8: gray, 9: white
    }

    /*
            Первые две полоски всегда означают первые два знака номинала.
            Если полосок 3 или 4, третья полоска означает десятичный множитель,
            то есть степень десятки, которая умножается на число, состоящее из двух цифр,
            указанное первыми двумя полосками. Если полосок 4, последняя указывает точность резистора.
            Если полосок 5, третья означает третий знак сопротивления, четвёртая — десятичный множитель, пятая — точность.
            */
    public static String encodeResistorColors(String nom) {
        return parseNominal(nom);
    }

    private static String parseNominal(String nom) {
        String toReturn;
        nom = nom.split(" ")[0];
        if (nom.contains("k")) {
            nom = nom.replaceAll("k", "");
            toReturn = parseDigitToColors(nom, "orange");
        } else if (nom.contains("M")) {
            nom = nom.replaceAll("M", "");
            toReturn = parseDigitToColors(nom, "blue");
        } else {
            toReturn = parseDigitToColors(nom, "black");
            ;
        }
        return toReturn;
    }

    private static String parseDigitToColors(String nominal, String grade) {
        StringBuilder sb = new StringBuilder();

        sb.append(grade).append(" gold");
        return sb.toString();
    }
}
