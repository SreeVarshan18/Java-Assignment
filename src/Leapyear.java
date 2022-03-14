public class Leapyear {
    public static void main(String[] args) {
        Integer year=2024;
        if ((year % 4 == 0) && (year % 100!= 0)){
            System.out.println(+year + " is a Leap year");
        }
        else{
            System.out.println(+year+" is not a Leap year");
        }
    }
}
