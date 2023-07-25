import java.util.Scanner;


public class ArthExcep{

public static void main(String []args){

Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers");
int a=sc.nextInt();
int b=sc.nextInt();
double ans=0;
try{
        ans=a/b;
        System.out.println(ans);

}
catch(ArithmeticException e){
        System.out.println("Exception Caught");
}
//System.out.println(ans);
}

}
