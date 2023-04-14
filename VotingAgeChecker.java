import java.util.Scanner;

public class VotingAgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=scanner.nextInt();
        if (age>=18) {
            System.out.println("you are old enough to vote in national election");
        }else{
            System.out.println("you are not old enough to vote in national election");
        }
    }
    
}
