import java.util.Scanner;

public class Programm {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String expresion = sc.nextLine();// выражение
        String result = Main.calc(expresion);
        System.out.println(result);
    }
}
