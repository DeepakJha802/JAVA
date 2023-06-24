public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> arr = new ArrayList<>();
        Map<Integer, Integer> buy = new HashMap<>();
        Map<Integer, Integer> sell = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            if (x > 0) {
                buy.put(i, x);
            } else {
                sell.put(i, x);
            }
        }
        int ans = 0;
        int i = 0, j = 0;
        while (i < buy.size() && j < sell.size()) {
            int mn = Math.min(buy.get(i), -sell.get(j));
            buy.put(i, buy.get(i) - mn);
            sell.put(j, sell.get(j) + mn);
            int diff = Math.abs(i - j);x
            ans += (mn * diff);
            if (buy.get(i) == 0) {
                i++;
            }
            if (sell.get(j) == 0) {
                j++;
            }
        }
        System.out.println(ans);
    }
}
