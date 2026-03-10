import java.util.Scanner;
public class switchnumbers {
    static Scanner inputScanner = new Scanner(System.in);
    static int twonums(int n1,int n2){
        int Temp = n1;
        n1 = n2;
        n2 = Temp;
        System.out.println("The First number after = "+n1);
        System.out.println("The Second number after = "+n2);
        return n1;
    }
    public static void main(String[] args) {
        int n1;
        int n2;
        n1 = inputScanner.nextInt();
        System.out.println("The First number before = "+n1);
        n2 = inputScanner.nextInt();
        System.out.println("The Second number before = "+n2);
        twonums(n1, n2);
    }
}
