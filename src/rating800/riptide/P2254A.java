package rating800.riptide;

import java.util.Arrays;
import java.util.Scanner;

public class P2254A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			short[] vet = new short[3];

			vet[0] = sc.nextShort();
			vet[1] = sc.nextShort();
			vet[2] = sc.nextShort();

			Arrays.sort(vet);

			int cont = 0;
			while (vet[0] != vet[1] && vet[1] != vet[2]) {
				vet[2]--;
				vet[0]++;
				cont++;
			}
			System.out.println(cont);
		}
		sc.close();
	}

}
