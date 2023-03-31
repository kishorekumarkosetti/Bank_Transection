package p1;
public class Withdraw implements Tran{ 
	public void process(int amt) {
		if(amt<b.bal) {
			System.out.println("Balance amount: "+amt);
			b.bal=b.bal-amt;
			System.out.println("Remaining Balance amount: "+b.getBalance());
			System.out.println("Transection Successfull....."); 
		}else {
			System.out.println("Insufficent fund.....");
		}
	}

}