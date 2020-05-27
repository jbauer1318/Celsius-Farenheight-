public class Celsius extends Temperature {
public static final double ABSOLUTE_ZERO = -273.15; public static double BOILING_POINT = 100;
public static double FREEZING_POINT = 0;
    // alternate constructor
   
	public Celsius(double temp){
        super(temp);
    }
    
    protected boolean invalidTemp(double temp){
    // returns true if temperature off temperature scale 
        if (temp <= ABSOLUTE_ZERO)
            return true;
        else
            return false;
    }
    protected String getInvalidTempMesg(){
    // exception mesg string for InvalidTemperatureValueException
        return "Invalid Temperature < Absolute Zero ("+ ABSOLUTE_ZERO + ")";
    }
    
    public double convertToFahrenheit(){  
    	return getTemp() * 1.8 + 32; }
    
    protected String getTempScale(){
    // returns temperature scale name
     return "F"; }
    
    public boolean aboveBoiling(){
    // returns true if temp greater than or equal to boiling point
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