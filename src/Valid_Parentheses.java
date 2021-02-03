import java.util.Stack;

public class Valid_Parentheses {
    public boolean isValid(String S){
        Stack<Character> newStack = new Stack<>();
        for(char c: S.toCharArray()){
            if(c == '('){
                newStack.push(')');
            }
            else if(c == '{'){
                newStack.push('}');
            }
            else if(c == '['){
                newStack.push(']');
            }
            else if(newStack.isEmpty()||newStack.pop() != c ){
                return false;
            }

        }
        return newStack.isEmpty();


    }

}
