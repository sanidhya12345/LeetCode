public class RotateString {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        
        char c = goal.charAt(0);
        int it = s.indexOf(c);
        boolean check = false;

        while(it!=-1){
            String sub1 = s.substring(0,it);
            String sub2 = s.substring(it);
            String result = sub2+sub1;
            if(goal.equals(result)) return true;
            it = s.indexOf(c,it+1);
        }
    return false;
    }
}
