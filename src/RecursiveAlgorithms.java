public class RecursiveAlgorithms {

    // Algoritmo ricorsivo binary Search
    public static boolean binarySearch(int[] data, int target, int low, int high){
        if (low>high){
            return false;
        }
        else {
            int mid = (low+high)/2;
            if (target==data[mid]){
                return true;
            } else if (target<data[mid]) {
                return binarySearch(data, target, low, mid-1);
            }else {
                return binarySearch(data, target, mid+1, high);
            }
        }
    }

    // Invertire elementi di un array
    public static void reverseArray(int[] data, int low, int high){
        if (low<high){
            int tmp=data[low];
            data[low]= data[high];
            data[high] = tmp;
            reverseArray(data, low+1, high-1);
        }
    }

    
}
