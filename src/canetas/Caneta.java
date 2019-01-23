package canetas;

import javax.swing.JOptionPane;

public class Caneta {
	public String modelo, cor;
	private float ponta;
	protected int tubo;
	private boolean tampada;
	
	public Caneta(String m, String c, float p, int t) {
		this.modelo =m;
		this.cor =c ;
		this.ponta = p;
		this.tubo = t;
		
	}
	
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String m) {
		this.modelo = m;
	}
	public String getCor() {
		return this.cor;
	}
	public void setCor(String c) {
		this.cor = c;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	public void setPonta(float p) {
		this.ponta = p;
	}
	public int getTubo() {
		return this.tubo;
	}
	public void setTubo(int t) {
		this.tubo = t;
	}
	
	public void status() {
		
		JOptionPane.showMessageDialog(null,"Sobre a Caneta: "+"\nModelo "+this.modelo);
		System.out.println("Sobre a Caneta: ");
		System.out.println("Modelo "+this.getModelo());
		System.out.println("Ponta "+this.getPonta());
		System.out.println("Tubo "+this.getTubo());
		System.out.println("Cor "+this.cor);
		System.out.println("Tampada "+this.tampada);
		
	}
	
	public void rabiscar() {
		if(this.tampada == true) {
			JOptionPane.showMessageDialog(null, "ERRO! Não posso rabiscar");
			System.out.println("ERRO! Não posso rabiscar");
		}
		else {
			JOptionPane.showMessageDialog(null, "Estou rabiscando");
			System.out.println("Estou rabiscando");
		}
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada =false;
	}
	
}