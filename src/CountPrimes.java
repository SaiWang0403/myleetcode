import org.junit.Test;
//204
public class CountPrimes {
    @Test
    public void test(){
        int number=10;
        int res=eratosthenes(number);
        System.out.println(res);
    }

    public int countPrimes(int number){
        int count=0;
        for (int i=2;i<number;i++){
            count+=isPrime(i) ? 1 :0;
        }
       return count;
    }

    public boolean isPrime(int x){
        for (int i=2;i<x;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }

    public int eratosthenes(int number){
        boolean[] isnotPrime = new boolean[number]; // default is false
        int count=0;
        for (int i=2;i<number;i++){
            if(!isnotPrime[i]){
                count++;
                //j=i*i 会更快 因为会排除掉之前已经算过的合数  比如 之前算过3*2 之后就不用算2*3 了 直接取 从3*3开始算之后的合数
                for (int j=2*i; j<number;j=j+i){
                    isnotPrime[j]=true;
                }
            }
        }
        return count;
    }
}
