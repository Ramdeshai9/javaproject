EMPLOYEE DETAILS
Simple Code written to take employee details.

Business logic(Service class) and Main class(Utilization) are written separately.

The Service class here is Emp class. The object of this class is created in the Main class(i.e, user class) and the user can make a choice from the give options.

Before creating the class in order for to take input from user we use Scanner class so importing Scanner is mandatory

    import java.util.Scanner;
EMP CLASS

In Emp class all the Parameters(states) are declared

       String name;
       String job; 
       Int name; 
       Int age;
Input is taken from the user by using Scanner object.(sc)

       Scanner sc=new Scanner(System.in);
And the methods(behaviours) to create the employee details are Emp(),display(),raiseSal are defined as follows

Emp()

Emp()
   {
    System.out.println("Enter your name:");
     name=sc.next();
    System.out.println("Enter your age:");
     age=sc.nextInt();
    System.out.println("Enter your sal:");
     sal=sc.nextInt();
    System.out.println("Enter your job:");
     job=sc.next();
    }
This method is written(used) to get the details of employees Like the name age,sal, job of the employee by using the methods in Scanner class like

        sc.next();            ->for a string value(for example job & name here)
    sc.nextInt();         ->for integer value
display()

    public void display()
     {
     System.out.println("Name:"+name);
     System.out.println("Age:"+age);
     System.out.println("Sal:"+sal);
     System.out.println("Job:"+job);
     }
This method is gives/displays the record of the employee created bu using Emp() method.

raiseSal

  public void raiseSal()
     {
     sal=(sal*10)/100;
     System.out.println("sal:"+sal);
     System.out.println("Salary raised by 10%");
     }
In this method the logic is written to make hike in salary by 10 percent. and the sal is displayed along with the message that the Salary is raised by 10%

MAIN CLASS In the Main class.... variable choice is declared in order to give user the choice to choose the options and a Boolen variable is declared.

 int choice=0;
 boolean b=false;
 Emp e=null;
In the main method we make use of nextInt() of Scanner class to take users choice(integer format)

      System.out.println("1.create\n 2.Display\n 3.Raise Sal\n 4.Exit\n Enter choice");
      choice=sc.nextInt();
1.Create 2.Display 3.Raise salary 4.Exit Enter choice are to be displayed as menu to the user so that the user can make a choice that is kept in iterative statement for user felxibility and the choices are kept in switch case.

do
{
 Scanner sc=new Scanner(System.in);
 System.out.println("1.create\n 2.Display\n 3.Raise Sal\n 4.Exit\n Enter choice");
 choice=sc.nextInt();

switch(choice)
{
 case 1:  e= new Emp();
          b=true;
          break;
 case 2: if(b)
         e.display();
         else
         System.out.println("no records");
         break;
 case 3: if(b)
         e.raiseSal();
         else
          System.out.println("no records");
         break;
 case 4:System.out.println("exiting..");
 default:System.out.println("Invalid choice);
 } 
 }while(choice>0 && choice<4);
In case 1 the Emp object is created and the user input is taken. The boolean value will become true when the use enters details..... code is written in such a way that when ever the employee details are created then only the display() and raiseSal are going to execute else it will simply show no records image
