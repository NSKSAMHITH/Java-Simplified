public class MethodAndFunction {


    public static void printJava(){
        System.out.println("Well done");
    }

    public static void printName(String name){
        System.out.println(name);
    }

    public static void addNumbers(int a, int b){
        int add = a+b;
        System.out.println(add);
    }

    public static void main(String[] args){
        //Methods - used to avoid repetitive work
        printJava();
        printJava();
        printJava();
        printJava();

        printName("samhith");
        printName("Nithya");

        addNumbers(8, 7);
    }
}
