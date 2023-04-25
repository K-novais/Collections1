package ColecaoList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Exc1 {

	

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<String>();
		
		System.out.println("\nEntre com uma cor: ");
		
		  
		for(int i=0; i <5;i++) {
			System.out.printf("\nEscreva a %d a cor: ",i + 1);
			String cor = leia.nextLine();
			cores.add(cor);	
		}

		  System.out.println("\nCores digitadas: ");
		for(int i= 0;  i<cores.size();i++) {
			System.out.println(cores.get(i));
			
		}
		Collections.sort(cores);
		 System.out.println("\nCores digitadas em oredem crescente ");
		for(int i=0 ;i < cores.size(); i++) {
			System.out.println(cores.get(i));
			
		}
		 
            leia.close();

	}

}
