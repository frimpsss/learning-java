// variables
public class Main {
    public static void main(String[] args) {

        // variable
        int num1 = 2;
        int num2 = 9;
        int results = num2 + num1;

        System.out.println(results);


        // 2 categories of data types
        // premitive (int, float, char, boolean)


        // int - 4byte
        // long = 8 bytes
        // short - 2 bytes
        // byte - 1 byte


        // float 4 byte
        // double 8 byte


        // char 2 bytes
        // creating a float value



        int num3 = 10;
        byte by = 100;
        long m = 2342l;
        short s = 234;

        float f = 3.14f;
        double d = 1.3;


        char a = 'a';

        boolean isRaining = false;




        // literals
        int num19 = 0b1010100101010110;
        int numHex = 0x14F;

        double exponent = 123e10;




        // type casting
        byte byteA = 34;
        int intB = 1324;

        // intB = byteA works because no data loss
        //  byteA = intB; wont work because there is a data loss

        byteA = (byte) intB; // works

        System.out.println(byteA);

        // converting from float to int

        float f1 = 23.9f;
        int z = (int) f1;

        System.out.println(z);
    }
}