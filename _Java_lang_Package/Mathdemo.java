public class Mathdemo {
    public static void main(String[] args) {
        System.out.print("Absolute : ");
        System.out.println(Math.abs(-123));

        System.out.print("Absolute : ");
        System.out.println(StrictMath.abs(-123));

        System.out.print("Cube root");
        System.out.println(Math.cbrt(0));

        System.out.print("Exact Decrement : ");
        System.out.println(Math.decrementExact(7));

        System.out.print("Exponent value in floating Point rep. : ");
        System.out.println(Math.getExponent(12.56));

        System.out.print("Round Divsion : ");
        System.out.println(Math.floorDiv(50, 9));

        System.out.print("Log base 10 : ");
        System.out.println(Math.log10(1000));

        System.out.print("Max : ");
        System.out.println(Math.max(50, 9));

        System.out.print("Tan : ");
        System.out.println(Math.tan(45 * Math.PI / 180));

        System.out.print("Convert to Radian : ");
        System.out.println(Math.toRadians(90));

        System.out.print("convert to Degree ");
        System.out.println(Math.atan(1));

        System.out.print("Random : ");
        System.out.println(Math.random() * 1000);

        System.out.print("Power : ");
        System.out.println(Math.pow(2, 3));

        System.out.print("Random : ");
        System.out.println(Math.random() * 1000);

        System.out.print("Exact Product : ");
        System.out.println(Math.multiplyExact(100, 200));

        System.out.print("Random : ");
        System.out.println(Math.nextAfter(12.5, 13));

    }
}
