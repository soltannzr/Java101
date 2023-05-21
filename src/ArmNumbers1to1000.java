public class ArmNumbers1to1000 {
    public static void main(String[] args) {

        int counter, digit, powDigits, result;
        System.out.println("Armstrong numbers between 1 and 1000:");

        for(int k=1; k<1000; k++) {
            result =0;
            int tempNum=k ;
            counter =0;

            while (tempNum !=0){
                tempNum/=10;
                counter++;
            }

            tempNum = k;
            while (tempNum!=0) {
                digit = tempNum % 10;

                powDigits = 1;
                for (int i =1;i<=counter;i++){
                    powDigits *=digit;
                }
                result +=powDigits;
                tempNum/=10;
            }
            if(result == k)
                System.out.print(k + " ");
        }
    }
}
