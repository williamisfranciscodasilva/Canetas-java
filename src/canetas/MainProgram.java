package canetas;

public class MainProgram {

	public static void main(String[] args) {
		
		Caneta c1 = new Caneta("NIC", "Amarelo", 0.4f, 20);
		c1.status();
		c1.tampar();
		c1.rabiscar();
		Caneta c2 = new Caneta("VIC", "Laranja", 1.2f, 15);
		c2.status();
		c2.tampar();
		c2.rabiscar();
	}

}
