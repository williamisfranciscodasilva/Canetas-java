package canetas;

import javax.swing.JOptionPane;

public class Caneta {
	String modelo, cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void status() {
		JOptionPane.showMessageDialog(null,"Modelo "+this.modelo+"\nUma caneta "+ this.cor+
				"\nPonta "+this.ponta+"\nCarga "+this.carga+"\nEst� tampada? "+ this.tampada);
		System.out.println("Modelo "+this.modelo);
		System.out.println("Uma caneta "+ this.cor);
		System.out.println("Ponta "+this.ponta);
		System.out.println("Carga "+this.carga);
		System.out.println("Est� tampada? "+ this.tampada);
	}
	
	void rabiscar() {
		if(this.tampada == true) {
			JOptionPane.showMessageDialog(null, "ERRO! N�o posso rabiscar");
			System.out.println("ERRO! N�o posso rabiscar");
		}
		else {
			JOptionPane.showMessageDialog(null, "Estou rabiscando");
			System.out.println("Estou rabiscando");
		}
	}
	
	void tampar() {
		this.tampada = true;
	}
	
	void destampar() {
		this.tampada =false;
	}
}
