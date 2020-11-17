package myPackage;

public class BlackWhitePrinter extends Printer{
    public BlackWhitePrinter(String input){
        super(input);
    }
    @Override
    public void printing(String input) {
        System.out.println("Print in black and white...");
        System.out.println(input);
        System.out.println("Print End");
    }
}
