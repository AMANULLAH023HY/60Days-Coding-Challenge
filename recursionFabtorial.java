// Print the factorial of a number n
public class recursionFabtorial {
    public static int calfactorial(int n) {
        if(n==1 || n==0){
            return 1;
        }
        int fact_nm1=calfactorial(n-1);
        int fac_n=n*fact_nm1;
        return fac_n;
        
    }
    public static void main(String[] args) {
        int n=5;
        int  ans=calfactorial(n);
        System.out.println(ans);
    }
    
}
