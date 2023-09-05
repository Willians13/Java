package vetor1;

public class Vetor1 {

	public static void main(String[] args) {
		int v[] = new int[10];

		for (int j = 0; j < v.length; j++) {
			v[j] = j;

			if (v[j] % 2 == 0) {
				System.out.println(v[j] + " - Par");
			} else {
				System.out.println(v[j] + " - Impar");
			}

		}

	}

}


