class Main {
    public static void main(String[] args) {
        System.out.println();
        int n = 4;
        int[] fib = new int[n];

        fib[0] = 1;
        fib[1] = 2;

        for(int i=2;i<n;i++)
            fib[i] = fib[i-1] + fib[i-2];
        
        System.out.println(fib[n-1]);
    }

    /*static int fib(int n,int[] arr)
    {
        if(n == 1 || n == 2)
            return n;
        
        return fib(n-1) + fib (n-2);
    }*/
}