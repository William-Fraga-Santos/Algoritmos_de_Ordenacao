public class home {
    public static void main(String[] args) {
        int vetor[] = {3, 7, 2, 8, 1, 6, 0, 9, 4, 5};
        int aux, i = 0;
        int f = 1;
        do {
            if (vetor[i] > vetor[f]) {
                aux = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = aux;

                if (i > 0) {
                    i--;
                    f--;
                }
            } else {
                i++;
                f = i + 1;
            }

        } while (i < (vetor.length) - 1);

        for (i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}

