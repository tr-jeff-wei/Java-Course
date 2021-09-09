package leetcode;


import java.util.ArrayList;


public class P20_ValidParentheses {
    public boolean isValid(String s) {


        ArrayList<Character> stack = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.add(c);
                    break;
                case ')':
                    if (stack.isEmpty()==false && stack.get(stack.size() - 1) == '(') {
                        stack.remove(stack.size()-1);
                    }else{
                        return false ;
                    }
                    break ;
                case ']':
                    if (stack.isEmpty()==false && stack.get(stack.size() - 1) == '[') {
                        stack.remove(stack.size()-1);
                    }else{
                        return false ;
                    }
                    break;
                case '}':
                    if (stack.isEmpty()==false && stack.get(stack.size() - 1) == '{') {
                        stack.remove(stack.size()-1);
                    }else{
                        return false ;
                    }
                    break;
            }
            
        }
        
        if( stack.isEmpty()){
            return true ;
        }else{
            return false ;
        }


    }
}