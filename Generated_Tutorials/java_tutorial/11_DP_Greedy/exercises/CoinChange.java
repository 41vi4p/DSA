import java.util.Arrays;

public class CoinChange {

    // TODO: Return fewest number of coins to make up 'amount'. 
    // If not possible, return -1.
    // coins = [1, 2, 5], amount = 11 -> return 3 (5 + 5 + 1)
    public static int coinChange(int[] coins, int amount) {
        // Use a DP array of size amount + 1
        // dp[i] = min coins to make amount i
        
        // Arrays.fill(dp, amount + 1);
        // dp[0] = 0;
        
        return -1; // Replace
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        System.out.println("Min coins for " + amount + ": " + coinChange(coins, amount));
    }
}
