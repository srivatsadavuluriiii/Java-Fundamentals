



class Solution{
   static int evenlyDivides(int N){
       int rem, count = 0;
       int orignalNum = abs(x);
       for(int i = 1; i < (int) (Math.log10(N) + 1) - 1; i++){
           rem = N % 10;
            if(rem != 0 && N % rem == 0){
                count++;
            }
            N /= 10;
         }
       return count;
   }
   public static void main(String[] args) {
         System.out.println(evenlyDivides(2446));
   }
}

