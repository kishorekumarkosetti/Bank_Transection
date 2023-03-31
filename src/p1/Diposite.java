package p1;
public class Diposite implements Tran {
	public void process(int amt) {
		System.out.println("Amount deposited: "+amt);
		b.bal = b.bal+amt;
		System.out.println("Balance amount: "+b.getBalance());
		System.out.println("Transection successfull....");
	}
}
