/*
The program must accept an int n as the input the program must print the int from 1 - n based on the condition 
1.firdt line contains all the single digit numbers,2 line contains all the 2 digit numbers,3 line contians alla the 3 digit numbers
 */
public class dsa2 {
    public static void main(String [] args){
        int n = 10000;
        for (int i = 1; i <= n; i++){
            int digits = String.valueOf(i).length();
            if (digits == 1) { 
                System.out.print("  "+i);
            } else if (digits == 2) {
                System.out.print("    " + i);
            } else if (digits == 3) {
                System.out.println("Three digit numbers: " + i);
            } else if (digits == 4) {
                System.out.println("Four digit numbers: " + i);
            } else if (digits == 5) {
                System.out.println("Five digit numbers: " + i);
            } else if (digits == 6) {
                System.out.println("Six digit numbers: " + i);
            } else if (digits == 7) {
                System.out.println("Seven digit numbers: " + i);    
            } else if (digits == 8) {
                System.out.println("Eight digit numbers: " + i);
            } else if (digits == 9) {
                System.out.println("Nine digit numbers: " + i);
            } else if (digits == 10) {
                System.out.println("Ten digit numbers: " + i);
            } else {
                System.out.println("More than ten digits: " + i);
            } 
        }
    }
}
