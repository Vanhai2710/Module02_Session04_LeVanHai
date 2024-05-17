package Session04_Homework;

import java.util.Scanner;

public class Exercise_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi chính: ");
        String mainString = scanner.nextLine();

        System.out.print("Nhập chuỗi con 1: ");
        String subString1 = scanner.nextLine();

        System.out.print("Nhập chuỗi con 2: ");
        String subString2 = scanner.nextLine();

        boolean containsSubString1 = mainString.contains(subString1);
        boolean containsSubString2 = mainString.contains(subString2);

        System.out.println("Chuỗi '" + mainString + "' có chứa chuỗi con '" + subString1 + "': " + containsSubString1);
        System.out.println("Chuỗi '" + mainString + "' có chứa chuỗi con '" + subString2 + "': " + containsSubString2);

        scanner.close();
    }
}
