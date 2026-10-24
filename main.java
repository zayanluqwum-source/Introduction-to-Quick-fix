public class main{
    //Swap two elements
    static void sw(int[] arr, int i , int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    //Partition the array around the pivot
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j<high; j++){
            if(arr[j] <= pivot) {
                i++;
            }
        }
        sw(arr, i + 1, high);
        return i + 1;
    }

//Quick Sort method
    static  void quickSort(int[] arr, int low, int high);
        if (low < high) {
            int pivotIndex = partition(arr , low , high);
            quickSort(arr, low , pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }
static void printArray(int[] arr){

} 
