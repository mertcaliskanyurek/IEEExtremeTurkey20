
class Main {
    public static void main(String[] args)
    {
        //int arr[] = {25,10,5,30,40,2,18,7};
        int arr[] = {25,10,5,30,40,2,18,7,50,21,543,42,765,44,1};
        quickSort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.println(arr[i]);
        }
    }

    static void quickSort(int[] arr,int startIndex,int endIndex)
    {   
        if(startIndex>=endIndex)
            return;

        int j=startIndex -1;
        int pivot = arr[endIndex];
        for(int i=startIndex;i<endIndex;i++)
        {
            if(arr[i]<pivot)
            {
                j++;
                swap(arr,j,i);
            }
        }
        j++;
        swap(arr,j,endIndex);

        quickSort(arr, startIndex, j-1);
        quickSort(arr, j+1, endIndex);
    }

    static void swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
