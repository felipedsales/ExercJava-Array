package Familia36;

public class ArrayVetor1 {

	public static void main(String[] args) {
		
		int[] A = {1,0,5,-2,-5,7};
		int soma;
		
		soma=A[0]+A[1]+A[5];
		System.out.println("A soma entre os valores das posições A[0], A[1] e A[5] do vetor é "+soma);
		
		A[4]=100;
		
		for(int x=0; x<6; x++)
		{
			System.out.println("\nO valor é de "+A[x]);
		}
		
		
		
	}
}
