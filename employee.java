import java.util.*;
class employee
{
	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
employee e=new employee();
int a;
boolean b=false;
do
{
 System.out.println("1.create");
 System.out.println("2.display");
 System.out.println("3.raise");
 System.out.println("4.exit");
 System.out.println("enter urs number");
 a=sc.nextInt();
switch(a)
{
 case 1 : e.read();
            b=true;
            break;

case 2  :   if(b)
            e.display();
             else
              System.out.println("no records");
            break;
case 3  : 
           if(b)
             e.raiseSalary();
             else
              System.out.println("no records");
            break;


}
}while(a<4);
}
String name,designation;
int age,salary,b;
 void read()
{
Scanner sc=new Scanner(System.in);
 System.out.println("enter the name");
   name= sc.next();
System.out.println("enter the age");
   age= sc.nextInt();
System.out.println("enter the salary");
 salary= sc.nextInt();

System.out.println("enter the designation");
 designation= sc.next();
}
void display()
{
 
 System.out.println("name ="+name);
System.out.println("age ="+age);
System.out.println("salary ="+salary);
System.out.println("designation ="+designation);

}
 void raiseSalary()
{

  b=salary+1000;
 System.out.println("raisesalary ="+ b);

}
 

}