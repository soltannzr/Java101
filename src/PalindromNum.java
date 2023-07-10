public class PalindromNum {
    static boolean isPolindrom (int num) {
        int tempnum=num, lastdigit, reversenum=0;

        while (tempnum!=0){
            lastdigit=tempnum%10;
            reversenum=(reversenum*10)+lastdigit;
            tempnum=tempnum/10;
        }
            if(reversenum==num){
                return true;
            }
            else
                return false;

    }
    public static void main(String[] args) {
        System.out.println(isPolindrom(10002));
    }
}
