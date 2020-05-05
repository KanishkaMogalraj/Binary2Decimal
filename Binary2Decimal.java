
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		int n;
        int base=1,sum=0;
         Scanner s=new Scanner(System.in);
        n=s.nextInt();
        if((n>=0) && (n<=1000000000))
        {
            while(n!=0)
            {
            int d=n%10;
          sum+=d*base;
            base=base*2;
            n=n/10;
            }
            System.out.println(sum);
            
            
        }

	}
}
