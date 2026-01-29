import java.util.*;
public class Quiz{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] questions={
            "who is your favourite hero?",
            "which number is even prime number?",
            "which type of person are you?"
        };
        String[][] options={
            {" A) Ramcharan " ,"B) Prabhas","C) N.T.R","D) Mahesh babu"},
            {"A) 2 ","B) 4","C) 6","D) 8"},
            {"A) Introvert","B) Extrovert", "C) Ambivert","D)Enthisiastic"}
        };
        int score=0;
        char[] answers={'A','A','C'};
        System.out.println("-------Welcome to Quiz--------");
        for(int i=0;i<questions.length;i++){
            System.out.println("\nQ"+(i+1)+":"+questions[i]);
            for(int j=0;j<3;j++){
                System.out.println(options[i][j]);
            }
            System.out.println("your answer: ");
            char userans=sc.next().toUpperCase().charAt(0);
            if(userans==answers[i]){
                System.out.println("your answer is correct");
                score++;
            }
            else{
                System.out.println("Your answer is not correct");
                System.out.println();
                System.out.println("Correctanswer "+answers[i]);
            }
        }
        System.out.println("------- Quiz Completed----------");
        System.out.println("your score is: "+score);

    }
    
}
