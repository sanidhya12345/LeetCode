public class RemoveOccurrences {

    public static void main(String[] args) {
        String s="daabcbaabcbc";
        String part="abc";
        while(s.indexOf(part)!=-1){
            s=s.replace(part, "");
        }
        System.out.println(s);
    }
}
