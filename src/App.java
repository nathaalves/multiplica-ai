import java.io.InputStreamReader;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        System.out.println("Qual tabela de multiplicação você quer acessar?: ");
        int input = Integer.parseInt(scanner.nextLine()) ;

        System.out.println("Tabela de multiplicação de " + input);
        for (int i = 1; i <= 10; i++) {
            System.out.println(input + "x" + i + " = " + input*i);
        }
    }
}
