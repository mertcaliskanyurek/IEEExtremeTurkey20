import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int pre=0;
        for(int x=0;x<=n;x++){
            for(int y=0;y<=n;y++){
                if(((n-((a*x)+(b*y)))%c)==0){
                    int z=(n-((a*x)+(b*y)))/c;
                    if((x+y+z)>pre && z>=0){
                        pre=x+y+z;
                    }
                }
            }
        }
        System.out.println(pre);
    }
}