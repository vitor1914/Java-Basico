import java.util.Scanner;

public class OlaMundoSwing {
    public static void main(String[] args) {

        System.out.println("Digite seu nome: ");

        Scanner teclado = new Scanner (System.in);

        int idade = teclado.nextInt();

        System.out.println("sua idade é " + idade);

    }
}
