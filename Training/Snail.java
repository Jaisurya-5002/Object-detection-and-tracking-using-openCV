import java.util.*;
public class Snail {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int Bucket_Depth=sc.nextInt();
        int speed=sc.nextInt();
        int time=sc.nextInt();
        int Time_travelled=time*speed;
        int break_time=sc.nextInt();
        int tot_break=break_time*3;
        int time_remain=(Bucket_Depth-Time_travelled-break_time)/speed;
        int time_total=time+break_time+time_remain;
        System.out.println(time_total);
    }
    
}
