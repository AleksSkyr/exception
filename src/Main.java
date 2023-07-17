import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите логин: ");
        String loginS = scan.nextLine();
        System.out.print("Введите пароль: ");
        String passwordS = scan.nextLine();
        System.out.print("Повторно введите пароль: ");
        String confirmPasswordS = scan.nextLine();
        Registration.regist(loginS, passwordS, confirmPasswordS);
    }
}