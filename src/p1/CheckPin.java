package p1;
public class CheckPin{
	public boolean verify(int PinNo) {
		return switch(PinNo) {
		case 1111: yield true;
		case 2222: yield true;
		case 3333: yield true;
		default : yield false;
		};  
	}
}
