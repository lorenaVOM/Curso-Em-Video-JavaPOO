package aula04;
public class Caneta {
	public String modelo;
	private float ponta;
	public String cor;
	private boolean tampada;
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	public Caneta(String m, String c, float p) { //método construtor
		this.tampar();
		this.cor = c;
		this.modelo = m;
		this.setPonta(p);
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	public void setPonta(float p) {
		this.ponta = p;
	}
	
	public void status() {
		System.out.println("Sobre a caneta: ");
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Cor: " + this.cor);
		System.out.println("Tampada: " + this.tampada);
	}
}
