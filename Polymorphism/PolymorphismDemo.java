package Polymorphism;

class Calculator {
    void sum(int a, int b){
        System.out.println("sum is "+(a+b));
    }
    void product(int a, int b){
        System.out.println("product is "+(a*b));
    }
    void sum(int[] input){
        int sum = 0;
        for(int i : input) sum+=i;
        System.out.println("sum is "+sum);
    }
    void product(int[] input){
        int product = 1;
        for(int i : input) product*=i;
        System.out.println("total product is "+product);
    }
}
class FaultCalculator extends Calculator {

    
    void sum(int a, int b){
        System.out.println("sum is "+(a-b));
    }

    
    void product(int a, int b){
        System.out.println("product is "+(a+b));
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Calculator calcy = new Calculator();
        calcy.sum(5, 10);
        calcy.product(5, 10);

        int arr[] = {1,2,3,4,5};
        calcy.sum(arr);
        calcy.product(arr);

        calcy = new FaultCalculator();
        calcy.sum(5, 10);
        calcy.product(5, 10);
    }
}
