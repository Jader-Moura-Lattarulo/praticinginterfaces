package temperatureconverter;

public class StandardTemperatureConverter implements TemperatureConverter{


    @Override
    public void celsiusToFahrenheit(double temperature){
        double temperatureInFahrenheit = (temperature * 9/5) + 32;
        System.out.printf("""
                ********************************
                %.2fºC é equivalente a: %.2fºF
                ********************************
                """, temperature, temperatureInFahrenheit);
    }

    @Override
    public void fahrenheitToCelsius(double temperature){
        double temperatureInCelsius = (temperature - 32) / 1.8;
        System.out.printf("""
                ********************************
                %.2fºF é equivalente a: %.2fºC
                ********************************
                """, temperature, temperatureInCelsius);
    }
}
