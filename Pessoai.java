package ComidaePeso;

public class Pessoai {

	
			String Nome;
			double peso;
			
			Pessoai (){
			
			}
			Pessoai (String Nome, double peso){
				this.Nome=Nome;
				this.peso=peso;
				
			}
			
			//void comer (){
				
			//	this.peso += Comidai.peso;
				
				
			//}
			void imprima(Comidai comidao, Pessoai p) {
				System.out.println("Meu nome é " + this.Nome);
				System.out.println("Meu peso atual é: " + this.peso);
			this.peso += Comidai.peso;
		   		System.out.println("Eu comi " + comidao.nome + " e estou pesando "  + this.peso + " atualmente");
			
			}
}
