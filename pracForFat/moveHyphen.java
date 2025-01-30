

public class moveHyphen {
    static String movehyphen(String str) {
        if (str.contains("-")) {
            int hyphenIndex = str.indexOf("-");
            return "-" + str.substring(0, hyphenIndex) + str.substring(hyphenIndex + 1);
            }
        else {
            return str;
        }
    }

    public static void main(String[] args) {
        System.out.println(movehyphen("face-prep"));
    }
}
