package three_numbers_on_the_blackboard;

import java.util.Arrays;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int ans = 0;
		while (t-- > 0) {
			int[] vet = new int[3];

			vet[0] = sc.nextInt();
			vet[1] = sc.nextInt();
			vet[2] = sc.nextInt();

			Arrays.sort(vet);

			if (vet[0] + vet[1] < vet[2]) {
				ans = vet[1];
			} else {
				ans = vet[2] - vet[0];
			}
			System.out.println(ans);
		}

	}

}
