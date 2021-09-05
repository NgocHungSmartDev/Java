/**
 * BankAccount.java Sep 5, 2021
 * 
 * Copyright by NgocHung.
 * 
 * Last update Sep 5, 2021
 */
package design.pattern;

public class BankAccount {

	private String name; // required
	private String accountNumber; // required
	private String address;
	private String email;
	private boolean newsletter;
	private boolean mobileBanking;

	private BankAccount(Builder bankAccountBuilder) {
		super();
		this.name = bankAccountBuilder.name;
		this.accountNumber = bankAccountBuilder.accountNumber;
		this.address = bankAccountBuilder.address;
		this.email = bankAccountBuilder.email;
		this.newsletter = bankAccountBuilder.newsletter;
		this.mobileBanking = bankAccountBuilder.mobileBanking;
	}

	// Builder class
	public static class Builder {
		private String name; // required
		private String accountNumber; // required
		private String address;
		private String email;
		private boolean newsletter;
		private boolean mobileBanking;

		public Builder(String name, String accountNumber) {
			this.name = name;
			this.accountNumber = accountNumber;
		}

		public Builder withAddress(String address) {
			this.address = address;
			return this;
		}

		public Builder withEmail(String email) {
			this.email = email;
			return this;
		}

		public Builder wantNewsletter(boolean newsletter) {
			this.newsletter = newsletter;
			return this;
		}

		public Builder wantMobileBanking(boolean mobileBanking) {
			this.mobileBanking = mobileBanking;
			return this;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isNewsletter() {
		return newsletter;
	}

	public void setNewsletter(boolean newsletter) {
		this.newsletter = newsletter;
	}

	public boolean isMobileBanking() {
		return mobileBanking;
	}

	public void setMobileBanking(boolean mobileBanking) {
		this.mobileBanking = mobileBanking;
	}

}
