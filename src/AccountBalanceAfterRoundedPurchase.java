import org.junit.Test;
//2806
public class AccountBalanceAfterRoundedPurchase {
    @Test
    public void test(){
        int p=14;
        int res=accountBalanceAfterPurchase(p);
        System.out.println(res);
        System.out.println(Math.round(1.4));
    }

    public int accountBalanceAfterPurchase(int purchaseAmount) {
        double ok=purchaseAmount/10.0;
        return (100-(int)Math.round(ok)*10);
    }
}
