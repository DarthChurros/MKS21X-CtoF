public class CtoFTester {
  public static void main (String [] args) {
    System.out.println ("35ºC in Fahrenheit is " + celsiusToFahrenheit(35) + "ºF.");
    System.out.println ("86ºC in Fahrenheit is " + celsiusToFahrenheit(86) + "ºC.");
  }
}

public double celsiusToFahrenheit (double c) {
  return (c * 9 / 5 + 32);
}

public double fahrenheitToCelsius (double f) {
  return ((c - 32) * 5 / 9);
}
