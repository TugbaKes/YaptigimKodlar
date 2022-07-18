package MartSoruUcPDF;

public class BubbleSort {
    private static void bubbleSort(int[] intDizisi){

        int n = intDizisi.length;
        int temp = 0;

        for(int i=0; i < n-1; i++){
            for(int j=0; j < (n-i-1); j++){

                if(intDizisi[j] > intDizisi[j+1]){
                    //elemanları yerdeğiştiriyoruz.
                    temp = intDizisi[j];
                    intDizisi[j] = intDizisi[j+1];
                    intDizisi[j+1] = temp;
                }

            }
        }



    }

    public static void main(String[] args) {
        int intDizisi1[] = new int[]{54,910,305,45,10,35};
        bubbleSort(intDizisi1);
        for (int sayi:intDizisi1) {
            System.out.print(sayi+" ");
        }
        System.out.println();
    }

}
