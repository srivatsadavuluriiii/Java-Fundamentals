package pracForFat;

public class nibble_swap {
    static byte NibbleSwap(byte b) {
        byte upperNibble = (byte) ((b & 0xF0) >>> 4);
        byte lowerNibble = (byte) (b & 0x0F);

        byte swappedByte = (byte) ((lowerNibble << 4) | (upperNibble));

        return (byte) (swappedByte & 0xFF);
    }

    public static void main(String[] args) {
        byte a = (byte) 0xBA;
        byte swapped = NibbleSwap(a);
        System.out.println(Integer.toBinaryString(swapped & 0xFF));
    }
}
