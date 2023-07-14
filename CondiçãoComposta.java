import java.util.Scanner;

public class CondiçãoComposta {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento: ");
        int nasc = teclado.nextInt();
        int i = 2023 - nasc;
        if (i>=18) {
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }

    }
}
