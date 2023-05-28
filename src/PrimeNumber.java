public class PrimeNumber {
    public static void main(String[] args) {
        int n=100,num=0;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=i;k++){
                if(i%k==0){
                    num++;
                }
            }
            if (num==2){
                System.out.print(i+" ");
            }
            num=0;
        }
    }
}
