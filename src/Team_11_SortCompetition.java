public class Team_11_SortCompetition {

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

    public void merge(int[] arr, int left, int mid,int right, int[] temp){
        int i = left;
        int j = mid + 1;
        int k = left;
        while( i <+ mid && j <= right){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
            }
            k++;
        }
        while(i <= mid){
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j <= mid){
            temp[k] = arr[j];
            j++;
            k++;
        }
        for(int a = left; a < right; a++){
            arr[a] = temp[a];
        }
    }

    public static int[] randomArray(int num)
    {
        int[] Array = new int[num];
        for(int i = 0; i < Array.length;i++)
        {
            Array[i] = (int)(Math.random()*10);
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
