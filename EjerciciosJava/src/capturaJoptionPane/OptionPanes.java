package capturaJoptionPane;
import javax.swing.JOptionPane;

public class OptionPanes {
    public static void main(String[] args) {
        String nombre;

        nombre = JOptionPane.showInputDialog("ingrese su nombre");
        JOptionPane.showMessageDialog(null,"bienvenido, "+ nombre);
    }
}
