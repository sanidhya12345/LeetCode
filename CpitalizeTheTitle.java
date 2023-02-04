import java.util.Arrays;

public class CpitalizeTheTitle {
    public static void main(String[] args) {
        String s="First leTTeR of EACH Word";
        String [] array=s.split(" ");
        for(int i=0;i<array.length;i++){
            if(array[i].length()==1 || array[i].length()==2){
                array[i]=array[i].toLowerCase();
            }
            else{
                String val="";
                char c=array[i].charAt(0);
                if((int)c>=97 && (int)c<=122){
                    c=(char)((int)c-32);
                }
                val+=c;
                String sub=array[i].substring(1).toLowerCase();
                val+=sub;
                array[i]=val;
            }
        }
        String ans="";
        for(String i:array){
            ans+=i+" ";
        }
        System.out.println(ans.trim());

    }
}
