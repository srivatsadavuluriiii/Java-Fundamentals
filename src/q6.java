import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = obj.next();
        obj.close();
        int len = str.length();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sortedStr = new String(chars);

        for (int i = 0; i < len; i++) {
            int count = 1;
            while (i < len - 1 && sortedStr.charAt(i) == sortedStr.charAt(i + 1)) {
                count++;
                i++;
            }
            if (count > 1) {
                System.out.println(sortedStr.charAt(i)
                                   + ", count = " + count);
            }

    }
    }
}