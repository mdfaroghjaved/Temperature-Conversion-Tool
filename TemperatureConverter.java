import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConverter {
    public JFrame f;
    public JPanel panelMain;
    public JLabel lblCelsius;
    public JTextField textCelsius;
    public JLabel lblFahrenheit;
    public JTextField textFahrenheit;
    public JButton btnConvertCtoF;
    public JButton btnConvertFtoC;

    public static void main(String[] args) {
        // Setting up the Frame
        JFrame f = new JFrame("Temperature Converter");
        f.setSize(400, 100);
        f.setLayout(new FlowLayout());

        // Creating GUI ELements
        JLabel lblCelsius = new JLabel("Celsius : ");
        JTextField textCelsius = new JTextField(10);
        JLabel lblFahrenheit = new JLabel("Fahrenheit : ");
        JTextField textFahrenheit = new JTextField(10);

        JButton btnConvertCtoF = new JButton("Convert C to F");
        // Adding Action Listener
        btnConvertCtoF.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        // Convert C to F
                        String celsius = textCelsius.getText();
                        double c = Double.parseDouble(celsius);
                        double f = (c * 9 / 5) + 32;
                        textFahrenheit.setText(String.valueOf(f));
                    }
                }
        );

        JButton btnConvertFtoC = new JButton("Convert F to C");
        // Adding Action Listener
        btnConvertFtoC.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        // Convert F to C
                        String fahrenheit = textFahrenheit.getText();
                        double f = Double.parseDouble(fahrenheit);
                        double c = (f - 32) * 5 / 9;
                        textCelsius.setText(String.valueOf(c));
                    }
                }
        );

        // Adding GUI Elements to the Frame
        f.add(lblCelsius);
        f.add(textCelsius);
        f.add(lblFahrenheit);
        f.add(textFahrenheit);
        f.add(btnConvertCtoF);
        f.add(btnConvertFtoC);

        // Making the Frame Visible
        f.setVisible(true);
    }
}
