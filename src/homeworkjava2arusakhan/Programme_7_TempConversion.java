package homeworkjava2arusakhan;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Programme_7_TempConversion {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter thr temperature in fahrenheit: ");
        float temp = scanner.nextFloat();
        //object creation
        Programme_7_TempConversion t = new Programme_7_TempConversion();
        t.convertTempToDegreeCelsius(temp);
        scanner.close();
    }

    //Temperature conversion method
    public void convertTempToDegreeCelsius(float temp){
        float c = ((temp-32)*5/9);
        System.out.println("The temperature "+ temp+ "fahrenheit is equal to " + c + "degree celsius ");
    }


}
