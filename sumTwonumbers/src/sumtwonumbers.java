import java.util.Scanner;
public class sumtwonumbers {
    static boolean twonums(int n1,int n2){
        System.out.println("The Two numbers = ");
        if ((n1+n2)==10||n1==10||n2==10){
            System.out.println("True");
            return true;
        }else{
            System.out.println("False");
            return false;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number1,number2;
        System.out.println("Enter The First number: ");
        number1 = input.nextInt();
        System.out.println("Enter The Second number");
        number2 = input.nextInt();
        twonums(number1, number2);
    }
}
