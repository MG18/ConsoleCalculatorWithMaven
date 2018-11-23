package ch.bbw.mg.Junit_Test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculator calculator = new Calculator();
        
        int valueA = 20;
        int valueB = 14;
        
        System.out.println("Console Calculator");
        System.out.println("-------------------");
        System.out.println("");
        
        System.out.println(calculator.Summe(valueA, valueB));
    }
}
