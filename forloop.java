import java.util.Scanner;

public class forloop {
        public static void main(String[] args) {
        Scanner myobj =new Scanner(System.in);
        System.out.println("enter the element:");
        String a=myobj.nextLine();
        System.out.println(a);

        int sum=0;

        for(int i=1;i<=5;i++)
        {
            sum=+i;
        }
        System.out.println("Adding the a num is:"+sum);

        }   
    
}
