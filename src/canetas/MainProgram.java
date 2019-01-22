package canetas;

public class MainProgram {

	public static void main(String[] args) {
		
		Caneta c1 = new Caneta();
		c1.modelo = "Bic cristal";
		c1.cor = "Azul";
		//c1.ponta = 0.5f;
		c1.carga = 80;
		//c1.tampada = true;
		//c1.tampar();
		
		c1.status();
		c1.rabiscar();
		c1.destampar();
		
		Caneta c2 = new Caneta();
		c2.modelo = "Bic normal";
		c2.cor = "Preta";
		c2.destampar();
		
		c2.status();
		c2.rabiscar();
	}

}
