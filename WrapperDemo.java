public class WrapperDemo {
    public static void main(String[] args) {
        int primitiveInt = 500;
        char primitiveChar = 'M';
        byte primitiveByte = 90;
        short primitiveShort = 700;
        long primitiveLong = 300000L;
        float primitiveFloat = 15.3f;
        double primitiveDouble = 75.9;
        boolean primitiveBoolean = true;

        Integer boxedInt = primitiveInt;
        Character boxedChar = primitiveChar;
        Byte boxedByte = primitiveByte;
        Short boxedShort = primitiveShort;
        Long boxedLong = primitiveLong;
        Float boxedFloat = primitiveFloat;
        Double boxedDouble = primitiveDouble;
        Boolean boxedBoolean = primitiveBoolean;

        System.out.println("Autoboxing:");
        System.out.println("Boxed Integer: " + boxedInt);
        System.out.println("Boxed Character: " + boxedChar);
        System.out.println("Boxed Byte: " + boxedByte);
        System.out.println("Boxed Short: " + boxedShort);
        System.out.println("Boxed Long: " + boxedLong);
        System.out.println("Boxed Float: " + boxedFloat);
        System.out.println("Boxed Double: " + boxedDouble);
        System.out.println("Boxed Boolean: " + boxedBoolean);

        int unboxedInt = boxedInt;
        char unboxedChar = boxedChar;
        byte unboxedByte = boxedByte;
        short unboxedShort = boxedShort;
        long unboxedLong = boxedLong;
        float unboxedFloat = boxedFloat;
        double unboxedDouble = boxedDouble;
        boolean unboxedBoolean = boxedBoolean;

        System.out.println("\nUnboxing:");
        System.out.println("Unboxed Integer: " + unboxedInt);
        System.out.println("Unboxed Character: " + unboxedChar);
        System.out.println("Unboxed Byte: " + unboxedByte);
        System.out.println("Unboxed Short: " + unboxedShort);
        System.out.println("Unboxed Long: " + unboxedLong);
        System.out.println("Unboxed Float: " + unboxedFloat);
        System.out.println("Unboxed Double: " + unboxedDouble);
        System.out.println("Unboxed Boolean: " + unboxedBoolean);
    }
}

