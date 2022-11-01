package mpr2;

public class Calculator {
        public static int power(int a, int b){
            int result = a;
            for(int i = 1; i<b; i++){
                result *= a;
            }
            return result;
        }

        public static boolean isDivisibleBySecondNumber(int a, int b){
            return a % b == 0;
        }

        public static int GCF(int a, int b){
            int gcf = 1;
            for(int i = 1; i <= a && i <= b; i++)
            {
                if(a%i==0 && b%i==0)
                    gcf = i;
            }
            return gcf;
        }
}
