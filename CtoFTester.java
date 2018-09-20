public class CtoFTester {
  public static void main (String [] args) {
    System.out.println ("35ºC in Fahrenheit is " + celsiusToFahrenheit(35.0) + "ºF.");
    System.out.println ("86ºF in Celsius is " + fahrenheitToCelsius(86.0) + "ºC.");
  }
  public static double celsiusToFahrenheit (double c) {
    return (c * 9 / 5 + 32);
  }

  public static double fahrenheitToCelsius (double f) {
    return ((f - 32) * 5 / 9);
  }
}
