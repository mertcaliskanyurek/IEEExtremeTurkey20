import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int c = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        double[] point = new double[n];

        for(int i=0;i<n;i++)
            values[i] = scanner.nextInt();

        for(int i=0;i<n;i++)
            weights[i] = scanner.nextInt();

        for(int i=0;i<n;i++)
            point[i] = (double)(values[i] /weights[i]);

        insertionSort(point,weights);
 
        for(int i=0; i<n; i++)
        {
            if((c-weights[i])>=0){
                System.out.println(weights[i]);
                c -= weights[i];
            }
        }
    }

    static void insertionSort(double[] arr,int[] weights)
    {
        for(int i=1;i<arr.length;i++)
        {
            int j = i-1;
            double pick = arr[i];
            int pickW = weights[i];
            while(j>=0 && arr[j]<pick)
            {
                arr[j+1] = arr[j];
                weights[j+1] = weights[j];
                j--;
            }

            arr[j+1] = pick;
            weights[j+1] = pickW;
        }
    }

}