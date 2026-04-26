import java.util.*;

public class LCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        int m = s1.length();
        int n = s2.length();

        int dp[][] = new int[m+1][n+1];
        char dir[][] = new char[m+1][n+1];

        // Fill DP + Direction table
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                    dir[i][j] = 'D';
                }
                else if(dp[i-1][j] >= dp[i][j-1]){
                    dp[i][j] = dp[i-1][j];
                    dir[i][j] = 'U';
                }
                else{
                    dp[i][j] = dp[i][j-1];
                    dir[i][j] = 'L';
                }
            }
        }

        System.out.println("\nDP Table (Value + Direction):");
        System.out.print("    "); // space for row labels
        for(int j = 0; j < n; j++){
            System.out.print("  " + s2.charAt(j)+"  ");
        }
        System.out.println();

        
        for(int i = 0; i <= m; i++){
            if(i == 0){
                System.out.print("  ");
            } else {
                System.out.print(s1.charAt(i-1) + " ");
            }

            for(int j = 0; j <= n; j++){
                if(i == 0 || j == 0){
                    System.out.print(" " + dp[i][j] + "  ");
                } else {
                    System.out.print(dp[i][j] + "" + dir[i][j] + "  ");
                }
            }
            System.out.println();
        }

        
        int i = m, j = n;
        String lcs = "";

        while(i > 0 && j > 0){
            if(dir[i][j] == 'D'){
                lcs = s1.charAt(i-1) + lcs;
                i--;
                j--;
            }
            else if(dir[i][j] == 'U'){
                i--;
            }
            else{
                j--;
            }
        }

        System.out.println("\nLength of LCS: " + dp[m][n]);
        System.out.println("LCS String: " + lcs);
    }
}
