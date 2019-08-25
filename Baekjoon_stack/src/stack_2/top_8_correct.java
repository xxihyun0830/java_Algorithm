package stack_2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class top_8_correct {
	
	//���۸� 
	private void solve() {
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		Stack<Integer> rootStack = new Stack<>();
		Stack<Integer> indexStack = new Stack<>();

		int first = sc.nextInt();
		rootStack.push(first);
		indexStack.push(1);
		sb.append("0 ");
		for(int i=2;i<=n;i++) {
			int value = sc.nextInt();

			// ž�� ���� ������ �����ϰ� �ڽź��� ���� ž�� ��´�.
			// ���� ž���� ���� �� ���� ž���� ���̰� ���ٸ� �� �̻� ���� �ʿ䰡 ����.
			// ���� ��� 7 9 �� �����Ѵٸ�, ���� ž�� 3�̶�� ���� ž �� 9�� ��´�.
			// ���� 5�� ���´ٸ�, ���� ž 3�� �ƴ� 9�� ��´�.
			// ���� 2�� ���´ٸ�, ���� ž 5�� ��´�.
			// 7 9 3 5 2 -> ���� ž���� ������ ž�� Ŭ ��� ���� ž�� �����ص� �������. 3�� 5ó�� 5�� ���� 3�� ���� �ֱ� �����̴�.   
		
			while(!rootStack.isEmpty()) {
				if (value < rootStack.peek()) {
					sb.append(indexStack.peek() + " ");
					break;
				}
				rootStack.pop();
				indexStack.pop();
			}
			if (rootStack.isEmpty()) {
				sb.append("0 ");
			}
			rootStack.push(value);
			indexStack.push(i);
		}
		
		System.out.println(sb.toString());
	}
	
	public static void main(String[] args) {
		sc.init();

		new top_8_correct().solve();
	}
	
	static class sc {
		private static BufferedReader br;
		private static StringTokenizer st;

		static void init() {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer("");
		}

		static String readLine() {
			try {
				return br.readLine();
			} catch (IOException e) {
			}
			return null;
		}

		static String readLineReplace() {
			try {
				return br.readLine().replaceAll("\\s+", "");
			} catch (IOException e) {
			}
			return null;
		}

		static String next() {
			while (!st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
				}
			}
			return st.nextToken();
		}

		static long nextLong() {
			return Long.parseLong(next());
		}

		static int nextInt() {
			return Integer.parseInt(next());
		}

		static double nextDouble() {
			return Double.parseDouble(next());
		}
	}
}
