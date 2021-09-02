/**
 * PhoneFactory.java Sep 2, 2021
 * 
 * Copyright by NgocHung.
 * 
 * Last update Sep 2, 2021
 */
package design.pattern;

public class PhoneFactory {

	public Phone getPhone(PhoneType phoneType) {
		Phone phoneCreated = null;
		switch (phoneType) {
		case SAMSUNG:
			phoneCreated = new SamsungPhone();
			break;
		case APPLE:
			phoneCreated = new ApplePhone();
			break;
		case NOKIA:
			phoneCreated = new NokiaPhone();
			break;
		}
		return phoneCreated;
	}
}
