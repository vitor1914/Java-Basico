import java.util.Scanner;

public class MediaNota {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua nota N1:");
        float n1 = teclado.nextFloat();
        System.out.println("Digite sua nota N2:");
        float n2 = teclado.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("Sua media é " + m);

        if (m > 7) {
            System.out.println("Parabens, você foi APROVADO!");
        }else{
            System.out.println("Estude mais!");
        }
    }
}
