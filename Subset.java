public class Subset{
    public static void main(String[] args){
        skip("","usasau");
        System.out.println(skipret("usauauasshaw"));

    }
    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1));

        }
        else{
            skip(p+ch,up.substring(1));

        }
    }
    static String skipret(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            return skipret(up.substring(1));
        }
        else{
            return ch+skipret(up.substring(1));
        }
    }

}