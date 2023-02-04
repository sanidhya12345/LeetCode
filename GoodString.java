import java.util.Stack;

public class GoodString{
    public static void main(String[] args) {
        String s="abBAcC";
        Stack<Character> stack=new Stack<>();
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty() && Math.abs(stack.peek()-s.charAt(i))==32){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        System.out.println(sb.reverse().toString());
    }
    
}