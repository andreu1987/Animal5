package check;

import java.util.Scanner;

public class CheckNumber {
    public static Integer checkIntString(Scanner scanner,String message){
        do {
            System.out.println(message);
            Integer number = CheckAgeWeightString.convertWeightIntString(scanner.next());

            if (number != null) {
                return number;
            }
            System.out.println("Вы ввели не то значения, что мы ожидаем!");
        } while (true);
    }
}
