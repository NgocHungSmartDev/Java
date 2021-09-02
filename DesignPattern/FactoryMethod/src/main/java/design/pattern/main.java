/**
 * main.java Sep 2, 2021
 * 
 * Copyright by NgocHung.
 * 
 * Last update Sep 2, 2021
 */
package design.pattern;

public class main {
	public static void main(String[] args) {
		PhoneFactory phoneFactory = new PhoneFactory();
		Phone phone = phoneFactory.getPhone(PhoneType.SAMSUNG);
		phone.showInfo();
	}
}
