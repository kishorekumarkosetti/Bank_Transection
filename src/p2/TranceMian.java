package p2;
import java.util.*;
import p1.*;
public class TranceMian{
	public static void main(String[] args) {	
		Scanner s = new Scanner(System.in);
		int count=0;
		stop:
		while(true) {
			System.out.println("Enter the pinNo:");
			int pinNo = s.nextInt();
			if(pinNo>=1111 && pinNo<=9999)
			{
				CheckPin cpn = new CheckPin();
				boolean k = cpn.verify(pinNo);
				if(k) {
					System.out.println("=====Choice=====");
					System.out.println("\t1.WithDraw"+"\n\t2.Diposite");
					System.out.println("Enter the choice:");
					int choice = s.nextInt();
					switch(choice) {
					case 1:
						System.out.println("Enter the amount Withdraw:");
						int a1 = s.nextInt();
						if(a1>0 && a1%100==0) {
							Withdraw wd = new Withdraw();
							wd.process(a1);
						}else {
							System.out.println("Invalide amount for diposite");
						}
						break stop;
					case 2:
						System.out.println("Enter the amount to Deposite: ");
						int a2 = s.nextInt();
						if(a2>0 && a2%100==0) {
							Diposite d = new Diposite();
							d.process(a2);
						}else {
							System.out.println("Invalide Amount for Deposite");
						}
						break stop;
					default:
						System.out.println("Invalide Choice....");
						break stop;
					}
			
				}
				else {
					System.out.println("PinNo Dose not exist");
					count++;
				}
				if (count == 3) {
					System.out.println("Sorry ! Transaction failed");
					break;
				}
			}
		}
	}

}


