package Familia36;

import java.util.Scanner;

public class ArrayMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matriz = new int [3][3];
		int cont=0;
		
		Scanner entrada = new Scanner(System.in);
		
		for(int linha=0;linha<3;linha++)
		{
			for(int coluna=0;coluna<3;coluna++)
			{
				System.out.println("Digite um número: ");
				matriz[linha][coluna]=entrada.nextInt();
			}
		}
		
		for(int linha=0;linha<3;linha++)
		{
			for(int coluna=0;coluna<3;coluna++)
			{
				if(matriz[linha][coluna]>10){
				
				System.out.println(matriz[linha][coluna]+" é um valor maior que 10");
				cont++;
				}
			}
		}
		

		System.out.println("\nForam digitados "+cont+" números maiores que 10");
	}

}
