package trabalho;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


public class Tela extends JFrame {
	
	private JLabel titleAllTela;
	private JPanel painel1;
	private JTextArea titletela;
	
	private JLabel labelinitialvalue;
	private JTextField initialvalue;
	
	private JLabel labeldesconto;
	private JLabel porcentagem;
	private JTextField descontotextfield;
	
	
	private JButton button;
	
//	criando uma tela grande, e dentro vou puxar os componentes
	public Tela () {
		titletela = new JTextArea();
		
		setSize(500,500);
		setTitle("Trabalho - Cálculos matemáticos");
		
		// Obtém o painel de conteúdo do JFrame
        Container contentPane = getContentPane();

        // Define a cor de fundo do painel de conteúdo
        contentPane.setBackground(new Color(242, 242, 242));
        
		setLayout(null);
		
		//setBackground(getColorModel(255,69,0));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		componentesCriar();
		setVisible(true);
	}
	
//	Aqui eu crio cada painel
	private void componentesCriar () {
		Font fontetitle = new Font( "Poppins", Font.PLAIN, 20);
		Font fontelabels = new Font( "Poppins", Font.PLAIN, 14);
		Color borderColor = new Color (156, 185, 188); // Cor verde em RGB
		Color background = new Color (242, 242, 242); //Cor areia de fundo
		
		titleAllTela = new JLabel("Cálculos matemáticos");
		titleAllTela.setBounds(20, 10, 300, 25);
		titleAllTela.setForeground( borderColor );
		titleAllTela.setFont(fontetitle);
		
		getContentPane().add(titleAllTela);
		
		
		//painel 1 
		painel1 = new JPanel();
		
		//dimensões
		painel1.setLayout(null);
		painel1.setBounds(20,50,300,180);
		
		//estilização
		painel1.setBackground(background);
		
		//borda
		int borderWidth = 3; // Espessura da borda em pixels
		String title = "Aplicar desconto % num valor"; // Título da borda

		
		Border matteBorder = BorderFactory.createMatteBorder(borderWidth, borderWidth, borderWidth, borderWidth, borderColor);
		Border titledBorder = BorderFactory.createTitledBorder(matteBorder, title);
		((TitledBorder) titledBorder).setTitleColor(borderColor);
		painel1.setBorder(titledBorder);
		((TitledBorder) titledBorder).setTitleFont(fontelabels);
		
		getContentPane().add(painel1);
			
			//Conteúdo que está dentro do Painel 1:
		
			//primeiro label + textfield
			labelinitialvalue = new JLabel("O valor inicial é de R$ ");
			labelinitialvalue.setBounds(20, 30, 165, 25);
			painel1.add(labelinitialvalue);
			labelinitialvalue.setFont(fontelabels);
			
			
			initialvalue = new JTextField();
			initialvalue.setBounds(175, 30, 100, 25);
			initialvalue.setBackground(background);
			Border customBorder = BorderFactory.createLineBorder(borderColor, 2 );
			initialvalue.setBorder(customBorder);
			painel1.add(initialvalue);
			
			//segundo label + textfield
			labeldesconto = new JLabel("O desconto é de ");
			labeldesconto.setBounds(50, 60, 165, 25);
			labeldesconto.setFont(fontelabels);
			painel1.add(labeldesconto);
			
			descontotextfield = new JTextField();
			descontotextfield.setBounds(175, 60, 100, 25);
			descontotextfield.setBackground(background);
			descontotextfield.setBorder(customBorder);
			painel1.add(descontotextfield);
			
			porcentagem = new JLabel("%");
			porcentagem.setBounds(280, 60, 25, 25);
			porcentagem.setFont(fontelabels);
			painel1.add(porcentagem);
			
			//Label da fórmula
			
			
			//Botão de envio de dados do painel 1
			button = new JButton();
			button.setText("Calcular");
			button.setFont(fontelabels);
			button.setBounds(175, 140,100,25);
			button.setBackground(background);
			button.setBorder(customBorder);
			
	        
			button.addMouseListener(new MouseAdapter() {
			    @Override
			    public void mouseClicked(MouseEvent e) {
			    	//quando o botão é clicado, eu pego o valor digitado em initialvalue e printo no console
			        System.out.println(initialvalue.getText());
			        System.out.println(descontotextfield.getText());
			    }
			});
			painel1.add(button);
			
			//Label do resultado
	}
	
	public static void main(String[] args) {
		new Tela();
	}
}
