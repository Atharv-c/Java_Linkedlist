/* Slip program 10a)  Write a java program to accept n employee details name from user 
 and store Them into linkedlist class and display them useing:
  A) iterator Interface B) ListIterator Interface(reversse order)
  demo program*/


import java.util.*;
import java.util.Scanner;

class Linkedemp {
    public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> empList = new LinkedList<String>();
        System.out.println("Enter number of employees:");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) 
        {
            System.out.println("Enter name of employee " + (i + 1) + ":");
            String name = sc.nextLine();
            empList.add(name);
        }

        System.out.println("\nEmployee names using Iterator:");
        Iterator<String> it = empList.iterator();
        while (it.hasNext())
            {
            System.out.println(it.next());
            }

        System.out.println("\nEmployee names in reverse order using ListIterator:");
        ListIterator<String> lit = empList.listIterator(empList.size());
        while (lit.hasPrevious())
        {
            System.out.println(lit.previous());
        }
    }

}
