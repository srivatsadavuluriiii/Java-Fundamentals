//java program to print numbers divisible by 7 between 100 to 200
// Sat June 01 2024


public class divisible_in_an_interval {
    public static void main(String[] args) {
        System.out.print("Numbers divisible by 7 between 100 to 200 : ");
        for(int i = 100; i < 200; i++){
            if(i % 7 == 0){
                System.out.print(i + ", ");
            }
        }
    }
}
