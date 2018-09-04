import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       String str = null;
       while(true){
           try{
               str= sc.next();
               for(int i=0;i<str.length();i+=2){
                   char c = convertHex(str.substring(i,i+2));
                   System.out.print(c);
               }
               System.out.printf("\n");
           }
           catch(Exception e){
               break;
               
           }
       }
    }
    private static char convertHex(String t){
        char c1 = t.charAt(0);
        char c2 = t.charAt(1);
        int d1 = convertToNumber(c1);
        int d2 = convertToNumber(c2);
        
        char dec = (char)(d1*16 + d2);
        return dec;
    }
    
    private static int convertToNumber(char c){
        int n;
        if(c>='A'&&c<='F')
            return c-55;
        if(c>='0'&&c<='9')
            return c-48;
        return -1;
    }
}