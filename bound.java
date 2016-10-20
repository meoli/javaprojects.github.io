package potato.SeriousSeries;
import java.util.Scanner;
public class bound
{
   public static void main(String[]args){
       Scanner scan=new Scanner(System.in);
       int x=0,y=0,temp=0,ave=0;
       System.out.print("From: ");
       x=scan.nextInt();
       System.out.print("To: ");
       y=scan.nextInt();
       for(int ct=x;ct<=y;ct++){
           temp=temp+ct;
           ave++;
       }
       System.out.print("Total: "+temp+" Average: "+(temp/ave));
   }
}
