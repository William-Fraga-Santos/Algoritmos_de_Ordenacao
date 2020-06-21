public class InsertionSort {
    int aux, i = 0;
    int f = 1;

 public void  InsertionSort(int[] vetor ){
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
}}
