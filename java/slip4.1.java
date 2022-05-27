import java.util.Hashtable;
import java.util.Scanner;

public class slip4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hashtable<String,Integer> ht = new Hashtable<>();
        System.out.println("Enter the no of students=");
        int n= sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of the student=");
            String nm= sc.next();
            System.out.println("Enter the number=");
            int no= sc.nextInt();
            ht.put(nm, no);
        }
        System.out.println("The contact list is as follows\n"+ht);


    }
}
