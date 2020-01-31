class Main {
    public static void main(String[] args) {
        int[] arr = {2,5,7,10,18,25,30};
        System.out.println(recursiveBinarySearch(arr, 0, arr.length-1, 19));
        System.out.println(iterativeBinarySearch(arr, 19));
    }

    static boolean recursiveBinarySearch(int[] arr, int left, int right, int num)
    {
        if(left>right)
            return false;

        int mid = (int) (left+right)/2;
        if(num == arr[mid])
            return true;

        if(num > arr[mid])
            return recursiveBinarySearch(arr, mid+1, right, num);
        else
            return recursiveBinarySearch(arr, left, mid-1, num);
    }

    static boolean iterativeBinarySearch(int[] arr, int num)
    {
        int left = 0;
        int rigth = arr.length-1;

        do
        {
            int mid = (int)(left+rigth)/2;

            if(num == arr[mid])
                return true;
            
            if(num > arr[mid])
                left = mid+1;
            else
                rigth = mid-1;

        }while(left <= rigth);

        return false;
    }
}