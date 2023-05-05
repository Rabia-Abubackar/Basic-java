
import java.util.*;
public class Arraylist {
    public static void main(String args[]) {
        //String
        ArrayList<String> car = new ArrayList<String>();
        LinkedList<String> books=new LinkedList<String>();
        Vector<String> vec = new Vector<String>();

        car.add("BMW");
        car.add("Benz");
        car.add("minicooper");
        car.add("jaquar");
        System.out.println(car);

        books.add("ponniyin selvan");
        books.add("Two states");
        books.add("red tea");
        System.out.println(books);

        vec.add("rabi");
        vec.add("kanu");
        vec.add("sathish");
        vec.add("faisal");
        System.out.println(vec);
        System.out.println("Size is: "+vec.size());

        //integer
        ArrayList<Integer> al = new ArrayList<Integer>();
        LinkedList<Integer>ml =new LinkedList<>();
        for (int i = 0; i <= 15; i++)
            al.add(i);
        for (int j=0;j<=10;j++)
            ml.add(j);
        System.out.println(al);
        System.out.println(ml);

        //iterator
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        //get
        System.out.println("Returning element: "+car.get(1));

        //set
        car.set(1,"Audi");

        for(String cars:car)
            System.out.println(cars);

        //add-vector
        vec.addElement("jaleela");
        vec.addElement("ria");
        vec.addElement("isha");
        System.out.println("Names are: "+vec);

        //size -vector
        System.out.println("Size is: "+vec.size());
        
    }
}
