import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        long[]memo=new long[100];
        memo[0]=0;
        memo[1]=1;
        System.out.println(fibTabulation(20,memo));
        System.out.println(Arrays.toString(memo));
    }

public static long fibTabulation(int n,long[]memo){
    if(memo.length>=n){
        for(int i=2;i<=n;i++){
            long val=memo[i-1]+memo[i-2];
            memo[i]=val;
        }
        return memo[n];
    }
    System.out.println("insufficient memory-----!in memo"+memo.length);
    return -1;
}
public static long fib(long n){
        if(n==0||n==1)
        return n;
        return fib(n-1)+fib(n-2);
    }
    public static long fibMemorization(long n,long[] memo){
        if(n==0||n==1)
        return n;
        if(memo[(int)n]!=0)
        return memo[(int)n];
        long val=fibMemorization(n-1,memo)+fibMemorization(n-2,memo);
        memo[(int)n]=val;
        return memo[(int)n];
    }
}
    