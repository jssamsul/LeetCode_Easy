/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Stack;

/**
 *
 * @author Samsul
 */
class Solution{
    public boolean isValid(String s) {
        Stack<Character> st = new Stack();
        
        if(s.length()<2)
            return false;
        
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='('){
                st.push(s.charAt(i));
                //System.out.println("Push :"+s.charAt(i));
            }
            else{
                if(st.isEmpty())
                    return false;
                else
                {
                    //System.out.println("Pop :"+s.charAt(i)+" Peek : "+st.peek());
                    char ch = st.peek();
                    if(ch =='{' && s.charAt(i)=='}' || ch =='[' && s.charAt(i)==']' || ch =='(' && s.charAt(i)==')')
                        st.pop();
                    else
                        return false;
                }
            }
        }
        if(!st.isEmpty())
            return false;
        else
            return true;
    }
}
public class ValidParentheses {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(new Solution().isValid("()"));
        System.out.println(new Solution().isValid("()[]{}"));
        System.out.println(new Solution().isValid("(]"));
        System.out.println(new Solution().isValid("([)]"));
        System.out.println(new Solution().isValid("{[]}"));
        System.out.println(new Solution().isValid("]"));
        System.out.println(new Solution().isValid("){"));
        
    }
    
}
