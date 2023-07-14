import java.sql.SQLOutput;
import java.util.Scanner;

public class ProgramaPernas {
    public static void main(String[] args) {

        System.out.println("Quantas pernas?");
        Scanner teclado = new Scanner(System.in);

        int perna = teclado.nextInt();
        String tipo;

        System.out.println("Isso é um(a) ");
        switch (perna) {
            case 1:
                tipo = "saci";
                break;
            case 2:
                tipo = "Bídepe";
                break;
            case 3:
                tipo = "Tripé";
                break;

            case 4:
                tipo = "Quadrupede";
                break;
            case 5:
                tipo = "Aranha";
                break;
            case 6:
                tipo = "ET";
                break;
            default:
                tipo = "ET";
                break;
        }
        System.out.println(tipo);

    }
}
