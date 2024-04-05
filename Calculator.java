import java.util.*;
public class Calculator {

    public static void main(String[] args) {
        int a, b, c ;
        char symbol;
        Scanner s = new Scanner(System.in);

    System.out.println("Enter your 1st number");
    a=s.nextInt();
    System.out.println("Enter your 2nd number");
    b=s.nextInt();
    System.out.println("Enter your operator");
    char operator = s.next().charAt(0);
    switch ( operator) {
        case '+':
        {
            System.out.println(a+b);
        }
             break;
    case'-':
    {
        System.out.println(a-b);
    }
    break;
    case '*':
    {
        System.out.println(a*b);
    }
    break;
    case '/':
{
    System.out.println(a/b);
}  
 break;
    }
    
    }}