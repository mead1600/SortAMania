public class Team_11_SortCompetition {

    public static int StringSortandSearch(String[] arr, String given){
        String[] temp = new String[0];
        int index = 0;
        StringMergeSort(arr, 0, arr.length/2, arr.length-1, temp);
        for(int i = 0; i < arr.length;i++){
            if(arr[i].equals(given)){
                index = i;
            }else{
                index = -1;
            }
        }
        return index;
    }

    public static void StringMergeSort(String[] arr, int left, int mid,int right, String[] temp){
        int i = left;
        int j = mid + 1;
        int k = left;
        while( i <= mid && j <= right-1){
            if(arr[i].compareTo(arr[j]) > 0){
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

    public void mergeSort(int[] arr, int left, int mid,int right, int[] temp){
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
