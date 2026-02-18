package exp1;
import java.io.Serializable;
public class Student implements Serializable
{
 int rno;
 String name;
 float fees;
public Student(int rno, String name, float fees)
{
 this.rno = rno;
 this.name = name;
 this.fees = fees;
}
public String toString()
{ return rno + " " + name + " "+ fees + "\n";
} }