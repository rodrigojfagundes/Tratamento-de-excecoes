package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		//criando o BLOCO TRY (para EXCECOES)
		try {
		
		String[] vect = sc.nextLine().split(" ");
		int position = sc.nextInt();

		System.out.println(vect[position]);
		}
		//bloco CATCH, em q vamos declarar a EXCECAO/ERRO e dizer qual vai ser o TRATAMENTO
		//para o erro
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid position");
		}
		catch (InputMismatchException e) {
			//quando der esse erro, vai mostrar a mensagem a baixo... e o software continua...
			System.out.println("Input error");
		}
		
		
		System.out.println("end of program");
		
		sc.close();
	}

}
