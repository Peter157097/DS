package Calc;

public class App {

	public static void main(String[] args) {
		Matematica mat = new Matematica();

		do {
			mat.op();
			mat.ler();
			
			//SEM RETORNO SEM PARAMETRO
			if (mat.esc2==1) {
				mat.calculo();
				System.out.println("R = "+mat.r);
			}
			//SEM RETORNO COM PARAMETRO
			else if (mat.esc2==2) {
				mat.calculo1(mat.v1, mat.v2);
				System.out.println("R = "+mat.r);
			}
			//COM RETORNO SEM PARAMETRO
			else if (mat.esc2==3) {
				System.out.println("R = "+mat.calculo1());
			}
			//COM RETORNO COM PARAMETRO
			else if (mat.esc2==4) {
				if(mat.v1!=0 && mat.v2!=0) {
					System.out.println("R = "+mat.calculo(mat.v1,mat.v2));
				}else {
					System.out.println("Numero n pode ser divido por zero");
				}
				
			}else {
				System.out.println("Operador invalido");
			}
			mat.esc();
		
		}while(mat.escolha==1);
		
	}

}
