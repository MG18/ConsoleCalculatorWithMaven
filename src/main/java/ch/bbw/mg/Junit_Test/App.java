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
        
        System.out.println(calculator.summe(Integer.MIN_VALUE, -1));
        System.out.println(calculator.division(Integer.MAX_VALUE, -100));
        System.out.println(calculator.subtraction(Integer.MAX_VALUE, -1));
        
    }
}
