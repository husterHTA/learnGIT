import java.util.Scanner;

public class checkEvenness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if(x%2==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }
}
