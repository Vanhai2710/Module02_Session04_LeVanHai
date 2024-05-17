package Session04_Homework;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercise_09 {
    public static void main(String[] args) {Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập email: ");
        String email = scanner.nextLine();

        System.out.print("Nhập password: ");
        String password = scanner.nextLine();

        // Biểu thức chính quy cho email
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        Pattern emailPattern = Pattern.compile(emailRegex);

        // Biểu thức chính quy cho password
        String passwordRegex = "^\\S{6,}$";
        Pattern passwordPattern = Pattern.compile(passwordRegex);

        // Kiểm tra email
        boolean isValidEmail = emailPattern.matcher(email).matches();
        if (isValidEmail) {
            System.err.println("Email hợp lệ");
        } else {
            System.err.println("Email không hợp lệ");
        }

        // Kiểm tra password
        boolean isValidPassword = passwordPattern.matcher(password).matches();
        if (isValidPassword) {
            System.out.println("Password hợp lệ");
        } else {
            System.out.println("Password không hợp lệ");
        }

        scanner.close();

    }
}
