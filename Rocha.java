package first_project;

import java.util.Scanner;
import java.util.Locale;

public class Rocha {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float peso = 0, pesoTotal = 0;
		int contGuardado = 0;

		System.out.println("___________________°-°_________________");
		System.out.println("___________HOLA__________");
		System.out.println("EU SOU O CURIOSITY 2.0!");
		System.out.println("IREI FAZER AS ANÁLISES DAS ROCHAS COLETADAS!");
		System.out.println("___________________°-°_________________");

		int contAmostra = 1;
		while (contAmostra <= 6) {
			System.out.println("Informe o peso da amostra em KG: ");
			peso = sc.nextFloat();
			if (peso > 2.5) {
				System.out.println("Mineral Raro encontrado e guardado!");
				pesoTotal += peso;
				contGuardado++;
			} else {
				if ((peso == 2.5) || (peso < 2.5)) {
					System.out.println("Rocha comum, descartado!");
				}
			}
			contAmostra++;
		}

		System.out.println("O total de Rochas guardadas é " + contGuardado + ", e o seu peso total é de: " + pesoTotal);

		System.out.println("FIM DO PROGRAMA!");
		sc.close();
	}

}
