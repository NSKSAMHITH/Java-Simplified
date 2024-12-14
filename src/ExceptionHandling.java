public class ExceptionHandling {
    public static void main(String[] args){
        //TRY CATCH in exception handling
        int[] marks= {97, 98, 99};

        //System.out.println(marks[5]); {Array index out of bounds exception }

        try{
            System.out.println(marks[5]);
        }
        catch (Exception exception){
            //do something after catching
            System.out.println("Check the length of the array as you have entered the try block: " + marks.length);
        }
        System.out.println("my name is Samhith");
    }
}
