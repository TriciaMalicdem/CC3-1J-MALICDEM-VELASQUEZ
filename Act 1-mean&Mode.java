
package act2;
import java.util.Scanner;
public class act2 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("How many numbers will you input?");
            int num = sc.nextInt();
            
            int [] set = new int[num];
            int d = num;
    for (int i = 0; i< num; i++)
    {
        
        System.out.println("Input " + d + " numbers please");
        set[i] = sc.nextInt();
        
        d--;
    }
    mean(set);
    mode(set);
    }
    
    public static void mean(int[] x)
    {
        double sum = 0;
        for (int p = 0; p < x.length; p++)
        {
            sum = sum + x[p];
            
        }
        sum = sum / x.length;
        System.out.println("The mean is: " + sum);
     
        
    }
    public static void mode(int [] a)
    {
     int max = 0, count = 0;
     for (int s = 0; s < a.length; ++s)
     {
         int countss = 0;
         for (int j = 0; j <a.length; ++j)
         {
             if (a[j] == a[s]) ++countss;
         }
         if (countss > count)
         {
             count = countss;
             max = a[s];
             
         }
     }
     System.out.println("The mode is: " + max);
    }
    
}
