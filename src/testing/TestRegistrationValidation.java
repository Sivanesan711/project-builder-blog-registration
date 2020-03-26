package testing;

import static org.junit.Assert.*;

import org.junit.Test;
import businesslogic.RegistrationValidation;

public class TestRegistrationValidation {
	RegistrationValidation rv = new RegistrationValidation();
	
	
	public void testCheckUserDetails() {
		
		assertEquals(true, rv.checkUser("amin@gmail.com", "Amin@556", "Amin@556"));
		assertEquals(false, rv.checkUser("amingmail.com", "Amin@556", "Amin@556"));
		assertEquals(false, rv.checkUser("amin@gmail.com", "Amin556", "Amin@556"));
		assertEquals(false, rv.checkUser("amin@gmail.com", "Amin@556", "Amin556"));
		assertEquals(false, rv.checkUser("amin@gmail.com", "Amin556", "Amin556"));
		assertEquals(false, rv.checkUser("amin@gmail.com", "amin@556", "amin@556"));
		assertEquals(false, rv.checkUser("amin@gmail.com", "Amin@am", "Amin@am"));
		try {
			rv.checkUser(null, null, null);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
