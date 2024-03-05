package Class00;

import java.util.Arrays;
import java.util.Scanner;

public class Benchmark {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*

        Array -> [CPU, Memory, ExecTime, Lines]
        Performance -> 106 / (cpu * 100 + memory + time + lines).

        C,20,2505.85,130,300
        C++,23,3197.64,110,365
        C#,28,3986.27,146,387
        Java,32,4168.10,182,416
        Python,25,3589.43,125,160
        Delphi,23,3341.98,137,371
        PHP,31,4033.50,158,322

         */


        String[] arrayC = new String[]{"20", "2505.85", "130", "300", "C"};
        String[] arrayCPlus = new String[]{"23","3197.64","110","365" ,"C++"};
        String[] arrayCSharp = new String[]{"28","3986.27","146","387", "C#"};
        String[] arrayJava = new String[]{"32","4168.10","182","416", "Java"};
        String[] arrayPython = new String[]{"25","3589.43","125","160", "Python"};
        String[] arrayDelphi = new String[]{"23","3341.98","137","371", "Delphi"};
        String[] arrayPHP = new String[]{"31","4033.50","158","322", "PHP"};

        String[][] allPerformances = new String[][]{
                {arrayC[4], Float.toString(getPerformance(arrayC))},
                {arrayCPlus[4], Float.toString(getPerformance(arrayCPlus))},
                {arrayCSharp[4], Float.toString(getPerformance(arrayCSharp))},
                {arrayJava[4], Float.toString(getPerformance(arrayJava))},
                {arrayPython[4], Float.toString(getPerformance(arrayPython))},
                {arrayDelphi[4], Float.toString(getPerformance(arrayDelphi))},
                {arrayPHP[4], Float.toString(getPerformance(arrayPHP))}
        };

        String[][] allLines = new String[][]{
                {arrayC[4], arrayC[3]},
                {arrayCPlus[4], arrayCPlus[3]},
                {arrayCSharp[4], arrayCSharp[3]},
                {arrayJava[4], arrayJava[3]},
                {arrayPython[4], arrayPython[3]},
                {arrayDelphi[4], arrayDelphi[3]},
                {arrayPHP[4], arrayPHP[3]}
        };



        System.out.println("\n-//- PROGRAMMING BENCHMARK -//-");

        // Performances output
        System.out.println("\n--- Performances ---");
        System.out.printf("\n>> %s -> Performance: %.2f\n", arrayC[4], getPerformance(arrayC));
        System.out.printf(">> %s -> Performance: %.2f\n", arrayCPlus[4], getPerformance(arrayCPlus));
        System.out.printf(">> %s -> Performance: %.2f\n", arrayCSharp[4], getPerformance(arrayCSharp));
        System.out.printf(">> %s -> Performance: %.2f\n", arrayJava[4], getPerformance(arrayJava));
        System.out.printf(">> %s -> Performance: %.2f\n", arrayPython[4], getPerformance(arrayPython));
        System.out.printf(">> %s -> Performance: %.2f\n", arrayDelphi[4], getPerformance(arrayDelphi));
        System.out.printf(">> %s -> Performance: %.2f\n", arrayPHP[4], getPerformance(arrayPHP));

        // Metrics Average
        float averageCPU = (Float.parseFloat(arrayC[0]) + Float.parseFloat(arrayCPlus[0]) + Float.parseFloat(arrayCSharp[0]) + Float.parseFloat(arrayJava[0])
                + Float.parseFloat(arrayPython[0]) + Float.parseFloat(arrayDelphi[0]) + Float.parseFloat(arrayPHP[0])) / 7;

        float averageMemory = (Float.parseFloat(arrayC[1]) + Float.parseFloat(arrayCPlus[1]) + Float.parseFloat(arrayCSharp[1]) + Float.parseFloat(arrayJava[1])
                + Float.parseFloat(arrayPython[1]) + Float.parseFloat(arrayDelphi[1]) + Float.parseFloat(arrayPHP[1])) / 7;

        float averageTime = (Float.parseFloat(arrayC[2]) + Float.parseFloat(arrayCPlus[2]) + Float.parseFloat(arrayCSharp[2]) + Float.parseFloat(arrayJava[2])
                + Float.parseFloat(arrayPython[2]) + Float.parseFloat(arrayDelphi[2]) + Float.parseFloat(arrayPHP[2])) / 7;

        float averageLines = (Float.parseFloat(arrayC[3]) + Float.parseFloat(arrayCPlus[3]) + Float.parseFloat(arrayCSharp[3]) + Float.parseFloat(arrayJava[3])
                + Float.parseFloat(arrayPython[3]) + Float.parseFloat(arrayDelphi[3]) + Float.parseFloat(arrayPHP[3])) / 7;

        System.out.println("\n--- Metrics Average ---");

        System.out.printf("""
                \n>> CPU Average -> %.02f\s
                >> Memory Average -> %.02f\s
                >> ExecTime Average -> %.02f\s
                >> Lines Average -> %.02f\s
                """, averageCPU,averageMemory,averageTime,averageLines);

        // Get & Print - which one has the BETTER performance
        String[] betterPerformance = getBetterPerformance(allPerformances);

        System.out.println("\n--- Language with the best performance ---");
        System.out.printf("\n>> %s -> %.2f\n", betterPerformance[1], Float.parseFloat(betterPerformance[0]));

        //Get & Print - which one has the LESS lines number
        String[] lessLinesNumber = getLessLines(allLines);

        System.out.println("\n--- Language with less lines number ---");
        System.out.printf("\n>> %s -> %d lines\n", betterPerformance[1], Integer.parseInt(lessLinesNumber[0]));



    }

    // Function to calculate the performance
    public static float getPerformance(String[] array){

        float cpu = Float.parseFloat(array[0]);
        float memory = Float.parseFloat(array[1]);
        float execTime = Float.parseFloat(array[2]);
        float lines = Float.parseFloat(array[3]);

        // Formula -> 106 / (cpu * 100 + memory + execTime + lines).
        return (cpu * 100 + memory + execTime + lines) / 106.0f;
    }

    // Function to check the language with less lines number
    public static String[] getBetterPerformance(String[][] allPerformances){

        float higherPerformanceValue = 0;
        String higherPerformanceName = null;

        for (int i = 0; i < allPerformances.length; i++) {
            if (Float.parseFloat(allPerformances[i][1]) > higherPerformanceValue){
                higherPerformanceValue = Float.parseFloat(allPerformances[i][1]);
                higherPerformanceName = allPerformances[i][0];
            }
        }
        return new String[]{String.valueOf(higherPerformanceValue), higherPerformanceName};
    }

    public static String[] getLessLines(String[][] allLines){

        int lessLinesNumber = 0;
        String lessLinesName = null;

        for (int i = 0; i < allLines.length; i++) {
            if (Float.parseFloat(allLines[i][1]) > lessLinesNumber){
                lessLinesNumber = Integer.parseInt(allLines[i][1]);
                lessLinesName = allLines[i][0];
            }
        }
        return new String[]{String.valueOf(lessLinesNumber), lessLinesName};
    }


}
