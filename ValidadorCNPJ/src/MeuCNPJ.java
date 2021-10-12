import packageCNPJ.ValidaCNPJ;
import java.util.Scanner;

public class MeuCNPJ {

	private static Scanner ler;

	public static void main(String[] args) {
		ler = new Scanner(System.in);

		String CNPJ;

		System.out.println("Digite o CNPJ (apenas n�meros): ");
		CNPJ = ler.next();

		System.out.println("\nCNPJ: ");

		if (ValidaCNPJ.eCNPJ(CNPJ) == true)
			System.out.printf("%s\n", ValidaCNPJ.mostraCNPJ(CNPJ));
		else
			System.out.printf("inv�lido, Tente novamente!!");
	}

}
