package NS1;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AbsoluteDiff {
    public static void rearrange(int[] arr, int n, int x)
    {
        TreeMap<Integer, ArrayList<Integer>> m =
                new TreeMap<>();

        // Store values in a map with the difference
        // with X as key
        for (int i = 0; i < n; i++)
        {
            int diff = Math.abs(x - arr[i]);
            if (m.containsKey(diff))
            {
                ArrayList<Integer> al = m.get(diff);
                al.add(arr[i]);
                m.put(diff, al);
            }
            else
            {
                ArrayList<Integer> al = new
                        ArrayList<>();
                al.add(arr[i]);
                m.put(diff,al);
            }
        }

        // Update the values of array
        int index = 0;
        for (Map.Entry entry : m.entrySet())
        {
            ArrayList<Integer> al = m.get(entry.getKey());
            for (int i = 0; i < al.size(); i++)
                arr[index++] = al.get(i);
        }
    }

    // Function to print the array
    static void printArray(int[] arr, int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    // Driver code
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size :");
        n = sc.nextInt();

        int[] arr = new int[n];

        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        rearrange(arr, n, x);
        printArray(arr, n);
    }
}

