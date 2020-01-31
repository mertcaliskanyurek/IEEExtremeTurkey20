import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int[] banknotes = {100,20,10,5,1};
        int money = s.nextInt();
        int count = 0;
        for(int banknote:banknotes)
        {
            if(money == 0)
                break;
            
            if(money/banknote>0)
            {
                count += (int)money/banknote;
                money = money%banknote;
            }
        }
        
        System.out.println(count);
    }
}