public class BubbleSort {
    int cont = 0;
    int aux, f;

        public void BubbleSort(int vetor[]) {
            while (cont != (vetor.length) - 1) {
                cont = 0;

                for (int i = 0; i < (vetor.length) - 1; i++) {
                    f = i + 1;
                    if (i != vetor.length) {
                        if (vetor[i] > vetor[f]) {
                            aux = vetor[i];
                            vetor[i] = vetor[f];
                            vetor[f] = aux;
                        } else {
                            cont++;
                        }
                    }
                }
            }
        }
    }
