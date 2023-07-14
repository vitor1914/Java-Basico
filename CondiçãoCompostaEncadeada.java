import java.util.Scanner;

public class CondiçãoCompostaEncadeada {
    public static void main(String[] args) {

        System.out.println("Digite seu ano de nascimento:");

        Scanner teclado = new Scanner(System.in);
        int a = 2023;
        int nasc = teclado.nextInt();
        int idade = a - nasc;


        if (idade < 16) {
            System.out.println("Não vota");

        } else if ((idade>=16 && idade<=18) || (idade>70)){
                System.out.println("Voto Opicional");

        } else if (idade>=70){
                System.out.println("Voto Obrigatorio");
            }
        }
    }




