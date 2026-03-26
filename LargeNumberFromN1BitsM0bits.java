import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Queue<Integer> A = new PriorityQueue<>(Collections.reverseOrder());
		Queue<Integer> B = new PriorityQueue<>();
		
		int MOD = (int)1e9+7;
		for(int i = 0; i < n; i++)
			A.add(sc.nextInt());
		for(int i = 0; i < n; i++)
			B.add(sc.nextInt());
		
		long ans = 0;
		for(int i = 0; i < n; i++) {
			int one = A.poll();
			while(one-- > 0)
				ans = ((ans * 2) + 1) % MOD;
			
			int two = B.poll();
			while(two-- > 0)
				ans = (ans * 2) % MOD;
		}
			
		System.out.println(ans);
		
	}
}