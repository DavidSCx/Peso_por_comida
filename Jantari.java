package ComidaePeso;

import javax.swing.JOptionPane;

public class Jantari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoai p = new Pessoai();
		
		p.Nome=JOptionPane.showInputDialog("Digite o Nome");
		p.peso=Double.parseDouble(JOptionPane.showInputDialog("Digite o Peso"));
		
		Comidai c1 = new Comidai(null, 0);
		while (c1.nome != "0") {
		c1.nome=JOptionPane.showInputDialog("Digite o Nome da Comida");
		Comidai.peso=Double.parseDouble(JOptionPane.showInputDialog("Digite o Peso da Comida"));
		
		p.imprima(c1, p);
		
		}	
		
	}
}