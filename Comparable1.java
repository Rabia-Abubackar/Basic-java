import java.util.*;

class Car implements Comparable<Car>{
    int Modelno;
    String Modelname;
    String Owner;
    int year;


    Car(int Mno,String Mname,String Oname,int year){
        this.Modelno=Mno;
        this.Modelname=Mname;
        this.year=year;
        this.Owner=Oname;
    }

    public int compareTo(Car cr){
        if(year==cr.year)
            return 0;
        else if(year>cr.year)
            return 1;
        else
            return -1;
    }

}

public class Comparable1 {
    public static void main(String args[]){
        ArrayList<Car> al=new ArrayList<Car>();
        al.add(new Car(1000,"BMW","Faisal",2000));
        al.add(new Car(1013,"Mercedes Benz","Sathish",2000));
        al.add(new Car(1052,"Mini cooper","Kanu",2018));

        Collections.sort(al);
        for(Car cr:al){
            System.out.println(cr.Modelname+" "+cr.Modelno+" "+cr.year+" "+cr.Owner);
        }
    }
}
