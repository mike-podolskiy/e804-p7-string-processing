//CHECKSTYLE:OFF
package kz.mix.e804.stringProcessing.format;

// %[flags][width][.precision]datatype_specifier
// Flags:
// -  specifies left alignment
// ^  specifies center alignment
// 0  pads the number with leading zeroes
// Width:
// The width specifier indicates the minimum number of characters that will span in the final formatted string.
// If the input data is shorter than the specified width, then it is padded with spaces by default.
// In case the input data is bigger than the specified width, the full data appears in the output string without trimming.
// Precision:
// The precision field specifies the number of precision digits in output string.
// This optional field is particularly useful with floating point numbers.
// Data type:
// %b  Boolean
// %c  Character
// %d  Decimal integer (signed)
// %e  Floating point number in scientific format
// %f  Floating point number in decimal or scientific format (depending on the value passed as argument)
// %h  Hashcode of the passed argument
// %n  Line separator (new line character)
// %s  String
// %t  Date/time
// %x  Integer formatted as an hexadecimal value


// This program shows the usage of formatting string in printf() method
public class Circle {
    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    void area() {
        double tempArea = Math.PI * radius * radius;
        System.out.println("Circle area using default formatting with println: " + tempArea);
        System.out.printf("Circle area using format specifier with printf: %6.5f", tempArea);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(10, 10, 5);
        circle.area();
    }
}
