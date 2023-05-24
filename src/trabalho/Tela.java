package trabalho;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.AbstractDocument;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import util.NumericAndLengthFilter;

public class Tela extends JFrame {
	
	private JLabel titleAllTela;
	private JPanel painel1;
	private JTextArea titletela;
	
	private JLabel labelinitialvalue;
	private JTextField initialvalue;
	
	private JLabel labeldesconto;
	private JLabel porcentagem;
	private JTextField descontotextfield;
	
	private JLabel formula;
	
	private JLabel textresult;
	private JLabel result;
	private JButton button;
	
	//-------------------------------------------
	
	private JPanel painel2;
	private JLabel labelinitialvalueP2;
	private JTextField initialvalueP2;
	
	private JLabel labeldescontoP2;
	private JLabel porcentagemP2;
	private JTextField descontotextfieldP2;
	
	private JLabel formulaP2;
	
	private JLabel textresultP2;
	private JLabel resultP2;
	private JButton buttonP2;
	
	//--------------------------------------------
	
	private JPanel painel3;
	private JLabel labelinitialvalueP3;
	private JTextField initialvalueP3;
	
	private JLabel labeldescontoP3;
	private JLabel porcentagemP3;
	private JTextField descontotextfieldP3;
	
	private JLabel formulaP3;
	
	private JLabel textresultP3;
	private JLabel resultP3;
	private JButton buttonP3;
	
	//--------------------------------------------
	
	
	private JPanel painel4;
	private JLabel labelinitialvalueP4;
	private JTextField initialvalueP4;
	
	private JLabel labeldescontoP4;
	private JLabel porcentagemP4;
	private JTextField descontotextfieldP4;
	
	private JLabel formulaP4;
	
	private JLabel textresultP4;
	private JLabel resultP4;
	private JButton buttonP4;
	
//---------------------------------------
	
	private JPanel painel5;
	private JLabel labelinitialvalueP5;
	private JTextField initialvalueP5;
	
	private JLabel labeldescontoP5;
	private JLabel porcentagemP5;
	private JTextField descontotextfieldP5;
	
	private JLabel formulaP5;
	
	private JLabel textresultP5;
	private JLabel resultP5;
	private JButton buttonP5;
	
	//----------------------------------
	
	private JPanel painel6;
	
	private JLabel labelinitialvalueP6;
	private JTextField initialvalueP6;
	
	private JLabel labeldescontoP6;
	private JLabel porcentagemP6;
	private JTextField descontotextfieldP6;
	
	private JLabel formulaP6;
	
	private JLabel textresultP6;
	private JLabel resultP6;
	private JButton buttonP6;
	
	//----------------------------------------
	
	private JPanel painel7;
	
	private JLabel labelinitialvalueP7;
	private JTextField initialvalueP7;
	
	private JLabel labeldescontoP7;
	private JLabel porcentagemP7;
	private JTextField descontotextfieldP7;
	
	private JLabel formulaP7;
	
	private JLabel textresultP7;
	private JLabel resultP7;
	private JButton buttonP7;
	
	//---------------------------------------
	private JPanel painel8;
	
	private JLabel alP8;
	private JTextField atfP8;
	
	private JLabel blP8;
	private JTextField btfP8;
	
	private JLabel r1lP8;
	private JTextField r1tfP8;
	
	private JLabel igualaP8;
	private JLabel igualbP8;
	
	private JLabel formulaP8;
	
	private JLabel textresultP8;
	private JLabel resultP8;
	private JButton buttonP8;
	
	//---------------------------------------
	
	private JPanel painel9;
	
	private JLabel maiuscula;
	private JLabel minuscula;
	private JLabel numeros;
	private JLabel simbolos;
	
	private JCheckBox Checkmaiuscula;
	private JCheckBox Checkminuscula;
	private JCheckBox Checknumeros;
	private JCheckBox Checksimbolos;
	
	private JLabel tamanho;
	private JSpinner senhatam;
	
	private JLabel senha;
	private JLabel resultsenha;
	
	private JButton buttonP9;
	
	//---------------------------------------
	
	//Variáveis dos resultados:
	String resultadoString1 = "";
	String resultadoString2 = "";
	String resultadoString3 = "";
	String resultadoString4 = "";
	String resultadoString5 = "";
	String resultadoString6 = "";
	String resultadoString7 = "";
	String resultadoString8 = "";
	String resultadoString9 = "";
	
	private class IntegerOnlySpinnerModel extends SpinnerNumberModel {
        public IntegerOnlySpinnerModel() {
            super(1, 1, Integer.MAX_VALUE, 1);
        }

        @Override
        public Object getNextValue() {
            Object value = super.getNextValue();
            return validateValue(value);
        }

        @Override
        public Object getPreviousValue() {
            Object value = super.getPreviousValue();
            return validateValue(value);
        }

        private Object validateValue(Object value) {
            if (value instanceof Integer) {
                int intValue = (int) value;
                if (intValue < 0) {
                    value = getNextValue();
                }
            }
            return value;
        }

        @Override
        public Object getValue() {
            Object value = super.getValue();
            return validateValue(value);
        }

        @Override
        public void setValue(Object value) {
            value = validateValue(value);
            super.setValue(value);
        }
    }
	
	
//	criando uma tela grande, e dentro vou puxar os componentes
	public Tela () {
		titletela = new JTextArea();
		setSize(1290,1000);
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
	
	private void componentesCriar () {
		
		
		Font fontetitle = new Font( "Poppins", Font.PLAIN, 20);
		Font fontelabels = new Font( "Poppins", Font.PLAIN, 14);
		Font fontelabelformula = new Font( "Poppins", Font.PLAIN, 12); //Fonte para a formula
		Color borderColor = new Color (156, 185, 188); // Cor verde em RGB
		Color background = new Color (242, 242, 242); //Cor areia de fundo
		Color formulaborda = new Color (230,230,230); //Cor de borda do label de fórmula
		Color colorfontformula = new Color  (176,176,176);
		Color resultcolor = new Color (191, 107, 33);
		
		//Padrão da posição do primeiro label + textfield
		Rectangle lt1 = new Rectangle(20, 30, 150, 25);
		Rectangle lt1text = new Rectangle(175, 30, 100, 25);
		//Padrão da posição do segundo label + textfield
		Rectangle lt2 = new Rectangle(20, 60, 150, 25);
		Rectangle lt2text = new Rectangle(175, 60, 100, 25);
		//Padrão da posição do símbolo de porcentagem se ela estiver na segunda posição
		Rectangle boundsporc = new Rectangle(280, 60, 25, 25);
		//Padrão da posição do resultado label + textfield
		Rectangle lt3 = new Rectangle(20, 90, 150, 25);
		Rectangle lt3text = new Rectangle(175, 90, 100, 25);
		//Padrão da posição do label da fórmula
		Rectangle lformula = new Rectangle(20, 125,255,30);
		//Padrão da posição do botão de calcular
		Rectangle boundsbut = new Rectangle(100, 165, 100, 25);
		
		//Componente do Painel 1
		titleAllTela = new JLabel("Cálculos matemáticos");
		titleAllTela.setBounds(20, 10, 300, 25);
		titleAllTela.setForeground( borderColor );
		titleAllTela.setFont(fontetitle);
		getContentPane().add(titleAllTela);
		
		//painel 1 
		painel1 = new JPanel();
		//dimensões
		painel1.setLayout(null);
		painel1.setBounds(20,50,300,205);
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
			labelinitialvalue = new JLabel("Valor inicial R$(a)");
			labelinitialvalue.setHorizontalAlignment(JLabel.RIGHT);
			labelinitialvalue.setBounds(lt1);
			painel1.add(labelinitialvalue);
			labelinitialvalue.setFont(fontelabels);
			
			
			initialvalue = new JTextField();
			((AbstractDocument) initialvalue.getDocument()).setDocumentFilter(new NumericAndLengthFilter(15));
			initialvalue.setBounds(lt1text);
			initialvalue.setBackground(background);
			Border customBorder = BorderFactory.createLineBorder(borderColor, 2 );
			initialvalue.setBorder(customBorder);
			painel1.add(initialvalue);
			
			//segundo label + textfield
			labeldesconto = new JLabel("% desconto (b)");
			labeldesconto.setHorizontalAlignment(JLabel.RIGHT);
			labeldesconto.setBounds(lt2);
			labeldesconto.setFont(fontelabels);
			painel1.add(labeldesconto);
			
			descontotextfield = new JTextField();
			((AbstractDocument) descontotextfield.getDocument()).setDocumentFilter(new NumericAndLengthFilter(15));
			descontotextfield.setBounds(lt2text);
			descontotextfield.setBackground(background);
			descontotextfield.setBorder(customBorder);
			painel1.add(descontotextfield);
			
			porcentagem = new JLabel("%");
			porcentagem.setBounds(boundsporc);
			porcentagem.setFont(fontelabels);
			painel1.add(porcentagem);

			//Label do resultado
			textresult = new JLabel("Resultado");
			textresult.setHorizontalAlignment(JLabel.RIGHT);
			textresult.setFont(fontelabels);
			textresult.setBounds(lt3);
			textresult.setForeground( resultcolor );
			painel1.add(textresult);
			
			result = new JLabel(resultadoString1);
			result.setHorizontalAlignment(SwingConstants.CENTER);
			result.setBounds(lt3text);
			result.setFont(fontelabelformula);
			Border customBorderResult = BorderFactory.createLineBorder(resultcolor, 2 );
			result.setBorder(customBorderResult);
			result.setForeground( resultcolor );
			painel1.add(result);
			
			//Label da fórmula
			formula = new JLabel ("v = a - (a * (b / 100)) ");
			formula.setHorizontalAlignment(SwingConstants.CENTER);
			formula.setBounds(lformula);
			formula.setFont(fontelabelformula);
			Border customBorderFormula = BorderFactory.createLineBorder(formulaborda, 2 );
			formula.setBorder(customBorderFormula);
			formula.setForeground( colorfontformula );
			painel1.add(formula);
			
			//Botão de envio de dados do painel 1
			button = new JButton();
			button.setText("Calcular");
			button.setHorizontalAlignment(SwingConstants.CENTER);
			button.setFont(fontelabels);
			button.setBounds(boundsbut);
			button.setBackground(background);
			button.setForeground( resultcolor );
			Border customBorderButton = BorderFactory.createLineBorder(resultcolor, 2 );
			button.setBorder(customBorderButton);
			
	        
			button.addMouseListener(new MouseAdapter() {
			    @Override
			    public void mouseClicked(MouseEvent e) {
			    	double a = Double.parseDouble(initialvalue.getText());
			    	double b = Double.parseDouble(descontotextfield.getText());	
			        Funcoes funcoes = new Funcoes(a,b);
			        double resultado = funcoes.aplicarDescontoNumValor();
			        resultadoString1 = String.valueOf(resultado); 
			        result.setText(resultadoString1);
			    }
			});
			painel1.add(button);
			
			
			
		//painel 2 
		painel2 = new JPanel();
		painel2.setLayout(null);
		painel2.setBounds(330,50,300,205);
		painel2.setBackground(background);
		String titleP2 = "Incrementar % a um valor";
		Border titledBorderP2 = BorderFactory.createTitledBorder(matteBorder, titleP2);
		((TitledBorder) titledBorderP2).setTitleColor(borderColor);
		painel2.setBorder(titledBorderP2);
		((TitledBorder) titledBorderP2).setTitleFont(fontelabels);
		getContentPane().add(painel2);
		
			//Conteúdo que está dentro do Painel 2:
			labelinitialvalueP2 = new JLabel("Valor inicial R$(a)");
			labelinitialvalueP2.setHorizontalAlignment(JLabel.RIGHT);
			labelinitialvalueP2.setBounds(lt1);
			painel2.add(labelinitialvalueP2);
			labelinitialvalueP2.setFont(fontelabels);
		
			initialvalueP2 = new JTextField();
			((AbstractDocument) initialvalueP2.getDocument()).setDocumentFilter(new NumericAndLengthFilter(15));
			initialvalueP2.setBounds(lt1text);
			initialvalueP2.setBackground(background);
			initialvalueP2.setBorder(customBorder);
			painel2.add(initialvalueP2);
			
			labeldescontoP2 = new JLabel("% do acréscimo (b)");
			labeldescontoP2.setHorizontalAlignment(JLabel.RIGHT);
			labeldescontoP2.setBounds(lt2);
			labeldescontoP2.setFont(fontelabels);
			painel2.add(labeldescontoP2);
			
			descontotextfieldP2 = new JTextField();
			((AbstractDocument) descontotextfieldP2.getDocument()).setDocumentFilter(new NumericAndLengthFilter(15));
			descontotextfieldP2.setBounds(lt2text);
			descontotextfieldP2.setBackground(background);
			descontotextfieldP2.setBorder(customBorder);
			painel2.add(descontotextfieldP2);
			
			porcentagemP2 = new JLabel("%");
			porcentagemP2.setBounds(boundsporc);
			porcentagemP2.setFont(fontelabels);
			painel2.add(porcentagemP2);
	
			textresultP2 = new JLabel("Resultado");
			textresultP2.setHorizontalAlignment(JLabel.RIGHT);
			textresultP2.setFont(fontelabels);
			textresultP2.setBounds(lt3);
			textresultP2.setForeground( resultcolor );
			painel2.add(textresultP2);
			
			resultP2 = new JLabel(resultadoString2);
			resultP2.setHorizontalAlignment(SwingConstants.CENTER);
			resultP2.setBounds(lt3text);
			resultP2.setFont(fontelabelformula);
			resultP2.setBorder(customBorderResult);
			resultP2.setForeground( resultcolor );
			painel2.add(resultP2);

			formulaP2 = new JLabel ("v = a + ((a * b) / 100)");
			formulaP2.setHorizontalAlignment(SwingConstants.CENTER);
			formulaP2.setBounds(lformula);
			formulaP2.setFont(fontelabelformula);
			formulaP2.setBorder(customBorderFormula);
			formulaP2.setForeground( colorfontformula );
			painel2.add(formulaP2);
			
			buttonP2 = new JButton();
			buttonP2.setText("Calcular");
			buttonP2.setHorizontalAlignment(SwingConstants.CENTER);
			buttonP2.setFont(fontelabels);
			buttonP2.setBounds(boundsbut);
			buttonP2.setBackground(background);
			buttonP2.setForeground( resultcolor );
			buttonP2.setBorder(customBorderButton);
			
			buttonP2.addMouseListener(new MouseAdapter() {
			    @Override
			    public void mouseClicked(MouseEvent e) {
                    double a = Double.parseDouble(initialvalueP2.getText());
                    double b = Double.parseDouble(descontotextfieldP2.getText());
                    Funcoes funcoes= new Funcoes(a,b);
                    double resultado2 = funcoes.incrementarPorcAUmValor();
                    resultadoString2 = String.valueOf(resultado2);
                    resultP2.setText(resultadoString2);
                    System.out.print("ok");
				}
			});
			painel2.add(buttonP2);
		
		//painel 3
		painel3 = new JPanel();
		painel3.setLayout(null);
		painel3.setBounds(640,50,300,205);
		painel3.setBackground(background);
		String titleP3 = "Quanto x% representa de y?"; 
		Border titledBorderP3 = BorderFactory.createTitledBorder(matteBorder, titleP3);
		((TitledBorder) titledBorderP3).setTitleColor(borderColor);
		painel3.setBorder(titledBorderP3);
		((TitledBorder) titledBorderP3).setTitleFont(fontelabels);
		getContentPane().add(painel3);
		
			//Conteúdo que está dentro do Painel 3:
			labelinitialvalueP3 = new JLabel("Total (a)");
			labelinitialvalueP3.setHorizontalAlignment(JLabel.RIGHT);
			labelinitialvalueP3.setBounds(lt1);
			painel3.add(labelinitialvalueP3);
			labelinitialvalueP3.setFont(fontelabels);
		
			initialvalueP3 = new JTextField();
			((AbstractDocument) initialvalueP3.getDocument()).setDocumentFilter(new NumericAndLengthFilter(15));
			initialvalueP3.setBounds(lt1text);
			initialvalueP3.setBackground(background);
			initialvalueP3.setBorder(customBorder);
			painel3.add(initialvalueP3);
			
			labeldescontoP3 = new JLabel("Porcentagem (b)");
			labeldescontoP3.setHorizontalAlignment(JLabel.RIGHT);
			labeldescontoP3.setBounds(lt2);
			labeldescontoP3.setFont(fontelabels);
			painel3.add(labeldescontoP3);
			
			descontotextfieldP3 = new JTextField();
			((AbstractDocument) descontotextfieldP3.getDocument()).setDocumentFilter(new NumericAndLengthFilter(15));
			descontotextfieldP3.setBounds(lt2text);
			descontotextfieldP3.setBackground(background);
			descontotextfieldP3.setBorder(customBorder);
			painel3.add(descontotextfieldP3);
			
			porcentagemP3 = new JLabel("%");
			porcentagemP3.setBounds(boundsporc);
			porcentagemP3.setFont(fontelabels);
			painel3.add(porcentagemP3);
	
			textresultP3 = new JLabel("Corresponde a");
			textresultP3.setHorizontalAlignment(JLabel.RIGHT);
			textresultP3.setFont(fontelabels);
			textresultP3.setBounds(lt3);
			textresultP3.setForeground( resultcolor );
			painel3.add(textresultP3);
			
			resultP3 = new JLabel(resultadoString3);
			resultP3.setHorizontalAlignment(SwingConstants.CENTER);
			resultP3.setBounds(lt3text);
			resultP3.setFont(fontelabelformula);
			resultP3.setBorder(customBorderResult);
			resultP3.setForeground( resultcolor );
			painel3.add(resultP3);
	
			formulaP3 = new JLabel ("v = (a * b) / 100");
			formulaP3.setHorizontalAlignment(SwingConstants.CENTER);
			formulaP3.setBounds(lformula);
			formulaP3.setFont(fontelabelformula);
			formulaP3.setBorder(customBorderFormula);
			formulaP3.setForeground( colorfontformula );
			painel3.add(formulaP3);
			
			buttonP3 = new JButton();
			buttonP3.setText("Calcular");
			buttonP3.setHorizontalAlignment(SwingConstants.CENTER);
			buttonP3.setFont(fontelabels);
			buttonP3.setBounds(boundsbut);
			buttonP3.setBackground(background);
			buttonP3.setForeground( resultcolor );
			buttonP3.setBorder(customBorderButton);
			
			buttonP3.addMouseListener(new MouseAdapter() {
			    @Override
			    public void mouseClicked(MouseEvent e) {
                    double a = Double.parseDouble(initialvalueP3.getText());
                    double b = Double.parseDouble(descontotextfieldP3.getText());
                    Funcoes funcoes= new Funcoes(a,b);
                    double resultado = funcoes.XporcRepresentaDeY();
                    resultadoString3 = String.valueOf(resultado);
                    resultP3.setText(resultadoString3);
				}
			});
			painel3.add(buttonP3);
		
		//painel 4
		painel4 = new JPanel();
		painel4.setLayout(null);
		painel4.setBounds(950,50,300,205);
		painel4.setBackground(background);
		String titleP4 = "Quanto x representa de y?"; 
		Border titledBorderP4 = BorderFactory.createTitledBorder(matteBorder, titleP4);
		((TitledBorder) titledBorderP4).setTitleColor(borderColor);
		painel4.setBorder(titledBorderP4);
		((TitledBorder) titledBorderP4).setTitleFont(fontelabels);
		getContentPane().add(painel4);
		
			//Conteúdo que está dentro do Painel 4:
			labelinitialvalueP4 = new JLabel("Total (a)");
			labelinitialvalueP4.setHorizontalAlignment(JLabel.RIGHT);
			labelinitialvalueP4.setBounds(lt1);
			painel4.add(labelinitialvalueP4);
			labelinitialvalueP4.setFont(fontelabels);
		
			initialvalueP4 = new JTextField();
			((AbstractDocument) initialvalueP4.getDocument()).setDocumentFilter(new NumericAndLengthFilter(15));
			initialvalueP4.setBounds(lt1text);
			initialvalueP4.setBackground(background);
			initialvalueP4.setBorder(customBorder);
			painel4.add(initialvalueP4);
			
			labeldescontoP4 = new JLabel("Parte (b)");
			labeldescontoP4.setHorizontalAlignment(JLabel.RIGHT);
			labeldescontoP4.setBounds(lt2);
			labeldescontoP4.setFont(fontelabels);
			painel4.add(labeldescontoP4);
			
			descontotextfieldP4 = new JTextField();
			((AbstractDocument) descontotextfieldP4.getDocument()).setDocumentFilter(new NumericAndLengthFilter(15));
			descontotextfieldP4.setBounds(lt2text);
			descontotextfieldP4.setBackground(background);
			descontotextfieldP4.setBorder(customBorder);
			painel4.add(descontotextfieldP4);
			
			porcentagemP4 = new JLabel("%");
			porcentagemP4.setBounds(boundsporc);
			porcentagemP4.setFont(fontelabels);
			painel4.add(porcentagemP4);
	
			textresultP4 = new JLabel("Corresponde a %");
			textresultP4.setHorizontalAlignment(JLabel.RIGHT);
			textresultP4.setFont(fontelabels);
			textresultP4.setBounds(lt3);
			textresultP4.setForeground( resultcolor );
			painel4.add(textresultP4);
			
			resultP4 = new JLabel(resultadoString4);
			resultP4.setHorizontalAlignment(SwingConstants.CENTER);
			resultP4.setBounds(lt3text);
			resultP4.setFont(fontelabelformula);
			resultP4.setBorder(customBorderResult);
			resultP4.setForeground( resultcolor );
			painel4.add(resultP4);
	
			formulaP4 = new JLabel ("v = (b / a) * 100");
			formulaP4.setHorizontalAlignment(SwingConstants.CENTER);
			formulaP4.setBounds(lformula);
			formulaP4.setFont(fontelabelformula);
			formulaP4.setBorder(customBorderFormula);
			formulaP4.setForeground( colorfontformula );
			painel4.add(formulaP4);
			
			buttonP4 = new JButton();
			buttonP4.setText("Calcular");
			buttonP4.setHorizontalAlignment(SwingConstants.CENTER);
			buttonP4.setFont(fontelabels);
			buttonP4.setBounds(boundsbut);
			buttonP4.setBackground(background);
			buttonP4.setForeground( resultcolor );
			buttonP4.setBorder(customBorderButton);
			
			buttonP4.addMouseListener(new MouseAdapter() {
			    @Override
			    public void mouseClicked(MouseEvent e) {
                    double a = Double.parseDouble(initialvalueP4.getText());
                    double b = Double.parseDouble(descontotextfieldP4.getText());
                    Funcoes funcoes= new Funcoes(a,b);
                    double resultado = funcoes.XRepresentaDeYporc();
                    resultadoString4 = String.valueOf(resultado);
                    resultP4.setText(resultadoString4);
				}
			});
			painel4.add(buttonP4);
	
		
		//painel 5
		painel5 = new JPanel();
		painel5.setLayout(null);
		painel5.setBounds(20,260,300,205);
		painel5.setBackground(background);
		String titleP5 = "Desconto(%) ao pagar B por A?"; 
		Border titledBorderP5 = BorderFactory.createTitledBorder(matteBorder, titleP5);
		((TitledBorder) titledBorderP5).setTitleColor(borderColor);
		painel5.setBorder(titledBorderP5);
		((TitledBorder) titledBorderP5).setTitleFont(fontelabels);
		getContentPane().add(painel5);
		
			//Conteúdo que está dentro do Painel 2:
			labelinitialvalueP5 = new JLabel("Valor original (a)");
			labelinitialvalueP5.setHorizontalAlignment(JLabel.RIGHT);
			labelinitialvalueP5.setBounds(lt1);
			painel5.add(labelinitialvalueP5);
			labelinitialvalueP5.setFont(fontelabels);
		
			initialvalueP5 = new JTextField();
			((AbstractDocument) initialvalueP5.getDocument()).setDocumentFilter(new NumericAndLengthFilter(15));
			initialvalueP5.setBounds(lt1text);
			initialvalueP5.setBackground(background);
			initialvalueP5.setBorder(customBorder);
			painel5.add(initialvalueP5);
			
			labeldescontoP5 = new JLabel("Valor c/ desconto (b)");
			labeldescontoP5.setHorizontalAlignment(JLabel.RIGHT);
			labeldescontoP5.setBounds(lt2);
			labeldescontoP5.setFont(fontelabels);
			painel5.add(labeldescontoP5);
			
			descontotextfieldP5 = new JTextField();
			((AbstractDocument) descontotextfieldP5.getDocument()).setDocumentFilter(new NumericAndLengthFilter(15));
			descontotextfieldP5.setBounds(lt2text);
			descontotextfieldP5.setBackground(background);
			descontotextfieldP5.setBorder(customBorder);
			painel5.add(descontotextfieldP5);
			
			porcentagemP5 = new JLabel("%");
			porcentagemP5.setBounds(boundsporc);
			porcentagemP5.setFont(fontelabels);
			painel5.add(porcentagemP5);

			textresultP5 = new JLabel("% desconto");
			textresultP5.setHorizontalAlignment(JLabel.RIGHT);
			textresultP5.setFont(fontelabels);
			textresultP5.setBounds(lt3);
			textresultP5.setForeground( resultcolor );
			painel5.add(textresultP5);
			
			resultP5 = new JLabel(resultadoString5);
			resultP5.setHorizontalAlignment(SwingConstants.CENTER);
			resultP5.setBounds(lt3text);
			resultP5.setFont(fontelabelformula);
			resultP5.setBorder(customBorderResult);
			resultP5.setForeground( resultcolor );
			painel5.add(resultP5);
	
			formulaP5 = new JLabel ("v = ((a - b) / a ) * 100");
			formulaP5.setHorizontalAlignment(SwingConstants.CENTER);
			formulaP5.setBounds(lformula);
			formulaP5.setFont(fontelabelformula);
			formulaP5.setBorder(customBorderFormula);
			formulaP5.setForeground( colorfontformula );
			painel5.add(formulaP5);
			
			buttonP5 = new JButton();
			buttonP5.setText("Calcular");
			buttonP5.setHorizontalAlignment(SwingConstants.CENTER);
			buttonP5.setFont(fontelabels);
			buttonP5.setBounds(boundsbut);
			buttonP5.setBackground(background);
			buttonP5.setForeground( resultcolor );
			buttonP5.setBorder(customBorderButton);
			
			buttonP5.addMouseListener(new MouseAdapter() {
			    @Override
			    public void mouseClicked(MouseEvent e) {
                    double a = Double.parseDouble(initialvalueP5.getText());
                    double b = Double.parseDouble(descontotextfieldP5.getText());
                    Funcoes funcoes= new Funcoes(a,b);
                    double resultado = funcoes.ValorAPagueiB();
                    resultadoString5 = String.valueOf(resultado);
                    resultP5.setText(resultadoString5);
				}
			});
			painel5.add(buttonP5);
		
		//painel 6
		painel6 = new JPanel();
		painel6.setLayout(null);
		painel6.setBounds(330,260,300,205);
		painel6.setBackground(background);
		String titleP6 = "Var. Delta: diferença % entre valores"; 
		Border titledBorderP6 = BorderFactory.createTitledBorder(matteBorder, titleP6);
		((TitledBorder) titledBorderP6).setTitleColor(borderColor);
		painel6.setBorder(titledBorderP6);
		((TitledBorder) titledBorderP6).setTitleFont(fontelabels);
		getContentPane().add(painel6);
		
			//Conteúdo que está dentro do Painel 6:
			labelinitialvalueP6 = new JLabel("Valor inicial (a)");
			labelinitialvalueP6.setHorizontalAlignment(JLabel.RIGHT);
			labelinitialvalueP6.setBounds(lt1);
			labelinitialvalueP6.setFont(fontelabels);
			painel6.add(labelinitialvalueP6);
		
			initialvalueP6 = new JTextField();
			 // Add the document filter to text field for numeric and length check.
	        ((AbstractDocument) initialvalueP6.getDocument()).setDocumentFilter(new NumericAndLengthFilter(15));
			initialvalueP6.setBounds(lt1text);
			initialvalueP6.setBackground(background);
			initialvalueP6.setBorder(customBorder);
			painel6.add(initialvalueP6);
			
			labeldescontoP6 = new JLabel("Valor final (b)");
			labeldescontoP6.setHorizontalAlignment(JLabel.RIGHT);
			labeldescontoP6.setBounds(lt2);
			labeldescontoP6.setFont(fontelabels);
			painel6.add(labeldescontoP6);
			
			descontotextfieldP6 = new JTextField();
			((AbstractDocument) descontotextfieldP6.getDocument()).setDocumentFilter(new NumericAndLengthFilter(15));
			descontotextfieldP6.setBounds(lt2text);
			descontotextfieldP6.setBackground(background);
			descontotextfieldP6.setBorder(customBorder);
			painel6.add(descontotextfieldP6);
			
			porcentagemP6 = new JLabel("%");
			porcentagemP6.setBounds(boundsporc);
			porcentagemP6.setFont(fontelabels);
			painel6.add(porcentagemP6);
	
			textresultP6 = new JLabel("Diferença %");
			textresultP6.setHorizontalAlignment(JLabel.RIGHT);
			textresultP6.setFont(fontelabels);
			textresultP6.setBounds(lt3);
			textresultP6.setForeground( resultcolor );
			painel6.add(textresultP6);
			
			resultP6 = new JLabel(resultadoString6);
			resultP6.setHorizontalAlignment(SwingConstants.CENTER);
			resultP6.setBounds(lt3text);
			resultP6.setFont(fontelabelformula);
			resultP6.setBorder(customBorderResult);
			resultP6.setForeground( resultcolor );
			painel6.add(resultP6);
	
			formulaP6 = new JLabel ("");
			formulaP6.setHorizontalAlignment(SwingConstants.CENTER);
			formulaP6.setBounds(lformula);
			formulaP6.setFont(fontelabelformula);
			formulaP6.setBorder(customBorderFormula);
			formulaP6.setForeground( colorfontformula );
			painel6.add(formulaP6);
			
			buttonP6 = new JButton();
			buttonP6.setText("Calcular");
			buttonP6.setHorizontalAlignment(SwingConstants.CENTER);
			buttonP6.setFont(fontelabels);
			buttonP6.setBounds(boundsbut);
			buttonP6.setBackground(background);
			buttonP6.setForeground( resultcolor );
			buttonP6.setBorder(customBorderButton);
			
			buttonP6.addMouseListener(new MouseAdapter() {
			    @Override
			    public void mouseClicked(MouseEvent e) {
                    double a = Double.parseDouble(initialvalueP6.getText());
                    double b = Double.parseDouble(descontotextfieldP6.getText());
                    Funcoes funcoes= new Funcoes(a,b);
                    double resultado = funcoes.VariacaoDelta();
                    resultadoString6 = String.valueOf(resultado);
                    resultP6.setText(resultadoString6);
				}
			});
			painel6.add(buttonP6);
		
		//painel 7
		painel7 = new JPanel();
		painel7.setLayout(null);
		painel7.setBounds(640,260,300,205);
		painel7.setBackground(background);
		String titleP7 = "Qual era o valor original?"; 
		Border titledBorderP7 = BorderFactory.createTitledBorder(matteBorder, titleP7);
		((TitledBorder) titledBorderP7).setTitleColor(borderColor);
		painel7.setBorder(titledBorderP7);
		((TitledBorder) titledBorderP7).setTitleFont(fontelabels);
		getContentPane().add(painel7);
		
			//Conteúdo que está dentro do Painel 7:
			labelinitialvalueP7 = new JLabel("Valor final R$ (a)");
			labelinitialvalueP7.setHorizontalAlignment(JLabel.RIGHT);
			labelinitialvalueP7.setBounds(lt1);
			labelinitialvalueP7.setFont(fontelabels);
			painel7.add(labelinitialvalueP7);
		
			initialvalueP7 = new JTextField();
			((AbstractDocument) initialvalueP7.getDocument()).setDocumentFilter(new NumericAndLengthFilter(15));
			initialvalueP7.setBounds(lt1text);
			initialvalueP7.setBackground(background);
			initialvalueP7.setBorder(customBorder);
			painel7.add(initialvalueP7);
			
			labeldescontoP7 = new JLabel("% desconto (b)");
			labeldescontoP7.setHorizontalAlignment(JLabel.RIGHT);
			labeldescontoP7.setBounds(lt2);
			labeldescontoP7.setFont(fontelabels);
			painel7.add(labeldescontoP7);
			
			descontotextfieldP7 = new JTextField();
			((AbstractDocument) descontotextfieldP7.getDocument()).setDocumentFilter(new NumericAndLengthFilter(15));
			descontotextfieldP7.setBounds(lt2text);
			descontotextfieldP7.setBackground(background);
			descontotextfieldP7.setBorder(customBorder);
			painel7.add(descontotextfieldP7);
			
			porcentagemP7 = new JLabel("%");
			porcentagemP7.setBounds(boundsporc);
			porcentagemP7.setFont(fontelabels);
			painel7.add(porcentagemP7);
	
			textresultP7 = new JLabel("Valor inicial");
			textresultP7.setHorizontalAlignment(JLabel.RIGHT);
			textresultP7.setFont(fontelabels);
			textresultP7.setBounds(lt3);
			textresultP7.setForeground( resultcolor );
			painel7.add(textresultP7);
			
			resultP7 = new JLabel(resultadoString7);
			resultP7.setHorizontalAlignment(SwingConstants.CENTER);
			resultP7.setBounds(lt3text);
			resultP7.setFont(fontelabelformula);
			resultP7.setBorder(customBorderResult);
			resultP7.setForeground( resultcolor );
			painel7.add(resultP7);
	
			formulaP7 = new JLabel ("v = (a * 100 / (100 - b))");
			formulaP7.setHorizontalAlignment(SwingConstants.CENTER);
			formulaP7.setBounds(lformula);
			formulaP7.setFont(fontelabelformula);
			formulaP7.setBorder(customBorderFormula);
			formulaP7.setForeground( colorfontformula );
			painel7.add(formulaP7);
			
			buttonP7 = new JButton();
			buttonP7.setText("Calcular");
			buttonP7.setHorizontalAlignment(SwingConstants.CENTER);
			buttonP7.setFont(fontelabels);
			buttonP7.setBounds(boundsbut);
			buttonP7.setBackground(background);
			buttonP7.setForeground( resultcolor );
			buttonP7.setBorder(customBorderButton);
			
			buttonP7.addMouseListener(new MouseAdapter() {
			    @Override
			    public void mouseClicked(MouseEvent e) {
                    double a = Double.parseDouble(initialvalueP7.getText());
                    double b = Double.parseDouble(descontotextfieldP7.getText());
                    Funcoes funcoes= new Funcoes(a,b);
                    double resultado = funcoes.QualValorOriginal();
                    resultadoString7 = String.valueOf(resultado);
                    resultP7.setText(resultadoString7);
				}
			});
			painel7.add(buttonP7);
			
			
			painel8 = new JPanel();
			painel8.setLayout(null);
			painel8.setBounds(20,470,455,205);
			painel8.setBackground(background);
			String titleP8 = "Regra de três"; 
			Border titledBorderP8 = BorderFactory.createTitledBorder(matteBorder, titleP8);
			((TitledBorder) titledBorderP8).setTitleColor(borderColor);
			painel8.setBorder(titledBorderP8);
			((TitledBorder) titledBorderP8).setTitleFont(fontelabels);
			getContentPane().add(painel8);
			
			
				alP8 = new JLabel("a:");
				alP8.setBounds(65, 40, 20,25);
				alP8.setFont(fontelabels);
				painel8.add(alP8);
			
				atfP8 = new JTextField();
				((AbstractDocument) atfP8.getDocument()).setDocumentFilter(new NumericAndLengthFilter(15));
				atfP8.setBounds(90, 40, 100,25);
				atfP8.setBackground(background);
				atfP8.setBorder(customBorder);
				painel8.add(atfP8);
				
				
				igualaP8 = new JLabel("=");
				igualaP8.setBounds(225, 40, 20,25);
				igualaP8.setFont(fontelabels);
				igualaP8.setForeground( borderColor );
				painel8.add(igualaP8);
				

				igualbP8 = new JLabel("=");
				igualbP8.setBounds(225, 75, 20,25);
				igualbP8.setFont(fontelabels);
				igualbP8.setForeground( borderColor );
				painel8.add(igualbP8);
				
				blP8 = new JLabel("b:");
				blP8.setBounds(65, 75, 20,25);
				blP8.setFont(fontelabels);
				painel8.add(blP8);
			
				btfP8 = new JTextField();
				((AbstractDocument) btfP8.getDocument()).setDocumentFilter(new NumericAndLengthFilter(15));
				btfP8.setBounds(90, 75, 100,25);
				btfP8.setBackground(background);
				btfP8.setBorder(customBorder);
				painel8.add(btfP8);
				
				r1lP8 = new JLabel("r1:");
				r1lP8.setBounds(265, 40, 20,25);
				r1lP8.setFont(fontelabels);
				painel8.add(r1lP8);
			
				r1tfP8 = new JTextField();
				((AbstractDocument) r1tfP8.getDocument()).setDocumentFilter(new NumericAndLengthFilter(15));
				r1tfP8.setBounds(290, 40, 100,25);
				r1tfP8.setBackground(background);
				r1tfP8.setBorder(customBorder);
				painel8.add(r1tfP8);
				
				textresultP8 = new JLabel("r2:");
				textresultP8.setFont(fontelabels);
				textresultP8.setBounds(265, 75, 20, 25);
				textresultP8.setForeground( resultcolor );
				painel8.add(textresultP8);
				
				resultP8 = new JLabel(resultadoString8);
				resultP8.setHorizontalAlignment(SwingConstants.CENTER);
				resultP8.setBounds(290, 75, 100, 25);
				resultP8.setFont(fontelabelformula);
				resultP8.setBorder(customBorderResult);
				resultP8.setForeground( resultcolor );
				painel8.add(resultP8);
				
				formulaP8 = new JLabel ("r2 = (r1 * b) / a");
				formulaP8.setHorizontalAlignment(SwingConstants.CENTER);
				formulaP8.setBounds(50,115,355, 30 );
				formulaP8.setFont(fontelabelformula);
				formulaP8.setBorder(customBorderFormula);
				formulaP8.setForeground( colorfontformula );
				painel8.add(formulaP8);
				
				buttonP8 = new JButton();
				buttonP8.setText("Calcular");
				buttonP8.setHorizontalAlignment(SwingConstants.CENTER);
				buttonP8.setFont(fontelabels);
				buttonP8.setBounds(150,160,150,25);
				buttonP8.setBackground(background);
				buttonP8.setForeground( resultcolor );
				buttonP8.setBorder(customBorderButton);
				
				buttonP8.addMouseListener(new MouseAdapter() {
				    @Override
				    public void mouseClicked(MouseEvent e) {
	                    double a = Double.parseDouble(atfP8.getText());
	                    double b = Double.parseDouble(btfP8.getText());
	                    double c = Double.parseDouble(r1tfP8.getText());
	                    Funcoes funcoes= new Funcoes(a,b);
	                    double resultado = funcoes.RegraDTres(a, b, c);
	                    resultadoString8 = String.valueOf(resultado);
	                    resultP8.setText(resultadoString8);
					}
				});
				painel8.add(buttonP8);
			
		//painel 9
			painel9 = new JPanel();
			painel9.setLayout(null);
			painel9.setBounds(485,470,455,205);
			painel9.setBackground(background);
			String titleP9 = "Gerador de senha"; 
			Border titledBorderP9 = BorderFactory.createTitledBorder(matteBorder, titleP9);
			((TitledBorder) titledBorderP9).setTitleColor(borderColor);
			painel9.setBorder(titledBorderP9);
			((TitledBorder) titledBorderP9).setTitleFont(fontelabels);
			getContentPane().add(painel9);
			
				maiuscula = new JLabel("Maiúsculas");
				maiuscula.setBounds(125, 30, 100,25);
				maiuscula.setFont(fontelabels);
				painel9.add(maiuscula);
				
				Checkmaiuscula = new JCheckBox();
				Checkmaiuscula.setBounds(100, 30, 25,25);
				Checkmaiuscula.setBackground(background);
				Checkmaiuscula.setBorder(customBorder);
				Checkmaiuscula.setBorder(customBorder);
				painel9.add(Checkmaiuscula);
				
				minuscula = new JLabel("Minúsculas");
				minuscula.setBounds(270, 30, 100,25);
				minuscula.setFont(fontelabels);
				painel9.add(minuscula);
				
				Checkminuscula = new JCheckBox();
				Checkminuscula.setBounds(245,30, 25,25);
				Checkminuscula.setBackground(background);
				Checkminuscula.setBorder(customBorder);
				painel9.add(Checkminuscula);
				
				numeros = new JLabel("Números");
				numeros.setBounds(125, 55, 100,25);
				numeros.setFont(fontelabels);
				painel9.add(numeros);
				
				Checknumeros = new JCheckBox();
				Checknumeros.setBounds(100,55, 25,25);
				Checknumeros.setBackground(background);
				Checknumeros.setBorder(customBorder);
				painel9.add(Checknumeros);
				
				
				simbolos = new JLabel("Símbolos");
				simbolos.setBounds(270, 55, 100,25);
				simbolos.setFont(fontelabels);
				painel9.add(simbolos);
				
				Checksimbolos = new JCheckBox();
				Checksimbolos.setBounds(245, 55, 25,25);
				Checksimbolos.setBackground(background);
				Checksimbolos.setBorder(customBorder);
				painel9.add(Checksimbolos);
				
				tamanho = new JLabel("Tamanho");
				tamanho.setBounds(100, 90, 100,25);
				tamanho.setFont(fontelabels);
				painel9.add(tamanho);
				
				JSpinner senhatam = new JSpinner(new IntegerOnlySpinnerModel());
				senhatam.setBounds(210, 90, 100, 25);
				painel9.add(senhatam);

				
				buttonP9 = new JButton();
				buttonP9.setText("Calcular");
				buttonP9.setHorizontalAlignment(SwingConstants.CENTER);
				buttonP9.setFont(fontelabels);
				buttonP9.setBounds(150,125,150,25);
				buttonP9.setBackground(background);
				buttonP9.setForeground( resultcolor );
				buttonP9.setBorder(customBorderButton);
				
				buttonP9.addMouseListener(new MouseAdapter() {

					@Override
				    public void mouseClicked(MouseEvent e) {
//						PARAMOS AQUI
						double a = 0;
						double b = 0;
						int Maisc;
						int Minu;
						int Simb;
						int Num;
						int qtda = (int) senhatam.getValue();
						
						if(Checkmaiuscula.isSelected()) {
							Maisc = 1;
						}else {
							Maisc = 0;
						}
						if(Checkminuscula.isSelected()) {
							Minu = 1;
						}else {
							Minu = 0;
						}
						if(Checksimbolos.isSelected()) {
							Simb = 1;
						}else {
							Simb = 0;
						}
						if(Checknumeros.isSelected()) {
							Num = 1;
						}else {
							Num = 0;
						}
						
						
						
				        Funcoes funcoes = new Funcoes(a, b);
				        String resultado = funcoes.gerador(Maisc,Minu,Simb,Num,qtda);
				        resultadoString9 = String.valueOf(resultado); 
				        resultsenha.setText(resultadoString9);
				    }
				});
				painel9.add(buttonP9);
				
				resultsenha = new JLabel(resultadoString9);
				resultsenha.setHorizontalAlignment(SwingConstants.CENTER);
				resultsenha.setBounds(50, 160, 355,25);
				resultsenha.setFont(fontelabelformula);
				resultsenha.setBorder(customBorderResult);
				resultsenha.setForeground( resultcolor );
				painel9.add(resultsenha);
		
	}
	
	public static void main(String[] args) {
		
		new Tela();
	}
}