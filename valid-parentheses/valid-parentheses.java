import java.util.Stack;
import java.util.Iterator;

class Solution {
    public boolean isValid(String s) {
        boolean isValid=false;
        Stack<Character> st= new Stack<>();
        /**
        1. travers the string as follows :
        2. if the current character is an opening bracket then push it to the stack 
        3. Else if it is a closing bracket then pop from stack ,if balances then fine ,else not well formed 
        */
        for(int i=0;i<s.length();i++){
            char x =s.charAt(i);
            if(x=='(' || x=='{' || x=='['){
                st.push(x);
                continue;
            }
            if(st.isEmpty()){
                return false;
            }
            char check;
            switch(x){
                case ')':check = st.pop();
                    if(check=='{'||check=='['){
                        return false;
                    }
                    break;
                case '}':check= st.pop();
                    if(check=='('||check=='['){
                        return false;
                    }
                    break;
                case ']':check=st.pop();
                    if(check=='('||check=='{'){
                        return false;
                    }
                    break;
            }
            
        }
        return st.isEmpty();
        
    }
}