public class Swap {
    public static void main(String[] args) {
        Integer x=11, y=50, temp;
        System.out.println("Numbers before swapping: "+x +"  "+ y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("Numbers after swapping: "+x +"   " + y);
    }
}
