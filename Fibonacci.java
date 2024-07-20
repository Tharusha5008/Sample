public class Fibonacci {
    public static void main(String[] args) {
        int arr[]={52,48,79,07,36,39};
       // bubblesort(arr);
      //  insert(arr);
        select(arr);
        printbubble(arr);
       
        
    }

    // Iterative method to calculate and print Fibonacci numbers
    public static void printbubble(int [] arr) {
      for(int i:arr){
          System.out.print(i+" ");
          
      }
      
    }

    private static void bubblesort(int[] arr) {
        int n = arr.length;
    for(int i =0; i<n-1; i++){
        for(int j=0; j<n-1;j++){
        if(arr[j]>arr[j+1]){
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1]=temp;
        }
        }
    }   
    }
    public static void insert(int[] arr){
    
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void select(int[]arr){
    int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
