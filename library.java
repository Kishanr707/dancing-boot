package exp4;
import java.util.*;
class Library{
 int bno;
 String bname;
 int duration;
 float amount;

 public Library(int bno, String bname, int duration, float amount) {
 super();
 this.bno = bno;
 this.bname = bname;
 this.duration = duration;
 this.amount = amount;
 }


 @Override
 public String toString() {
 return bno + " " + bname + " " + duration + " " + amount;
 }
}
public class Section {
 public static void main(String[] args) {
 List <Library> s = new ArrayList<Library>();
 s.add(new Library(1,"abc",20,20000.00f));
 s.add(new Library(2,"xyz",15,15000.00f));
 s.add(new Library(3,"def",10,10000.00f));

 System.out.println("Sorting on the basis of book name...");

 // implementing lambda expression
 Collections.sort(s,(s1,s2)->{return s1.bname.compareTo(s2.bname);});
 for(Library i:s){
 System.out.println(i);
 }
 System.out.println("Sorting by duration");

 Collections.sort(s,(s1,s2)-> s1.duration - s2.duration);
 s.forEach((l)->System.out.println(l));

 System.out.println("Sorting by Amount");

 Collections.sort(s,(s1,s2)-> (int)s1.amount - (int)s2.amount);
 s.forEach((l)->System.out.println(l));

 }
}