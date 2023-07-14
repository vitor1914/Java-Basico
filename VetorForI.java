import java.util.Arrays;

public class VetorForI {
    public static void main(String[] args) {
        double v[] = {3.5, 2.75, 9, -4.5};

        Arrays.sort(v); // coloca em ordem os vetores

        for (double valor: v) {
            System.out.println(valor + " ");
        }
    }
}
