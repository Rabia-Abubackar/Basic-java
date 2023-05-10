import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class set {
    public static void main(String args[]){

        HashSet<String> set=new HashSet<String>();
        LinkedHashSet<String> set1 = new LinkedHashSet<String >();
        TreeSet<String> set2 = new TreeSet<String>();
        set.add("Laddu");
        set.add("Halwah");
        set.add("rasagula");
        set.add("kajukatli");
        set.add("Halwah");

        set1.addAll(set);
        set2.addAll(set);

        System.out.println("\nHashset: \n");
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("\nLinkedhashset:\n");
        Iterator<String> itr1=set1.iterator();
        while(itr1.hasNext()) {
            System.out.println(itr1.next());
        }
        System.out.println("\nTreeset:\n");
        Iterator<String> itr2=set2.iterator();
        while(itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}


