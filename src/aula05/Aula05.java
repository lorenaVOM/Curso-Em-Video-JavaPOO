package aula05;
public class Aula05 {
	public static void main (String[] args) {
		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(001);
		p1.setDono("Lorena");
		//p1.estadoAtual();
		
		p1.abrirConta("CC");
		//p1.estadoAtual();
		
		p1.depositar(20);
		//p1.estadoAtual();
		
		p1.sacar(10);
		//p1.estadoAtual();
		
		p1.pagarMensal();
		//p1.estadoAtual();
		
		p1.fecharConta();
		//p1.estadoAtual();
		
		p1.sacar(48);
		p1.fecharConta();
		p1.estadoAtual();
		
	}
}
