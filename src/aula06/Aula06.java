package aula06;
public class Aula06 {
	public static void main(String[] args) {
		ControleRemoto controle = new ControleRemoto();
		controle.ligar();
		controle.ligarMudo();
		controle.desligarMudo();
		controle.play();
		controle.maisVolume();
		controle.abrirMenu();
		controle.fecharMenu();
	}
	
}
