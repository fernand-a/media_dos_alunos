package mediaalunos;

import java.util.Scanner;

public class mediaalunos {

	public static void main(String[] args) {
	    
		Scanner leia = new Scanner(System.in);
		
		//declaracao variaveis
		float AC1 = (float) 0.15, AC2 = (float) 0.30, AG = (float) 0.10, AF = (float) 0.45, AC1nota, AC2nota, AGnota, AFnota;
		
		//exibicao de textos
		System.out.println("Nota AC1:");
		//atribuicao de valor
		AC1nota = leia.nextFloat();
		System.out.println("Nota AC2:");
		AC2nota = leia.nextFloat();
		System.out.println("Nota AG:");
		AGnota = leia.nextFloat();
		System.out.println("Nota AF:");
		AFnota = leia.nextFloat();
		
		//declaracao de variaveis matematicas
		float media = (AC1 * AC1nota) + (AC2 * AC2nota) + (AG * AGnota) + (AF * AFnota);
		
		//encerrando
		leia.close();
		
		//condicao
		if (media >= 5) {
			System.out.printf("Parabens, voce foi aprovado!", media);
			
		} else {
			System.out.printf("Aluno nao aprovado, estude mais!", media);
		}

	}

}
