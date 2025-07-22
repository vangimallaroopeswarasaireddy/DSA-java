import java.util.Scanner;
public class forloopinput {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int num=1; num <=n; num+=1){
            System.out.print(num);
        }
    }  
}