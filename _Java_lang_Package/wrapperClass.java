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

        Character k = Character.valueOf('A');

        Boolean l = Boolean.valueOf("true");

        // unboxing
        Float m = Float.valueOf("123.3");
        float x = m.floatValue(); // unboxing
        float y = m; // auto-unboxing

        // auto-boxing
        int z = 10;
        Integer n = Integer.valueOf(z);

    }
}
