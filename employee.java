package exp2;
import java.io.*;
import java.util.*;
public class Employee {
int eno;
String ename;
float salary;
String desig;
int age;
 static String cname;
 public Employee(int eno,String ename,float salary,String desig,int age) {
 this.eno = eno;
 this.ename = ename;
 this.salary = salary;
 this.desig = desig;
 this.age = age;
 cname="PU"; }
 @Override
 public String toString() {
 return eno + " "+ ename + " " + salary + " " + desig + " " + age + " " + cname + "\n"; } }
class AgeComparator implements Comparator {
public int compare(Object o1, Object o2) {
Employee e1=(Employee)o1;
Employee e2=(Employee)o2;
if(e1.age==e2.age)
return 0;
else if(e1.age>e2.age)
return 1;
else
return -1; } }
class NameComparator implements Comparator{
public int compare(Object o1, Object o2) {
Employee e1=(Employee)o1;
Employee e2=(Employee)o2;
return e1.ename.compareTo(e2.ename); } }
class SalaryComparator implements Comparator {
public int compare(Object o1,Object o2) {
Employee e1=(Employee)o1;
Employee e2=(Employee)o2;
if(e1.salary==e2.salary)
return 0;
else if(e1.salary>e2.salary)
return 1;
else
return -1; } } 