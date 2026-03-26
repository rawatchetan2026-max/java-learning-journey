public class wrapperClass {
    public static void main(String[] args) {
        Integer i = new Integer(10);
        Integer a = Integer.valueOf(10);
        Integer b = 10;

        Byte c = 15;
        Byte d = Byte.valueOf("15");
        // boxing / wrapping around a primitive
        Byte bb = 15;
        Byte e = Byte.valueOf(bb);

        Integer q = Integer.valueOf("15");

        Float k = 12.3f;

        Double h = Double.valueOf(123.232);

        Character jk = Character.valueOf('A');

        Boolean l = Boolean.valueOf("true");

        // unboxing
        Float m = Float.valueOf("123.3");
        float x = m.floatValue(); // unboxing
        float y = m; // auto-unboxing

        // auto-boxing
        int z = 10;
        Integer n = Integer.valueOf(z);

        int m1 = 15;
        Integer m2 = m1;
        Integer m3 = Integer.valueOf("4", 10);

        // here equals checks values
        System.out.println(m2.equals(m1));
        System.out.println(m2.equals(m3));
        System.out.println(m3);

        // bitcount --- returns the no. of 1's in bin.
        Integer sd = Integer.bitCount(m3);

        System.out.println(sd);
        System.out.println(Integer.parseInt("123A", 16));

        System.out.println(Integer.reverse(m3));

        System.out.println(Integer.toBinaryString(40));

        Float a1 = 4.5f / 0;
        System.out.println(a1);

    }
}
