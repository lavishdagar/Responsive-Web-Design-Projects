import java.util.ArrayList;

public class Phonepad{
    public static void main(String[] args){
        System.out.println(padret("","12"));
    }
    static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;

        }
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch= (char)('a'+i);
            pad(p+ch,up.substring(1));
        }

    }
    static ArrayList<String> padret(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;

        }
        ArrayList<String> left=new ArrayList<>();
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch= (char)('a'+i);
            left.addAll(padret(p+ch,up.substring(1)));
        }

        return left;

    }
}