import java.util.*;
import java.util.random.*;;
public class BillGenerator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Pizza Categories");
        System.out.println("1.Regular \n2.Special");
        System.out.println("Enter your choice2[1 or 2]:");
        int pizza_category=sc.nextInt();
        System.out.println("Pizza Types");
        System.out.println("1.veg1 \n2.Non-veg");
        int pizza_type=sc.nextInt();
        int total=0;
        if(pizza_category==1){
            if(pizza_type==1){
                total+=300;
            }
            else if (pizza_type==2){
                total+=400;
            }
            else{
                System.out.println("Select appropriate option0");
            }

        }
        else if(pizza_category==2){
            if(pizza_type==1){
                total+=600;
            }
            else if (pizza_type==2){
                total+=800;
            }
            else{
                System.out.println("Select appropriate option");
            }
        }
        else{
            System.out.println("Please select appropriate option");
            return;
        }
        System.out.println("Extra Cheese?[1.Yes or 2.No]:");
        int Extra_cheese=sc.nextInt();
        if(Extra_cheese==1){
            total+=100;
        }
        System.out.println("Extra Topping[1.Yes or 2.No]:");
        int Extra_Topping=sc.nextInt();
        if(Extra_Topping==1){
            total+=100;
        }
        System.out.println("Do you want Water Bottles?[1.Yes or 2.No]:");
        int Water_bottles=sc.nextInt();
        int num_bottles=sc.nextInt();
        if(Water_bottles==1){
            System.out.println("enter how many bottles:");
            total+=(20*num_bottles);
        }
        System.out.println("Do you want to Ketchup?[1.Yes or 2.No]:");
        int Ketchup=sc.nextInt();
        if(Ketchup==1){
            System.out.println("How many Packets?: ");
            int K_packets=sc.nextInt();
            total+=(5*K_packets);
        }
        System.out.println("Do you want to Softdrinks?[1.Yes or 2.No]:");
        int drinks=sc.nextInt();
        if(drinks==1){
            System.out.println("How many drinks?: ");
            int soft_drinks=sc.nextInt();
            total+=(75*soft_drinks);
        }
         System.out.println("Do you want Take Away[1.Yes or 2.No]:");
        int Parcel=sc.nextInt();
        if(Parcel==1){
            System.out.println("How many drinks?: ");
            int Take_Away=sc.nextInt();
            total+=(75*Take_Away);
        }
        sc.close();
        System.out.println(total);
    
    Random random=new Random();
    int random_numbers=random.nextInt(100000);
    System.out.println("-------------------------------");
    System.out.println("**********Pizza Bill Generator****************");
    System.out.println("-------------------------------");
    System.out.println("Bill Number :"+ random_numbers);
    int price=0;
    if(pizza_category==1){
        if(pizza_type==1){
            price+=300;
        }
        else if (pizza_type==2){
            price+=400;
        }
    }
    else if(pizza_category==2){
        if(pizza_type==1){
            price+=600;
        }
        else if (pizza_type==2){
            price+=800;
        }
    }
    System.out.println("------------------------------------------");
    System.out.println("Base Price     = "+price);
    if(Extra_cheese==1){
        System.out.println("Extra cheese     ="+100);
    }
    if(Extra_Topping==1){
        System.out.println("Extra Toppings     ="+100);
    }
    if(Water_bottles==1){
        System.out.println("water bottle x "+num_bottles+"          ="+num_bottles*20);
        System.out.println();
    }
    if()

    

    
}
