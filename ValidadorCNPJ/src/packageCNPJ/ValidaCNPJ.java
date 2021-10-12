package packageCNPJ;

public class ValidaCNPJ {

	public static boolean eCNPJ(String CNPJ) {
		if (CNPJ.equals("00000000000000") || CNPJ.equals("11111111111111") || CNPJ.equals("22222222222222")
		 || CNPJ.equals("33333333333333") || CNPJ.equals("44444444444444") || CNPJ.equals("55555555555555")
		 || CNPJ.equals("66666666666666") || CNPJ.equals("77777777777777") || CNPJ.equals("88888888888888")
		 || CNPJ.equals("99999999999999") || (CNPJ.length() != 14))
			return (false);

		char digito13, digito14;
		int numero, multiplicador, resultado, i, resto;

	

			resultado = 0;
			multiplicador = 2;

			for (i = 11; i >= 0; i--) {
				numero = (int) (CNPJ.charAt(i) - 48);
				resultado = resultado + (numero * multiplicador);
				multiplicador = multiplicador + 1;
				if (multiplicador == 10)
					multiplicador = 2;
			}

			resto = resultado % 11;
			if ((resto == 0) || (resto == 1))
				digito13 = '0';
			else
				digito13 = (char) ((11 - resto) + 48);

			resultado = 0;
			multiplicador = 2;

			for (i = 13; i >= 0; i--) {
				numero = (int) (CNPJ.charAt(i) - 48);
				resultado = resultado + (numero * multiplicador);
				multiplicador = multiplicador + 1;
				if (multiplicador == 10)
					multiplicador = 2;
			}
			resto = resultado % 11;
			if ((resto == 0) || (resto == 1))
				digito14 = '0';
			else
				digito14 = (char) ((11 - resto) + 48);

			if ((digito13 == CNPJ.charAt(12)) && (digito14 == CNPJ.charAt(13)))
				return (true);
			else
				return (false);

	}

	public static String mostraCNPJ(String CNPJ) {
		return (CNPJ.substring(0, 2) + "." + CNPJ.substring(2, 5) + "." + CNPJ.substring(5, 8) + "/"
				+ CNPJ.substring(8, 12) + "-" + CNPJ.substring(12, 14));
	}

}
