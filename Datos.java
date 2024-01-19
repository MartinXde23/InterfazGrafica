import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Datos extends JFrame {
    private JPanel panel1;
    private JTextField txtval1;
    private JTextField txtval2;
    private JButton saludarButton;
    private JButton sumarButton;
    private JButton cerrarButton;
    private JLabel val1;
    private JLabel val2;
    private JButton limpiarButton;
    private JTextField resultado;

    public Datos(){
        super("OPERACIONES");
        setContentPane(panel1);
        cerrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtval1.setText("");
                txtval2.setText("");
            }
        });
        sumarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double val1 = Double.parseDouble(txtval1.getText());
                    double val2 = Double.parseDouble(txtval2.getText());
                    double recibe_resultado = val1 + val2;
                    resultado.setText(Double.toString(recibe_resultado));
                }catch (Exception e1){
                    resultado.setText("No vale ingresar texto");
                }

            }
        });
        saludarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText("Hola");
            }
        });
    }
}
