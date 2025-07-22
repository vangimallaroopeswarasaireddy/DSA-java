public class sumofdigits {
    
    public static void main(String[] args) {
        int n = 12345;
        int sum =0;
        
        int lastDigit = n % 10;
        sum += lastDigit;

        n = n / 10;
        lastDigit = n % 10;
        sum += lastDigit;
        n = n / 10;
        lastDigit = n % 10;
        sum += lastDigit;
        n = n / 10;
        lastDigit = n % 10;
        sum += lastDigit;
        n = n / 10;
        lastDigit = n % 10;
        sum += lastDigit;

        n = n / 10;
        lastDigit = n % 10;
        sum += lastDigit;
        n = n / 10;
        lastDigit = n % 10; 
        sum += lastDigit;
        n = n / 10;
        lastDigit = n % 10; 
        sum += lastDigit;
        n = n / 10;
        lastDigit = n % 10;
        sum += lastDigit;
        n = n / 10;
        System.out.println("Sum of digits: " + sum);
    }  
    
}
