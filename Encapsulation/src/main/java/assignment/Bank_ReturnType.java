package assignment;

public class Bank_ReturnType {
	private int pin;
	
	public void setPin(int pin) {
		this.pin=pin;
	}

	public boolean validatePin() {
		if(pin==1001||pin==1234||pin==1212) {			
			//System.out.println("The pin is valid");			
			return true;
		}else {
			//System.out.println("The pin is invalid");		
			return false;
		}
	}
}
