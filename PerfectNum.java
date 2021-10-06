import java.util.Scanner;
public class PerfectNum{
    public static void main(String args[]){
         Scanner sc=new Scanner (System.in);
         System.out.println("Enter the max range of Perfect no.");
         int num=sc.nextInt();
         
            for(int i=1;i<=num;i++)
            { 
                int sum=0;
                for(int div=1;div<i;div++)
                {
                    if(i%div==0)
                    {
                        sum=sum+div;
                    }
                }
                if(sum==i)
                {
                  System.out.println(i+" is perfect number");
                } 
            }   
    }
}
