import java.util.Hashtable;

class Main {
    public static void main(String[] args) {
        Hashtable<Integer,String> table = new Hashtable<>();
        table.put(1, "Mahmut");
        table.put(2,"Ayse");

        System.out.println(table.put(5,"Ali"));
        //System.out.println(table.get(1));
    }
}