import java.util.Scanner;
public class codeforces_yp {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int x = 0, y = 0, z = 0;
            while(n-- >= 1){
                x = x + sc.nextInt();
                y = y + sc.nextInt();
                z = z + sc.nextInt();
            }
            if(x==0 && y==0 && z == 0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }

