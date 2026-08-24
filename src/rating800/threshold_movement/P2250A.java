package rating800.threshold_movement;

import java.util.Scanner;

public class P2250A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int[] vet = new int[n];

			for (int i = 0; i < vet.length; i++) {
				vet[i] = sc.nextInt();
			}

			int maiorPar = 0;
			int menorImpar = Integer.MAX_VALUE;

			for (int i = 0; i < vet.length; i++) {

				if (i % 2 == 0) {
					menorImpar = Math.min(menorImpar, vet[i]);
				} else {
					maiorPar = Math.max(maiorPar, vet[i]);
				}

			}

			if (n > 1 && menorImpar - maiorPar > 1) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
}
