public class Home {
    public static void main(String[] args) {

        int vetor1[] = {3, 7, 2, 8, 1, 6, 0, 9, 4, 5};
        int vetor2[] = {5, 4, 9, 0, 6, 1, 8, 2, 7, 3};

        InsertionSort a = new InsertionSort();
        BubbleSort b = new BubbleSort();


        a.InsertionSort(vetor1);
        b.BubbleSort(vetor2);

        System.out.println("Ordenando o vetor, atrevés do método InsertionSort:");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(vetor1[i]+"  ");
        }
        System.out.println();

        System.out.println("Ordenando o vetor, atrevés do método BubbleSort:");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print(vetor2[i]+"  ");
        }

    }
}

