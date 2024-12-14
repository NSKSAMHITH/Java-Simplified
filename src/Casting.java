public class Casting {
    public static void main(String[] args){
        //casting => convert from one data type to another(calc int to double)
        double price = 100.00;
        double finalPrice = price + 21;
        System.out.println(finalPrice);

        //explicit casting(double to int)
        int p = 100;
        //int fP = p + 21.0;//java: incompatible types: possible lossy conversion from double to int
        int fP = p + (int)23.99; //all the decimal points would be truncated.
        System.out.println(fP);

    }
}
