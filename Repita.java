
import javax.swing.JOptionPane;
public class Repita {
    public static void main(String[] args) {

        int n, s = 0;
        int p, i, mv;
        int a = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: (valor 0 interrompe)"));

            s += n;

            p = s / 2;

            i = s / 3;

            a += 100;

            mv = s / 5;



        } while (n != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado: <br>-----------" + "<br>Total de valores: " + s +
                "<br>Total de pares: " + p +
                "<br>Total de ímpares: " + i +
                "<br>Acima de 100: " + a +
                "<br>Media dos valores: " + mv);

    }
}
