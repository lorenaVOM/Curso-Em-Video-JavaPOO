package aula05;
public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	public void estadoAtual() {
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
			this.setSaldo(50);
		}
		else if (t == "CP") {
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso");
	}
	
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Essa conta não pode ser fechada porque ainda possui um saldo ativo. Para fechá-la, saque o dinheiro.");
		}
		else if (this.getSaldo() < 0) {
			System.out.println("Essa conta não pode ser fechada pois apresenta um débito.");
		}
		else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}
	
	public void depositar(float v) {
		if (this.getStatus() == true) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Depósito realizado na conta de " + this.getDono());
		}
		else {
			System.out.println("O depósito não pode ser realizado pois a conta está fechada.");
		}
	}
	
	public void sacar(float v) {
		if (this.getStatus() == true) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado da conta de " + this.getDono());
			}
			else if (this.getSaldo() < v) {
				System.out.println("O saque não pode ser realizado da conta de " + this.getDono());
			}
		}
		else {
			System.out.println("O saque não pode ser realizado pois a conta está fechada");
		}
	}
	
	public void pagarMensal() {
		int v = 0;
		if (this.getTipo() == "CC") {
			v = 12;
		}
		else if (this.getTipo() == "CP" ) {
			v = 20;
		}
		if (this.getStatus() == true) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso.");
		}
		else {
			System.out.println("A conta está fechada e não pode ser paga.");
		}
	}
	
	public ContaBanco() {
		this.saldo = 0;
		this.status = false;
	}
	
	public int getNumConta() {
		return this.numConta;
	}
	
	public void setNumConta(int n) {
		this.numConta = n;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setTipo(String t) {
		this.tipo = t;
	}
	
	public String getDono() {
		return this.dono;
	}
	
	public void setDono(String d) {
		this.dono = d;
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(float s) {
		this.saldo = s;
	}
	
	public boolean getStatus() {
		return this.status;
	}
	
	public void setStatus(boolean st) {
		this.status = st;
	}
}
