import java.util.*;
public class Task8{
    public static void main(String[] args) {
        int[] coins1 = {1, 2, 5, 10};
        int[] coins2 = {1, 2, 7, 9};
        int amount = 11;

        CoinChange cc1 = new CoinChange();
        cc1.findMinCoins(coins1, amount);
        System.out.println("For coins " + Arrays.toString(coins1) + " and amount " + amount + ", the DList is: " + cc1.getDList());

        CoinChange cc2 = new CoinChange();
        cc2.findMinCoins(coins2, amount);
        System.out.println("For coins " + Arrays.toString(coins2) + " and amount " + amount + ", the DList is: " + cc2.getDList());
    }

}

class CoinChange {
    private DList<Integer, Integer> dList;

    public CoinChange() {
        this.dList = new DList<>();
    }

    public void findMinCoins(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        List<List<Integer>> combinations = new ArrayList<>();
        for (int i = 0; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE;
            combinations.add(new ArrayList<>());
        }
        dp[0] = 0;

        for (int coin : coins) {
            for (int j = coin; j <= amount; j++) {
                if (dp[j - coin] != Integer.MAX_VALUE && dp[j - coin] + 1 < dp[j]) {
                    dp[j] = dp[j - coin] + 1;
                    List<Integer> temp = new ArrayList<>(combinations.get(j - coin));
                    temp.add(coin);
                    combinations.set(j, temp);
                }
            }
        }

        for (int i = 1; i <= amount; i++) {
            if (dp[i] != Integer.MAX_VALUE) {
                dList.add(dp[i], combinations.get(i));
            }
        }
    }

    public DList<Integer, Integer> getDList() {
        return dList;
    }

}