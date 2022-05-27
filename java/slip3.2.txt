/* Accept ‘n’ integers from the user. Store and display integers in sorted order having 
proper collection class. The collection should not accept duplicate elements.*/

import java.util.*;
import java.io.*;

class slip1_1 {
    public static void main(String[] args) throws Exception {
        int no, element, i;
        Scanner sc= new Scanner(System.in);
        TreeSet ts = new TreeSet();
        System.out.println("Enter the no of elements :");
        no = sc.nextInt();
        System.out.println("Enter the elements : ");
        for (i = 0; i < no; i++) {
            element = sc.nextInt();
            ts.add(element);
        }

        System.out.println("The elements in sorted order :" + ts);
    }
}
