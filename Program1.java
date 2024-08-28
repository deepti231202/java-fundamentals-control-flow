import java.util.*;
public class Program1 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number");
        int n=sc.nextInt();
        if(n > 0)
        {
            System.out.println("Positive");
        }
        else if(n<0)
        {
            System.out.println("Negative");
        }
        else 
        {
            System.out.println("Zero");
        }
        
        System.out.println("Enter the number between 1 and 7 for the day of week");
        int day =sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day! Please enter a number between 1 and 7.");
        }
    

    for(int i=1;i<=n;i++){
        System.out.println(i+" ");
    }
    while(n!=0){
        System.out.println(n+" ");
        n--;
    }
    int j = 1;

    do {
        System.out.println(j);
        j++;
    } while (j <= 3);
}
}

