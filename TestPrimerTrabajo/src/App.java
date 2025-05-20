import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
       
        String cal1 = JOptionPane.showInputDialog("Primer calificación:");
        String cal2 = JOptionPane.showInputDialog("Segunda calificación:");
        String cal3 = JOptionPane.showInputDialog("Tercera calificación:");

    
        float c1 = Float.parseFloat(cal1);
        float c2 = Float.parseFloat(cal2);
        float c3 = Float.parseFloat(cal3);
       
        float promedio = (c1 + c2 + c3) / 3;

        JOptionPane.showMessageDialog(null, "El promedio es: " + promedio);
    }
}
