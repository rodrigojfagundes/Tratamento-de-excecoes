package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("informe os dados da conta");
		System.out.println("numero");
		int number = sc.nextInt();
		System.out.println("titular");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("saldo inicial");
		double balance = sc.nextDouble();
		System.out.println("limite de saque");
		double withdrawLimit = sc.nextDouble();

		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.println("informe a quantia para sacar");

		double amount = sc.nextDouble();
		
		if(amount > acc.getWithdrawLimit()) {
			System.out.println("erro de saque: a quantia excede o limite de saque");
		} 

		else if (amount > acc.getBalance()){
			System.out.println("erro de saque: saldo insuficiente");
		}

		else {
		acc.withdraw(amount);
		System.out.printf("novo saldo: %.2f%n", acc.getBalance());
		}
	}
}
