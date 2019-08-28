
public class SbiCard implements SpecCards {

	@Override
	public void cashWithdraw() {
		
		System.out.println("Cash Withdrawal from SBI");
		System.out.println("____________________________________________________");
	}

	@Override
	public void changePin() {
		
		System.out.println("PIN Changed for SBI");
		System.out.println("____________________________________________________");
		
	}

	@Override
	public void balance() {
		
		System.out.println("Showing Balance for SBI");
		System.out.println("____________________________________________________");
	}

}
