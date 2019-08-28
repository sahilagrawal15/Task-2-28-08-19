
public class AtmMachine {

	SpecCards specCards;

	public void setCard(SpecCards specCards) {
		this.specCards = specCards;
	}

	public void checkBalance() {
		if (specCards != null)
			specCards.balance();
		else
			System.out.println("Invalid Card");
	}

	public void checkPin() {
		if (specCards != null)
			specCards.changePin();
		else
			System.out.println("Invalid Card");

	}

	public void checkCashWithdraw() {
		if (specCards != null)
			specCards.cashWithdraw();
		else
			System.out.println("Invalid Card");

	}

	public static void main(String[] args) {

		AtmMachine atmMachine = new AtmMachine();
		//atmMachine.setCard(new SbiCard());
		atmMachine.setCard(new PnbCard());
		atmMachine.checkBalance();
		atmMachine.checkCashWithdraw();
		atmMachine.checkPin();
		System.out.println("Time at which the card was inserted is:"+java.time.LocalTime.now());  

	}

}
