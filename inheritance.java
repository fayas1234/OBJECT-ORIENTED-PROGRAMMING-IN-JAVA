//Program to implement inheritance
import java.io.*;
class Employee
{
  String Name;
  int Age;
  String Phone_number;
  String Address;
  int Salary;
  public void print_Salary()
  {
    System.out.print(Salary);
  }
}

class Officer extends Employee
{
  String specialization;
  String department;
  public void print_Specialization()
  {
    System.out.print(specialization);
  }
  public void print_department()
  {
    System.out.print(department);
  }
}

class Manager extends Employee
{
  String specialization;
  String department;
  public void print_Specialization()
  {
    System.out.print(specialization);
  }
  public void print_department()
  {
    System.out.print(department);
  }

}
class Result
{
  public static void main(String args[])
  {
    System.out.println("NAME\t"+"|"+"AGE\t"+"|"+"PHONE
    NUMBER\t"+"|"+"ADDRESS\t\t\t\t"+"|"+"SALARY\t"+"|"+"SPECIALIZATION\t"+"|"+"DEPARTM
    ENT");
    System.out.println();
    System.out.println(" MANGER\n");
    Manager m=new Manager(); /*Creating object for the Manager class*/
    m.Name="Jacob";
    m.Age=35;
    m.Phone_number="9786215000";
    m.Address="24/50 Jacob Indira nagar,Kochi";
    m.Salary=50000;
    m.specialization="Managing";
    m.department="Operations";
    System.out.print(m.Name+"\t"+"|"+m.Age+"\t"+"|"+m.Phone_number+"\t"+"|"+m.Add
    ress+"\t\t"+"|");
    m.print_Salary();
    System.out.print("\t"+"|");
    m.print_Specialization();
    System.out.print("\t"+"|");
    m.print_department();
    System.out.println("\n");
    System.out.println(" OFFICER\n");
    Officer o=new Officer(); /*Creating object for the Officer class*/
    o.Name="Ram";
    o.Age=30;

    o.Phone_number="9786215123";
    o.Address="4/20 Ram Gandhi nagar,Kochi";
    o.Salary=35000;
    o.specialization="Demonstrating";
    o.department="Sales";
    System.out.print(o.Name+"\t"+"|"+o.Age+"\t"+"|"+o.Phone_number+"\t"+"|"+o.Addre
    ss+"\t\t"+"|");
    o.print_Salary();
    System.out.print("\t"+"|");
    o.print_Specialization();
    System.out.print("\t"+"|");
    o.print_department();
  }
}
