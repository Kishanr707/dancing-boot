package exp2;
import java.util.*;
public class Name {
public static void main(String[] args) {
// TODO Auto-generated method stub
ArrayList el=new ArrayList();
el.add(new Employee(1,"Shiva",10000.00f,"JE",18));
el.add(new Employee(2,"Venky",15000.00f,"SE",20));
el.add(new Employee(3,"Jesus",17000.00f,"JE",19));
el.add(new Employee(4,"Alla",12000.00f,"SE",19));
el.add(new Employee(5,"Budha",11000.00f,"JE",21));
System.out.println("Sorting by Name");
System.out.println("_______________");
Collections.sort(el,new NameComparator());
Iterator itr=el.iterator();
while(itr.hasNext()){
Employee e=(Employee)itr.next();
System.out.println(e);
}
System.out.println("Sorting by age");
System.out.println("______________");
Collections.sort(el,new AgeComparator());
Iterator itr2=el.iterator();
while(itr2.hasNext()) {
 Employee e=(Employee)itr2.next();
 System.out.println(e);
}
System.out.println("Sorting by Salary");
System.out.println("______________");
Collections.sort(el,new SalaryComparator());
Iterator itr1=el.iterator();
while(itr1.hasNext()){
Employee e=(Employee)itr1.next();
 System.out.println(e);
 }
}
}