package stackc;

import java.util.Stack;

public class stockSpan {
    public static void main(String[] args) {
        int stocks[] = { 100, 80, 60, 70, 60, 85, 100 };
        int span[] = new int[stocks.length];
        stockSpanCal(stocks, span);

        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }
    }

    private static void stockSpanCal(int[] stocks, int[] span) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for (int i = 1; i < span.length; i++) {
            int currprice = stocks[i];
            while (!s.isEmpty() && currprice > stocks[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = span[i + 1];
            } else {
                int prevHigh = s.peek();
                span[i] = 1 - prevHigh;
            }
            s.push(i);
        }
    }
}
