import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = s.nextInt();
        
        int[] indexes = {0,0};
        boolean res = checkArr(arr, indexes);
        if(!res)
            System.out.println("no");
        else{
            System.out.println("yes");
            System.out.print((indexes[0]+1) + " " + (indexes[1]+1));
        }
    }

    static boolean checkArr(int[] arr, int[] indexes)
    {
        int left=0,right=0,i=1;

        while(i<arr.length-1 && arr[i]>arr[i-1])
            i++;

        if(i == arr.length-1)
            return true;

        left = i-1;

        while(i<arr.length-1 && arr[i]<arr[i-1])
            i++;
  
        right = i-1;

        reverse(arr, left, right);
        
        for(int java:arr)
            System.out.println(java);

        for(i=0;i<arr.length-1;i++)
            if(arr[i]>arr[i+1])
                return false;

        indexes[0] = left;
        indexes[1] = right;
        return true;
    }

    static void reverse(int[] arr,int left,int right)
    {
        while(left<right)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}