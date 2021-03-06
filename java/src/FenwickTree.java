public class FenwickTree {

	public static void add(int[] t, int i, int value) {
		for (; i < t.length; i += (i + 1) & -(i + 1))
			t[i] += value;
	}

	// sum[0..i]
	public static int sum(int[] t, int i) {
		int res = 0;
		for (; i >= 0; i -= (i + 1) & -(i + 1))
			res += t[i];
		return res;
	}

	// Usage example
	public static void main(String[] args) {
		int[] t = new int[10];
		add(t, 0, 1);
		add(t, 9, -2);
		System.out.println(-1 == sum(t, 9));
	}
}
