package ru.otus.hw2;

public class TestSizeOf {
    private String innerStr;
    private int innerInt;

    public TestSizeOf(String innerStr, int innerInt) {
        this.innerInt = innerInt;
        this.innerStr = innerStr;
    }

    public static void main(String[] args) {

        boolean bo1 = true;
        System.out.println("Retained space for boolean bo1 = true --> " + SizeUtil.deepSizeOfObject(bo1));

        byte b1 = 3;
        System.out.println("Retained space for byte b1 = 3 --> " + SizeUtil.deepSizeOfObject(b1));

        short sh1 = 3;
        System.out.println("Retained space for short sh1 = 3 --> " + SizeUtil.deepSizeOfObject(sh1));

        int i1 = 3;
        System.out.println("Retained space for int i1 = 3 --> " + SizeUtil.deepSizeOfObject(i1));

        long l1 = 3L;
        System.out.println("Retained space for long l1 = 3L --> " + SizeUtil.deepSizeOfObject(l1));

        char c1 = 'A';
        System.out.println("Retained space for char c1 = 'A' --> " + SizeUtil.deepSizeOfObject(c1));

        float f1 = 3f;
        System.out.println("Retained space for float f1 = 3f --> " + SizeUtil.deepSizeOfObject(f1));

        double d1 = 3;
        System.out.println("Retained space for double d1 = 3 --> " + SizeUtil.deepSizeOfObject(d1));

        Object o = new Object();
        System.out.println("Retained space for Object o = new Object() --> "+
                SizeUtil.deepSizeOfObject(o));

        String st1 = "A";
        System.out.println("Retained space for String st1 = \"A\" --> " + SizeUtil.deepSizeOfObject(st1));

        byte[] arrByte = new byte[20];
        System.out.println("Retained shallow space for byte[] arrByte = new byte[20] --> " +  SizeUtil.shallowSizeOfObject(arrByte));
        System.out.println("Retained deep space for byte[] arrByte = new byte[20] --> " +  SizeUtil.deepSizeOfObject(arrByte));

        Byte[] arrByteObj = new Byte[] { 3, 4, 5 };
        System.out.println("Retained shallow space for Byte[] arrByteObj = new Byte[] { 3, 4, 5 } --> " +    SizeUtil.shallowSizeOfObject(arrByteObj));
        System.out.println("Retained deep space for Byte[] arrByteObj = new Byte[] { 3, 4, 5 } --> " +  SizeUtil.deepSizeOfObject(arrByteObj));

        int[] arrInt = new int[] { 0 };
        System.out.println("Retained shallow space for int[] arrInt = new int[] { 0 } --> " +  SizeUtil.shallowSizeOfObject(arrInt));
        System.out.println("Retained deep space for int[] arrInt = new int[] { 0 } --> " +  SizeUtil.deepSizeOfObject(arrInt));

        long[] arrLong = new long[] { 0 };
        System.out.println("Retained shallow space for long[] arrLong = new long[] { 0 } --> " +  SizeUtil.shallowSizeOfObject(arrLong));
        System.out.println("Retained deep space for long[] arrLong = new long[] { 0 } --> " +  SizeUtil.deepSizeOfObject(arrLong));

        int[][] arrIntTwoDim = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arrIntTwoDim[i][j] = i * j;
            }
        }
        System.out.println("Retained shallow space for int[][] arrIntTwoDim = new int[5][5] --> " +  SizeUtil.shallowSizeOfObject(arrIntTwoDim));
        System.out.println("Retained deep space for int[][] arrIntTwoDim = new int[5][5] --> " +  SizeUtil.deepSizeOfObject(arrIntTwoDim));

        String[] arrStr = new String[4];
        arrStr[0] = "1";
        arrStr[1] = "2";
        arrStr[2] = "3";
        arrStr[3] = null;
        System.out.println("Retained shallow space for String[] arrStr = new String[4] --> " +  SizeUtil.shallowSizeOfObject(arrStr));
        System.out.println("Retained deep space for String[] arrStr = new String[4] --> " +  SizeUtil.deepSizeOfObject(arrStr));

        TestSizeOf myTest = new TestSizeOf("test", 11111111);
        System.out.println("Retained shallow space for TestSizeOf myTest = new TestSizeOf(\"test\", 11111111) --> " + SizeUtil.shallowSizeOfObject(myTest));
        System.out.println("Retained deep space for TestSizeOf myTest = new TestSizeOf(\"test\", 11111111) --> " + SizeUtil.deepSizeOfObject(myTest));

        Object obj = new String("test");
        System.out.println("Retained shallow space for Object obj = new String(\"test\") --> " +  SizeUtil.shallowSizeOfObject(obj));
        System.out.println("Retained deep space for Object obj = new String(\"test\") --> " +  SizeUtil.deepSizeOfObject(obj));

    }
}
