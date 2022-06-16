package aula02;
public class Aula02 {
	public static void main (String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "Stabilo";
		c1.cor = "Azul";
		//c1.ponta = 0.5f; (dá erro pq é um atributo privado, para funcionar devemos usar o método set e get)
		c1.tampada = false;
		c1.status();
		c1.tampar();
		c1.status();
		c1.rabiscar();
		c1.destampar();
		c1.status();
		c1.rabiscar();
		
		Caneta c2 = new Caneta();
		c2.modelo = "Bic";
		c2.cor = "Preta";
		c2.tampada = true;
		c2.status();
		c2.destampar();
		c2.rabiscar();
	}
}
