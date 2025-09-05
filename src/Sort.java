import java.util.Arrays;

public class Sort {
    public static void insertionSort(int[] data){
        int n = data.length;
        for (int k=1; k<n; k++){
            int key = data[k];
            int j=k;
            while (j>0 && data[j-1]> key){
                data[j] = data[j-1];
                j--;
            }
            data[j] = key;
        }
    }

    public static void selectionSort(int[] data){
        int n= data.length;
        for (int step=0; step<n-1;step++){
            int min_idx=step;
            for (int i = step+1; i<n; i++){
                if (data[i]<data[min_idx]){
                    min_idx=i;
                }
            }
            int temp=data[step];
            data[step] = data[min_idx];
            data[min_idx] = temp;
        }
    }

    public static void bubbleSort(int[] data){
        int n = data.length;
        for (int k = 0; k < n-1; k++){
            for (int i = 0; i < n-k-1; i++){
                if (data[i]>data[i+1]){
                    int temp = data[i];
                    data[i] = data[i+1];
                    data[i+1] = temp;
                }
            }
        }
    }

    public static void mergeSort(int [ ] data){
        int n = data.length;
        if (n<2) return;
        int mid = n/2;
        int [] a1 = Arrays.copyOfRange(data, 0, mid);
        int [] a2 = Arrays.copyOfRange(data, mid, n);

        mergeSort(a1);
        mergeSort(a2);

        merge(a1,a2,data);
    }

    public static void merge(int [] f, int [] s, int[] arr){
        int i=0, j=0;
        while (i+j<arr.length){
            if (j==s.length || (i<f.length && f[i] < s[j])){
                arr[i+j] = f[i++];
            }else {
                arr[i+j] = s[j++];
            }
        }
    }

    public static void quickSort(int array[], int low, int high){
        if (low<high){
            int pi = partition(array, low, high);

            quickSort(array, low, pi-1);

            quickSort(array, pi+1, high);
        }
    }

    public static int partition(int[] array, int low, int high){
        int pivot = array[high];
        int i = (low-1);
        for (int j = low; j < high; j++){
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high]=temp;
        return (i+1);
    }
}