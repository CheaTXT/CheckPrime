package TP04;
import java.util.Scanner;;
public class PrimeNumber {
    int number;
    int visible=1;

    PrimeNumber(int n){
        number = n;
    }
    boolean isPrime(){
        if(number<=1)   return false;
        for (int i=2; i<number; i++){
            if (number%i==0){
                visible = i;
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        PrimeNumber prime;
        System.out.println("Please Enter Number To Check Whether It is Prime Number:");
        prime = new PrimeNumber(cin.nextInt());
        if (prime.isPrime()){
            System.out.printf("%d is prime.",prime.number);
        }
        else{
            System.out.printf("%d is not prime, because it's divisible by %d.",prime.number, prime.visible);
        }
    }
}
