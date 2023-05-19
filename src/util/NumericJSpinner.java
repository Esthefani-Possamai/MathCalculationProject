package util;
import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.NumberFormat;
import java.text.ParseException;

public class NumericJSpinner {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JFormattedTextField textField = createNumericTextField();
        frame.add(textField);

        frame.pack();
        frame.setVisible(true);
    }

    private static JFormattedTextField createNumericTextField() {
        NumberFormat format = NumberFormat.getIntegerInstance();
        NumberFormatter formatter = new NumberFormatter(format);
        formatter.setValueClass(Integer.class);
        formatter.setAllowsInvalid(false);

        JFormattedTextField textField = new JFormattedTextField(formatter);
        textField.setColumns(10);

        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Verifica se a tecla pressionada é um número
                if (!Character.isDigit(e.getKeyChar())) {
                    e.consume();  // Ignora a tecla digitada se não for um número
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // Não é necessário implementar
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // Não é necessário implementar
            }
        });

        return textField;
    }

	public void setBounds(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		
	}
}
