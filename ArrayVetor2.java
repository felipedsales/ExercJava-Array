package Familia36;

import java.util.Scanner;

public class ArrayVetor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
		int[] A = new int[6];//declaração e alocação de espaço
		int somapar=0,somaimpar=0,pares=0,impares=0,cont = 0;
		
		
		
		for(int x=0;x<6;x++) 
		{
			System.out.println("Digite um numero");
			A[x]=entrada.nextInt();
		
			if(A[x]%2==0)
			{
				somapar+=A[x];	
			}
			
			else
			{
				somaimpar+=A[x];
				cont++;
				
			}	
		}
		for(int x=0;x<6;x++)
		{
			if(A[x]%2==0)
			{
				System.out.println("\nOs números pares são: "+A[x]);	
			}
			
			else
			{
				System.out.println("\nOs números ímpares são: "+A[x]);
			}	
		}
		System.out.println("\nA soma dos números pares é de: "+somapar);
		System.out.println("\nA quantidade de números ímpares é de: "+cont);
		
		
	}

}
