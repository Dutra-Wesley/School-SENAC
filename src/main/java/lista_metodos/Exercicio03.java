package lista_metodos;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		double notasAlunos[] = new double[3];
		
		for (int i = 0; i < notasAlunos.length; i++) {
			System.out.print("Informe as notas do aluno: ");
			notasAlunos[i] = input.nextDouble();
		}
		
		System.out.print("Informe o tipo de cálculo, 1 ou 2: ");
		int tipoCalculo = input.nextInt();
		
		calcularMedia(notasAlunos, tipoCalculo);
		
		input.close();
	}

	static void calcularMedia (double notasAlunos[], int tipoCalculo) {
		
		if (tipoCalculo == 1) {
			double mediaAritmetica =0;
			for (int i = 0; i < notasAlunos.length; i++) {
				
				mediaAritmetica += notasAlunos[i];
				
			}
			
			System.out.println("A Média Aritmética é: " + mediaAritmetica/notasAlunos.length);
		}
		
		if (tipoCalculo == 2) {
			double nota1 =0;
			double nota2 =0;
			double nota3 =0;
			
			nota1 = notasAlunos[0];
			nota2 = notasAlunos[1];
			nota3 = notasAlunos[2];
			
			double mediaPonderada = (nota1*5) + (nota2*3) + (nota3*2);
			
			System.out.println("Sua média ponderada é: " + mediaPonderada / 10);
			
		}
		
	}
	
}
