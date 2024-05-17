package Session04_Homework;

public class Exercise_06 {
    public static void main(String[] args) {
        // Cách 1: Sử dụng phương thức concat()
        String str1 = "Hello";
        String str2 = "World";
        String concatenatedString = str1.concat(str2);
        System.out.println("Chuỗi sau khi nối: " + concatenatedString); // Kết quả: HelloWorld

        // Cách 2: Sử dụng toán tử +
        String str3 = "Java";
        String str4 = "Script";
        String concatenatedString2 = str3 + " " + str4;
        System.out.println("Chuỗi sau khi nối: " + concatenatedString2); // Kết quả: Java Script
    }
}
