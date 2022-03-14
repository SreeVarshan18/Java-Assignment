public class Reverseofnumber {
    public static void main(String[] args) {
        Integer a=345,r,rev=0;
        while(a != 0)
        {
            r = a % 10;
            rev = rev * 10 + r;
            a = a/10;
        }
        System.out.println("The reverse of number is "+rev);
    }
}
