public class SelectionSort {
    int aux;

    public void SelectionSort(int[] v) {

        for (int i = 0; i < (v.length); i++) {
            for (int f = 0; f < (v.length); f++) {

                if (v[i] < v[f]) {
                    aux = v[i];
                    v[i] = v[f];
                    v[f] = aux;
                }
            }
        }
        for (int i = 0; i < (v.length); i++) {

            System.out.println(v[i]);
        }
    }
}