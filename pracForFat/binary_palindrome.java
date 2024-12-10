package pracForFat;

class binaryPalindrome {

    static boolean binaryPalin(String num) {
        String rev = "";
        String originalStr = num;
        for (int i = num.length() - 1; i >= 0 ; i--) {
            rev += num.charAt(i);
        }
        return rev.equals(originalStr);

    }
    public static void main(String[] args) {
        String num = "10";
        System.out.println(binaryPalin(num));
    }

    } 