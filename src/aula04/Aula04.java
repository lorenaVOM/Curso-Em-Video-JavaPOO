package aula04;
public class Aula04 {
	public static void main(String[] args) {
		Caneta c1 = new Caneta("Stabillo", "Rosa", 0.6f); //(método construtor)
		//c1.setModelo("BIC"); (métodos setter)
		//c1.setPonta(0.5f);
		c1.status();
		
		System.out.print("Tenho uma caneta " + c1.getModelo()); // (métodos getter)
		System.out.print(" de ponta " + c1.getPonta());
	}
	
}
