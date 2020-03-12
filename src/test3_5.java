public class test3_5 {
    public static void main(String[] args) {
        int a,b,c,d;
        for (a=0;a<4;a++){
            for (b=4;b-a>0;b--){
                System.out.print(" ");
            }
            for (c=0;c<a+1;c++){
                System.out.print("*");
            }
            for (d=0;d<a;d++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
