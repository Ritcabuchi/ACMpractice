import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int t,setA = 0,setB=0,setC=0;
       t = sc.nextInt();
       for(int i=0;i<t;i++){
          setA += sc.nextInt();
          setB += sc.nextInt();
          setC += sc.nextInt();
          if(setA<30||setB<30||setC<30){
              System.out.println("No");
              continue;
          }
          int min=findMin(setA,setB,setC);
          System.out.println(min);
          setA -= min;
          setB -= min;
          setC -= min;
       }
       
      

    }
    private static int findMin(int a,int b, int c){
       int min = a;
        if(b<=min){
            min =b;
        }
        if(c<=min){
            min=c;
        }
        return min;
    }
}