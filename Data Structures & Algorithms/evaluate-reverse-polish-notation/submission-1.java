class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int n = tokens.length;
        for (int i = 0; i < n; i++){
            if(Character.isDigit(tokens[i].charAt(tokens[i].length() - 1))){
                st.push(Integer.parseInt(tokens[i]));
            }
            else {
                if(tokens[i].equals("+")){
                    int a = st.pop();
                    int b = st.pop();
                    a = a + b;
                    st.push(a);
                } else if(tokens[i].equals("-")){
                    int a = st.pop();
                    int b = st.pop();
                    a = b - a;
                    st.push(a);
                } else if(tokens[i].equals("*")){
                    int a = st.pop();
                    int b = st.pop();
                    a = a * b;
                    st.push(a);
                } else if(tokens[i].equals("/")){
                    int a = st.pop();
                    int b = st.pop();
                    a = b/a;
                    st.push(a);
                }
            }
        }
        int res = st.pop();
        return res;
    }
}