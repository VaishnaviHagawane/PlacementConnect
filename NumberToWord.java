import java.util.Scanner;
public class NumberToWord
{   
    String func(int n){
        
        String str="";
        String[] ones={""," one"," two"," three"," four"," five"," six",
        " seven"," eight"," nine"," ten"," eleven"," twelve"," thirteen",
        " fourteen"," fifteen"," sixteen"," seventeen"," eighteen"," ninteen"};
        
        String[] tens={"",""," twenty"," thirty"," fourty"," fifty"," sixty"," seventy"," eighty"," ninty"," ninty","","",""};
         
        if(n<10)
            str=ones[n]; 
        else
            str=tens[n/10] + ones[n%10]; 
        //System.out.println(str);
        return str;
    }
    
    String convert(int n){
         String ss="";
        if(n<100) //tens
        {
            ss=func(n);
        }
        else if(n>=100 && n<1000)//hundred
        {
            ss=convert(n/100)+" hundred "+convert(n%100);
        }
        else if(n>=1000 && n<1000000)//thousand
        { 
            ss=convert (n/1000)+" thousand "+convert(n%1000);
        }
        else if(n>=1000000 && n<1000000000)//million
        {
            ss=convert(n/1000000)+" million "+convert(n%1000000);
        }
       
        return ss;
        
    }
    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number: ");
	    int num=sc.nextInt();
	    NumberToWord m=new NumberToWord();
	    System.out.println(m.convert(num));
	}
}

