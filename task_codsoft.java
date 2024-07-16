import java.util.Random;
import java.util.Scanner;
class mygame{
      public void iscorrectnumber(int we){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. ");
        int c=0;
        int num = sc.nextInt();
        do{if(num == we){
            c=c+2;
        }
        else{
            if(num > we){
                System.out.println("the no. is quite big");
                c=c+1;
                int p =sc.nextInt();
                num=p;
            }
            else{
                System.out.println("your no. is small");
                c=c+1;
                int p =sc.nextInt();
                num=p;
            }
        }
        }while(num!= we);
        System.out.println("NO. found with guesses "+ c);
        sc.close();
    }
    
}
public class task_codsoft{
    public static void main(String[] args) {
      mygame shivi = new mygame();
        Random random = new Random();
        int swe=random.nextInt(0,100);
        //System.out.println(swe);
        shivi.iscorrectnumber(swe);



    }
}
