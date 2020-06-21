public class Home {
    public static void main(String[] args) {
        int vetor[] = {3, 7, 2, 8, 1, 6, 0, 9, 4, 5};
        InsertionSort a = new InsertionSort();
        a.InsertionSort(vetor);
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}

