package myPackage;

public class ColorPrinter extends Printer{
    public ColorPrinter(String input){
        super(input);
    }
    @Override
    public void printing(String input) {
        System.out.println("Print in colour...");
        System.out.println(input);
        System.out.println("Print End");
    }
}
