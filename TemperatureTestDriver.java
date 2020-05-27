public class TemperatureTestDriver {
    public static void main(String[] args)
    {
        Fahrenheit fahren1 = new Fahrenheit(32);
        System.out.println("fahren1 = " + fahren1);
        System.out.println("equals " + fahren1.convertToCelsius() + " degrees Celsius");
        
        if (fahren1.belowFreezing())
            System.out.println("fahren1 found at or below freezing");
        	System.out.println();
        	Celsius celsius1 = new Celsius(0);
        	System.out.println("celsius1 = " + celsius1);
        	System.out.println("equals " + celsius1.convertToFahrenheit() + " degrees Fahrenheit");
        
        if (celsius1.belowFreezing())
            System.out.println("celsius1 found at or below freezing");
// etc. }
    }
}