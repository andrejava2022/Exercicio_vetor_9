package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantas pessoas você vai digitar? ");
		int e = sc.nextInt();
		String nome[] = new String[e];
		int [] idade = new int[e];
		sc.nextLine();
		for(int i=0; i<e; i++) {
			System.out.println("Dados da "+(i+1)+"ª"+" pessoa:");
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			sc.nextLine();
		}
		
		int maisVelha = 0 ;
		
		for(int i=0; i<e; i++) {
			if(idade[i]>maisVelha) {
				maisVelha= idade[i];
				
			}
		}
		
		for(int i=0;i<e;i++ ) {
			if(idade[i]==maisVelha) {
				System.out.println("PESSOA MAIS VELHA: "+nome[i]);	
			}
		}
		
		sc.close();
	}

}
