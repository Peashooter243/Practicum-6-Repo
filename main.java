// Practicum 6 (Use of a Debugger)

// ----------------------------------------------------------
// This program will convert Celsius to Fahrenheit
// ----------------------------------------------------------
public class main {
  public static void main(String[] args) {

    double cel_temp;
    
    // init
    java.util.Scanner input = new java.util.Scanner(System.in);
    
    // program greeting
    System.out.println(
      "\nConverts temperatures in Celsius to Fahrenheit\n");

    // prompt for input
    System.out.println("Enter temperature (in Celsius): ");
    cel_temp = input.nextDouble();

    // display results
    System.out.println(cel_temp + " Celsius = " + 
                       convertToFahrenheit(cel_temp) +
                       " degrees Fahrenheit");
  
  }

  public static double convertToFahrenheit(double c) {
    return (9/5 * c) + 32;
  }
  
}
