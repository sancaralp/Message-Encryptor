public class Encryption {
    int x;

    String code;
    private char encrypt(char a,int index){

        if (a==' ') x=(int) a;

        else if(prime(index)) x=(int)a+3;

        else if(index%2==1) x = (int) a - 2;

        else x=(int) a+1;

        a=(char)x;
    return a;
    }

    private char decrypt(char a,int index){

        if (a==' ') x=(int) a;

        else if(prime(index)) x=(int)a-3;

        else if(index%2==1) {
            x = (int) a + 2;
        }
        else x=(int) a-1;
        a=(char)x;
        return a;
    }

    public String toCode(String yourMessage){
        code="";
        for(int i=0;i<yourMessage.length();i++){
            code+=encrypt(yourMessage.charAt(i),i);
        }
        return code;
    }
    public String unCode(String yourMessage){
        code="";
        for(int i=0;i<yourMessage.length();i++){
            code+=decrypt(yourMessage.charAt(i),i);
        }
        return code;
    }
    private static boolean prime(int index){
        if (index<2) return false;
        for(int i=2; i<index; i++){
            if(index%i==0) return false;
            break;
        }
        return true;
    }


}
