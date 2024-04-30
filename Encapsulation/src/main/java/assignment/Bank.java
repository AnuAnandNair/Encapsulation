package assignment;

public class Bank {
	private int pin_num;
	
	public void setPin(int pin_num) {
		this.pin_num=pin_num;
	}

	public void validatePin() {
		if(pin_num==1001||pin_num==1234||pin_num==1212) {			
			System.out.println("The pin is valid");				
		}else {
			System.out.println("The pin is invalid");				
		}
	}
}
