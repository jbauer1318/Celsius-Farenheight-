public abstract class Temperature{
   
	private double temperature;
    // --- Alternate Constructor
    public Temperature(double temp){
	
    setTemp(temp);
    }
    
public String toString(){
  return temperature + "° " + getTempScale();
}

// --- Getters and Setters
public double getTemp(){
    return temperature;
}


public void setTemp(double temp) throws InvalidTemperatureValueException{
// relies on implementation of abstract methods invalidTemp,
// getInvalidTempMesg and convertToCelsius.
    if (invalidTemp(temp))
        throw new InvalidTemperatureValueException(
                     getInvalidTempMesg());
    temperature = temp;
}
// * ABSTRACT METHODS - Temperature Operators // * Must be overridden in subclasses
protected abstract boolean invalidTemp(double temp);
// returns true if temperature off temperature scale
protected abstract String getInvalidTempMesg();
// exception mesg string for InvalidTemperatureValueException
protected abstract String getTempScale();
// returns temperature scale name
public abstract boolean aboveBoiling();
// returns true if temp greater than or equal to boiling point
public abstract boolean belowFreezing();
// returns true if temp less than or equal to freezing point

}