public class Largest {
    public static void main(String[] args) {
        Integer a=3,b=2,c=1;
        if(a>b){
            if(a>c){
                System.out.println(+a+" is the Largest Number");
            }
        }
        else{
            if(b>c){
                System.out.println(+b+" is the Largest Number");
            }
            else{
                System.out.println(+c+" is the Largest Number");
            }
        }
    }
}
