//check whether a number is prime or not
import java.util.Scanner;
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    int isPrime = 1;
    if(num <= 1){
        isPrime = 0;
    } else {
    for(int i=2; i<=num/2; i++){
        if(num % i == 0){
            isPrime = 0;
            break;
        }
    }
    if(isPrime == 1){
        System.out.println(num + " is a prime number.");
    } else {
        System.out.println(num + " is not a prime number.");
    }
}