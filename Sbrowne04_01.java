//Purpose: Table
//Program Name: SBrowne04_01
//Author Steven Browne
//ID 870539247
//CS1301-Homework 4
//Date 10/22
public class Sbrowne04_01{
   public static void main(String[] args){
      System.out.println(
			"\nCelsius     Fahrenheit     |     Fahrenheit     Celsius     \n" +
			"---------------------------------------------------------");
      for(double celsius=40.0, fahrenheit=120.0;celsius>=31;celsius-=1,fahrenheit-=10){
         System.out.printf("%4.1f     ", celsius);
			System.out.printf("%9.2f", celsiusToFahrenheit(fahrenheit));
			System.out.print("         |     ");
			System.out.printf("%-11.1f", fahrenheit );
			System.out.printf("%9.2f\n", fahrenheitToCelsius(fahrenheit));
      }
      }
   
   public static double celsiusToFahrenheit(double celsius){
      return (9.0/5)*celsius+32;
      }
      
   public static double fahrenheitToCelsius(double fahrenheit){
      return (fahrenheit-32)*5.0/9;
      }
}    
      