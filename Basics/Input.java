import java.util.*;
public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a ");
        int a=sc.nextInt();
        sc.nextLine();
        System.out.println("enterd value of a is "+a);
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("enterd name is "+name);
        sc.close();
    }
}
