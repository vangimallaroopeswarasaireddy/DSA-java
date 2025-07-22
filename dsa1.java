/*accept n int

it must prepend min no. of leading zeroes to the n int so that each int contains same no of digits... including the leading zeroes..

finally print the n revised ints.. and their sum as output...

sample case 1:

n = 5

input: enter 10 integers

output:



sum: 5697*/

public class dsa1 {
    public static void main(String[] args) {
        int n = 5;
        int[] numbers = {2, 548, 90, 4991, 66}; 
        
        int maxDigits = 0;
        for (int num : numbers) {
            int digits = String.valueOf(num).length();
            if (digits > maxDigits) {
                maxDigits = digits;
            }
        }

        int sum = 0;
        for (int num : numbers) {
            String formattedNumber = String.format("%0" + maxDigits + "d", num);
            System.out.println(formattedNumber);
            sum += num;
        }

        System.out.println("sum: " + sum);
    }
}
