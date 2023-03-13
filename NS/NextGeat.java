import java.io.*;
import java.util.*;
import java.util.Stack;

public class NextGeat {
	public static void findNextGreater(int ar[]){
		int n = ar.length;
		int ans[] = new int[n];
		//Stack<Integer> stk = new Stack<>();
            Stack<Integer> stk=new Stack<Integer>();
		for(int i=n-1;i>=0;i--){
			while(stk.size()>0 && ar[stk.peek()]<ar[i]){
				stk.pop();
			}
			if(stk.size()==0){
				ans[i]=-1;
			}
			else{
				ans[i] = ar[stk.peek()];
			}
			stk.push(i);
		}
		System.out.println(Arrays.toString(ans));
	}

	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		for(int i=0;i<n;i++){
			ar[i] = sc.nextInt();
		}
		findNextGreater(ar);
	}
}

//h.w. Input:  1 3 2 7 4 8
//output: -1 2 -1 4 -1 -1



      
}
