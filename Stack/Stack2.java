package Stack;

import java.util.Stack;

public class Stack2 {
    public static void main(String[] args) {
        Stack<String> st =new Stack<>();
        st.push("Sang");
        st.push("Samiksha");
        st.push("Shyam");
        st.push("Saksham");
        st.push("Sammy");
        st.push("Samrath");
        System.out.println(st);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.search("Saksham"));
        System.out.println(st.isEmpty());
        st.add("Rameshwar");
        System.out.println(st);

    }
}
