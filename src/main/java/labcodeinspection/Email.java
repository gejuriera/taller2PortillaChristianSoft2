package labcodeinspection;
/**
*
*
* @author Isaa Solis
*/
public class Email {
	/**
	*
	*
	* Variable M_FIRSTNAME
	*/
	private transient final String M_FIRSTNAME;
	/**
	* Variable M_LASTNAME
	*/
	
	private transient final String M_LASTNAME;
	/**
	* Variable password
	*/	
	private static String password = "";
	/**
	* Variable department
	*/
	private static String department = "";
	/**
	* Variable PASSLEN
	*/
	private static final int PASSLEN = 8;
	/**
	* Variable password
	*/
	private static String emainame;

	/**
	* constructor
	*/
	public Email(final String firstName, final String lastName) {
		this.M_FIRSTNAME = firstName;
		this.M_LASTNAME = lastName;
	}

	/**
	* metodo showInfo
	*/
	public void showInfo() {
		System.out.println("\nFIRST NAME= " + M_LASTNAME + "\nLAST NAME= " + M_LASTNAME); 		//NOPMD
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + emainame + "\nPASSWORD= " + password); 		//NOPMD
	}
	
	/**
	* setDeparment
	*/
	public void setDeparment(final int depChoice) {
		switch (depChoice) { 		//NOPMD

		case 1: 
			Email.department = "sales";
			break;
		case 2:
			Email.department = "dev";
			break;
		case 3:
			Email.department = "acct";
			break;
		}
	}
	/**
	* randomPassword
	*/
	private String randomPassword(final int length) {
		final String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*"; //NOPMD
		char[] password = new char[length]; //NOPMD
		for (int i = 0; i < length; i++) {
			final int rand = (int) (Math.random() * set.length()); 
			password[i] = set.charAt(rand);//NOPMD
		}
		return new String(password);
	}
	
	/**
	* generateEmail
	*/
	public void generateEmail() {
		Email.password = this.randomPassword(Email.PASSLEN);
		Email.emainame = this.M_FIRSTNAME.toLowerCase() + this.M_LASTNAME.toLowerCase() + "@" + Email.department //NOPMD
				+ ".espol.edu.ec"; //NOPMD
	}
}
