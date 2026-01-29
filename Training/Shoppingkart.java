import java.util.*;
import java.util.regex.*;
class User{
    String username;
    String password;
    User(String username,String password){
        this.username=username;
        this.password=password;
    }
    class Products{
        String name;
        int price;
        int quantity;
        Products(String name,int price, int quantity){
            this.name=name;
            this.price=price;
            this.quantity=quantity;
        }
    }
    

}
public class Shoppingkart {
    static Scanner sc=new Scanner(System.in);
    static List<User> users=new ArrayList<>();
    static User currentUser=null;

    static boolean p_val(String password){
        String pattern="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%&*!+=]).{8,}$";
        return Pattern.matches(pattern,password);
    }

    public static void main(String[] args){
        System.out.println("Enter Username");
        String uname=sc.nextLine();
        System.out.println("Enter password");
        String pwd=sc.nextLine();
  
        while(!p_val(pwd)){
            System.out.println("Password is not valid.Please try again");
            System.out.println("Password must contain 8 characters long,contains uppercase,lowercasr,special characters,digits.");
            pwd=sc.nextLine();

        }
        users.add(new User(uname,pwd));
        System.out.println("User added Successfully");

        boolean running=true;
        while(running){
            System.out.println("\n1.Registration \n2.Login \n3.Exit" );
            System.out.println("Enter your choice");
            int choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    register();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    System.out.println("Exiting!!");
                    running=false;
                    break;
                default:
                    System.out.println ("Invalid choice");
            }
        }
    }
    static void register(){
        System.out.println("Enter new Username");
        String uname=sc.nextLine();
        System.out.println("Enter new Password");
        String pwd=sc.nextLine();
        while(!p_val(pwd)){
            System.out.println("Password is not valid.Please try again");
            System.out.println("Password must contain 8 characters long,contains uppercase,lowercasr,special characters,digits.");
            pwd=sc.nextLine();

        }
        users.add(new User(uname,pwd));
        System.out.println("User added Successfully");

    }
    static void login(){
         System.out.println("Enter Username");
        String uname=sc.nextLine();
        System.out.println("Enter  Password");
        String pwd=sc.nextLine();
        while(!p_val(pwd)){
            System.out.println("Password is not valid.Please try again");
            System.out.println("Password must contain 8 characters long,contains uppercase,lowercasr,special characters,digits.");
            pwd=sc.nextLine();

        }
        for(User u: users){
            if(u.username.equals(uname) && u.password.equals(pwd)){
                currentUser=u;
                System.out.println("Login Successfully\n");
                menu();
                return;

            }
            System.out.println("Invalid ");

        }
    }
    static void menu(){
        System.out.println("************* Shoppinng Kart menu*************");
        boolean session=true;
        while(session){
            System.out.println("\n1.Available products \n2.Add to cart \n3.View cart \n4.  \n5.Logout" );
            System.out.println("Enter your choice"); 
            int choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    add Item();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    System.out.println("Exiting!!");
                    session=false;
                    break;
                default:
                    System.out.println ("Invalid choice");
            }
        }
    }
     
}
