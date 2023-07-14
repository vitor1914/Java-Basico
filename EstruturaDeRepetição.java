import java.util.Scanner;

public class EstruturaDeRepetição {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int cc = 0;
        while (cc<10) {
            cc++;
            if (cc == 2 || cc == 5 || cc == 9) {
                continue;
            } if (cc == 7) {
                break;
            }
            System.out.println("Cambalhota" + cc);
        }

    }
}
