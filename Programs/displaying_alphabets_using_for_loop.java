/*O(N^2) - poor code quality,as we are creating new objects everytime, strings are immutable, so 
Objects are created like - a,ab,abc,abcd,abcde,..... without getting stored -> waste of space
Instead use StringBuilder
*/

// public class displaying_alphabets_using_for_loop {
//     public static void main(String[] args) {
//         String series = "";
//         for (int i = 0; i < 26; i++) {
//             char ch = (char)('a' + i);
//             series += ch;
//         }
//         System.out.print(series);
//     }
// }

public class displaying_alphabets_using_for_loop {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder); //automatically calls the toString method
        

        
    }
}


