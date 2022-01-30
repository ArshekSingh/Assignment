import java.util.*;
public class series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result;
        for(int i = 0; i<=n; i++){
            result = 3*i +2;
            if(result%4 !=0){
                System.out.println(result);
            }
        }
        sc.close();
    }
}
