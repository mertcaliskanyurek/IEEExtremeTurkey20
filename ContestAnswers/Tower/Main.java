import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Hashtable<Integer,Integer> table = new Hashtable<Integer,Integer>();
        
        int n = s.nextInt();
        int nextInt = 0;
        Integer oldValue = null;

        int best = 1; // en azından bir tane kule geleceğini var sayıyoruz
        for(int i=0;i<n;i++)
        {
            nextInt = s.nextInt();
            oldValue = table.put(nextInt, 1);
            if(oldValue != null){   //eğer daha önce aynı uzunlukta deger varsa
                
                oldValue++;
                table.put(nextInt, oldValue);
                
                if(oldValue>best)   //eğer bu değer en uzun çubuktan uzunsa
                    best = oldValue; 
                
            }
        }

        System.out.print(best + " " + table.size());
        
        s.close();
    }

}