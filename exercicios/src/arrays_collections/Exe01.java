package arrays_collections;

import java.util.Scanner;

/**
   - Para fins de estudo e revisão
 */
public class Exe01 {
 public static void main(String[] args) {
  
	 Scanner sc = new Scanner(System.in);
	 int vetor[] = new int[10];
	 
	 for(int i=0; i<10; i++) {
		 
		 System.out.print("Digite um valor:");
		 int qtd = sc.nextInt();
		 vetor[i]= qtd;
	 }
	 
	 System.out.println(" Vetor - Imprimido  -");
	 for(int i=0; i<10;i++) {
		 System.out.print(vetor[i]+",");
	 }
	 
	 System.out.println();
	 int matriz[][] = new int[3][3];
	 
	 for(int i=0;i<3;i++) {
		 for(int j=0;j<3;j++) {
			 System.out.println("Digite o valor");
			 matriz[i][j] = sc.nextInt();
			 
		 }
	 }
	 
	 System.out.println(" -- Matriz Imprimida --");
	 for(int i=0;i<3;i++) {
		 for(int j=0;j<3;j++) {
			 System.out.print(matriz[i][j]);
		 }
		     System.out.println();
	 }
	 
 }
}
