package rating900.evanescent;

import java.util.Scanner;

public class P2254B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {

			int n = sc.nextInt();
			String s = sc.next();

			int nGroups = 1;

			// quantidade de grupos na string original
			for (int i = 1; i < n; i++) {
				if (s.charAt(i) != s.charAt(i - 1)) {
					nGroups++;
				}
			}

			int ans = nGroups;

			for (int i = 1; i < n - 1; i++) {

				// se "ABA" cont = 3 e será possível remover "B" e sobrará um grupo cont-2
				// -2 pois Tira o do meio e a divisão entre os iguais das pontas
				// se as letras das pontas são iguais A|B|A|B e o do meio difente
				// ABAB temos resposta dois grupo só AA|B
				if (s.charAt(i - 1) == s.charAt(i + 1) && s.charAt(i) != s.charAt(i - 1)) {

					ans = Math.min(ans, nGroups - 2);

					// se em 3 letras consecutivas todas forem diferentes "ABC" podemos tirar
					// apenas 1 ou seja A|B|C = A|C
				} else if (s.charAt(i - 1) != s.charAt(i + 1) && s.charAt(i) != s.charAt(i - 1)
						&& s.charAt(i) != s.charAt(i + 1)) {

					ans = Math.min(ans, nGroups - 1);

				}
			}

			System.out.println(ans);
		}

		sc.close();
	}
}