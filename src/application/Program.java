package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		List<TaxPayer> list = new ArrayList<>();
				
		System.out.print("Quantos contribuintes voc� vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<n;i++) {
			System.out.println();
			System.out.println("Digite os dados do " + (i + 1) + "o contribuinte:");
			System.out.print("Renda anual com sal�rio: ");
			double salaryIncome = sc.nextDouble();
			System.out.print("Renda anual com presta��o de servi�o: ");
			double servicesIncome = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			double capitalIncome = sc.nextDouble();
			System.out.print("Gastos m�dicos: ");
			double healthSpending = sc.nextDouble();
			sc.nextLine();
			System.out.print("Gastos educacionais: ");
			double educationSpending = sc.nextDouble();
			sc.nextLine();
			
			TaxPayer TP = new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending);
			list.add(TP);
		
		}
		
		
		System.out.println();
		System.out.println("RELAT�RIO");
		System.out.println();
		
		
	    for(TaxPayer TaxPayer : list) {
		    sc.nextLine();
	        System.out.println(TaxPayer);
		 }
			
        sc.close();
	}

}
