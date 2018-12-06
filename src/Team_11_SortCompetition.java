import java.util.Arrays;

public class Team_11_SortCompetition{ //implements Comparable<Team_11_SortCompetition>{

    public int value;

    public Team_11_SortCompetition(){
        this.value = (int)(Math.random()*10000);
    }

    static int findMedian(int[] values) {
        int median;
        // get count of scores
        int totalElements = values.length;
        // check if total number of scores is even
        if (totalElements % 2 == 0) {
            int sumOfMiddleElements = values[totalElements / 2] + values[totalElements / 2 - 1];
            // calculate average of middle elements
            median = (sumOfMiddleElements) / 2;
        } else {
            // get the middle element
            median = (values[values.length / 2]);
        }
        return median;
    }
    public static int StringSortandSearch(String[] arr, String given){
        int index = 0;
        StringMergeSort(arr);
        for(int i = 0; i < arr.length;i++){
            if(arr[i].equals(given)){
                index = i;
            }else{
                index = -1;
            }
        }
        return index;
    }

    public static int Sort2DArray(int[][] val){
        for(int i = 0; i < val.length; i++){
            MergeSort(val[i]);
        }
        int[] medians = new int[val.length];
        for(int j = 0; j < val.length; j++){
            medians[j] = val[j][(val.length-1)/2 ];
        }
        MergeSort(medians);
        return medians[(medians.length - 1)/2];
    }

    public static int partition(Thingy arr[], int left, int right){
        Thingy pivot = arr[right];
        int i = left - 1;
        for(int j = left; j < right; j++){
            if(arr[j].compareTo(pivot) <= 0){
                i++;
                Thingy val = arr[j];
                arr[j] = arr[i];
                arr[i] = val;
            }
        }
        Thingy val2 = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = val2;
        return  i + 1;
    }

    public static void quicksort(Thingy[] arr, int left, int right){
        if(left < right){
            int pivot = partition(arr, left, right);

            quicksort(arr, left, pivot - 1);
            quicksort(arr, pivot + 1, right);
        }
    }

    public static void StringMerge(String[] arr, int left, int mid,int right, String[] temp){
        int i = left;
        int j = mid + 1;
        int k = left;
        while( i <= mid && j <= right){
            if(arr[i].compareTo(arr[j]) < 0){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= mid){
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j <= right){
            temp[k] = arr[j];
            j++;
            k++;
        }
        for(k = left; k <= right; k++){
            arr[k] = temp[k];
        }
    }

    public static void StringMergeSortHelper(String[] elements, int from, int to, String[] temp){
        if(from < to){
            int middle = (from + to) / 2;
            StringMergeSortHelper(elements, from, middle, temp);
            StringMergeSortHelper(elements,middle+1,to,temp);
            StringMerge(elements, from, middle, to, temp);
        }
    }

    public static void StringMergeSort(String[] elements){
        int n = elements.length;
        String[] temp = new String[n];
        StringMergeSortHelper(elements,0,n-1,temp);
    }

    public static void merge(int[] arr, int left, int mid,int right, int[] temp){
        int i = left;
        int j = mid + 1;
        int k = left;
        while( i <= mid && j <= right){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= mid){
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j <= right){
            temp[k] = arr[j];
            j++;
            k++;
        }
        for(k = left; k <= right; k++){
            arr[k] = temp[k];
        }
    }

    public static void MergeSortHelper(int[] elements, int from, int to, int[] temp){
        if(from < to){
            int middle = (from + to) / 2;
            MergeSortHelper(elements, from, middle, temp);
            MergeSortHelper(elements,middle+1,to,temp);
            merge(elements, from, middle, to, temp);
        }
    }

    public static void MergeSort(int[] elements){
        int n = elements.length;
        int[] temp = new int[n];
        MergeSortHelper(elements,0,n-1,temp);
    }

    public static int[] randomArray(int num)
    {
        int[] Array = new int[num];
        for(int i = 0; i < Array.length;i++)
        {
            Array[i] = (int)(Math.random()*10000);
        }
        return Array;
    }

    public static int[][] random2DArray(int num, int val){
        int[][] Array = new int[num][val];
        for(int i = 0; i < Array.length; i++){
            for(int j = 0; j < Array[i].length; j++){
                Array[i][j] = (int)(Math.random()*10000);
            }
        }
        return Array;
    }

    public static String[] randomStringArr(int num)
    {
        String[] arr = new String[num];
        while(num > 0)
        {
            int i = 0;
            String s = "";
            while (i < num && s.length() < 5)
            {
                for(int a = 0; a < 5; a++) {
                    char c = (char) ((Math.random() * 26) + 97);
                    s = s + c;
                }
                i++;
            }
            num--;
            arr[num] = s;
        }
        return arr;
    }
}
