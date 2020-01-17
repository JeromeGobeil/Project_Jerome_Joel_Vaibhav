public class Converter {
    //Your names go here:
    /*
    * @Author: Jerome Gobeil
    * Vaibhav Kapoor
    * Joel Happ
    *
    */
	
	//This is the development branch

    private double celsiusToFahrenheit(double C){
        // TODO: The third student will implement this method
        return (1.8*C + 32);
    }

    private double fahrenheitToCelsius(double F){
        // TODO: The second student will implement this method
        return (F-32)(5/9);
    }
    
    public static void main(String[] args) {
    // Call CelsiusToFahrenheit to convert 180 Celsius to Fahrenheit value.
    	double farenheit = celsiusToFarenheit(180);
    // Call FahrenheitToCelsius to convert 250 Fahrenheit to Celsius value.
    	double celsius = fahrenheitToCelsius(250);
    }
}
