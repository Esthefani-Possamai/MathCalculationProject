package trabalho;

import java.util.Random;

public class Funcoes {
	private double A;
	private double B;
	
	public Funcoes (double a,double b) {
		this.A=a;
		this.B=b;
	}
	
	public double aplicarDescontoNumValor() {
	double C=this.A-(this.A*(this.B/100));
	
		return C;
	}
	public double incrementarPorcAUmValor() {
	 
		double c=this.A+(this.A*this.B/100);
		return c;
	}
	
	public double XporcRepresentaDeY() {
		double C=(this.A*this.B)/100;
		
		return C;
	}
	
	public double XRepresentaDeYporc() {
	double c=(this.B/this.A)*100;
	return c;
	}
	
	//painel 5
	public double ValorAPagueiB () {
		double c = ((this.A-this.B)/this.A)*100;
	return c; 
	}
	
	//painel 6
	public double VariacaoDelta () {
		double c = ((this.B-this.A)/this.A)*100;
	return c; 
	}
	
	//painel 7
	public double QualValorOriginal () {
		double c = this.A*100/(100-this.B);
	return c; 
	}
	
	
	//painel 8 
	public double RegraDTres (double a, double b, double c) {
		double d = (c*b)/a;
	return d;
		
	}
	
	
	public String gerador(int Maisc,int Minu,int Simb,int Num,int qtda) {
        int op=0;int aux;
        String Maiusculo[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String Minusculo[]= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String simbolos[]= {"@","+","!","%","&","*","$","#"};
        String senha="";
        Random r=new Random();
        while(op<qtda) {
            if(Num==1 && senha.length() < qtda) {
                senha =senha+ r.nextInt(10);
                op++;
            }
            if(Maisc==1 && senha.length() < qtda) {
                aux=r.nextInt(8);
                senha=senha+Maiusculo[aux];
                op++;
            }
            if(Simb==1 && senha.length() < qtda) {
                aux=r.nextInt(8);
                senha=senha+simbolos[aux];
                op++;
            }
            if(Minu==1 && senha.length() < qtda) {
                aux=r.nextInt(8);
                senha=senha+Minusculo[aux];
                op++;
            }
        }
        return senha;
}
}