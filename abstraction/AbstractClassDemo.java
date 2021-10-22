package abstraction;

abstract class Calculator {
    void basicSum(int a, int b){
        System.out.println("Sum is : "+(a+b));
    }
    void basicProduct(int a, int b){
        System.out.println("product is : "+(a*b));
    }
    abstract void advancedSum(int[] input);
    abstract void advancedProduct(int[] input);
}

class AdvancedCalcy extends Calculator {
  
    void advancedSum(int[] input) {
        int sum = 0;
        for(int i : input) sum+=i;
        System.out.println("total sum is "+sum);
        
    }

    void advancedProduct(int[] input) {
        int product = 1;
        for(int i : input) product*=i;
        System.out.println("total product is "+product);
        
    }

}


public class AbstractClassDemo {
    public static void main(String[] args) {
        AdvancedCalcy calcy = new AdvancedCalcy();
        calcy.basicSum(5, 10);
        calcy.basicProduct(5, 10);

        int arr[] = {1,2,3,4,5};
        calcy.advancedSum(arr);
        calcy.advancedProduct(arr);
    }
}
