package myPackage;

public class Printer {
    public Printer(String input){
        this.printing(input);
    }
    public void printing(String input){
        System.out.println("Printing...");
        System.out.println(input);
        System.out.println("Printing End");
    }
}
