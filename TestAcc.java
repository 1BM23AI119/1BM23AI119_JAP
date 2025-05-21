class LessBalanceExc extends Exception{
    public LessBalanceExc(double amt){
        super("withdrAW"+amt+"not valid");
    }
}
class Account {
    double amt;
    final double min_bal=500;
    double bal;
    public Account(){
        bal=min_bal;
    }

    public void deposit(double amt){
        bal+=amt;
        System.out.println("after deposit"+bal);
    }
    public void withdr(double amt) throws LessBalanceExc{
        if (bal-amt< min_bal){
            throw new LessBalanceExc(amt);
        }
        bal-=amt;
        System.out.println("after withdraw"+amt);
    }
    public  void getBal(){
        System.out.println(bal);
    }
}
public class TestAcc{
    public static void main(String [] args){
        Account acc1= new Account();
        Account acc2=new Account();
        acc1.deposit(1);
        try {
            acc1.withdr(504);
        } catch (LessBalanceExc e) {
            System.out.println(e.getMessage());
        }
        acc2.deposit(300);
        try{
            acc2.withdr(50);
        } catch (LessBalanceExc e) {
            System.out.println(e.getMessage());
        }
        acc2.getBal();
    }
}


