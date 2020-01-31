class Main {
    public static void main(String[] args) {
        int arr[] = {5,7,1,3,9,8};
        insertionSort(arr);
        for(int i:arr)
            System.out.println(i);
    }

    static void insertionSort(int arr[])
    {
        int pick,j;
        for(int i=1;i<arr.length;i++)
        {
            j = i-1;
            pick = arr[i];
            while(j>-1 && arr[j]>pick)
            {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = pick;
        }
    }
}