import java.awt.*;

public class ResoluçãoDeTela {
    public static void main(String[] args) {
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension d = t.getScreenSize();

        System.out.println("Sua resolução de tela é: ");
        System.out.println(d.toString());
    }
}
