public class Fahrenheit extends Temperature {
public static final double ABSOLUTE_ZERO = -459.67; public static final double BOILING_POINT = 212; public static final double FREEZING_POINT = 32;
    // alternate constructor
    public Fahrenheit(double temp)
    {
        super(temp);
    }
    protected boolean invalidTemp(double temp)
    // returns true if temperature off temperature scale
    {
        if (temp <= ABSOLUTE_ZERO)
            return true;
        else
            return false;
}
    protected String getInvalidTempMesg()
    // exception mesg string for InvalidTemperatureValueException
    {
        return "Invalid Temperature < Absolute Zero ("+ ABSOLUTE_ZERO + ")";
    }
    
public double convertToCelsius()
{ return (getTemp() - 32) * 0.55; }
    protected String getTempScale()
    // returns temperature scale name
    { return "F"; }
    public boolean aboveBoiling()
    // returns true if temp greater than or equal to boiling point
    {
        if (getTemp() >= BOILING_POINT)
            return true;
        else
            return false;
}
    
public boolean belowFreezing() {
// returns true if temp less than or equal to freezing point {

if (getTemp() <= FREEZING_POINT)
    return true;
else
    return false;
}
}