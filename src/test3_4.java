public class test3_4 {
    public static void main(String[] args) {
        int a,b,c;
        c=0;
        for (a=0;a<5;a++){
            for (b=0;b<a+1;b++){
                System.out.print((char)('A'+c));

            }
            System.out.println(" ");
            c++;
        }

    }
}
