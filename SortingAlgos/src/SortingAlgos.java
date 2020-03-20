public class SortingAlgos {

    public int[] bubbleSort (int arr[])
    {
        for (int i=0; i < arr.length; i++) {
            for (int j=0; j < arr.length-1; j++) {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }   
            System.out.println("Iteration : " + i);    
        }
        return arr;
    }

    public int[] insertionSort (int arr[])
    {
        for (int i=1; i < arr.length; i++){
            int j;
            int temp = arr[i];
            for (j=i; j > 0 && arr[j-1] > temp; j--) {
                arr[j] = arr[j-1];
            }
                    
                arr[j] = temp;
        }
        return arr;
    }
}