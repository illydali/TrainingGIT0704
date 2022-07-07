package com.demo.oops;

class DebitCard {
//	encapsulated
// private fields are called properties
	private String cardNo = "1234123412341234";
	private String pinNo;
	// read / write
	private String cardHolderName;

	public String getCardHolderName() {
		return cardHolderName;
	}

	// send emails with last 4 digits
	// getter / accessor / read only property
	public String getCardNo() {
		return "xxxxxxxxxxxx1234";
	}
//	@Override
	public void setCardHolderName(String pCardHolderName) {
		if (pCardHolderName.length() > 4 && pCardHolderName.length() < 11) {
			cardHolderName = pCardHolderName;
		} else {
			System.err.println("Name should be 5 - 10 characters");
		}
	}

	// setter / mutator / write only property
	public void setPinNo(String pPinNo) {
		pinNo = pPinNo;
	}
	// annotations provide metadata
	@Override // toString is present in the base class (Object class) / developer redefining it for new functionality
	public String toString() {
		return getCardNo() + "\t" + cardHolderName;
	}
}

public class EncapsulationEx {
	public static void main(String[] args) {
		DebitCard debitCard = new DebitCard();
//	The field DebitCard.cardNo is not visible
//	debitCard.cardNo;
		System.out.println("Send mail : " + debitCard.getCardNo());
		debitCard.setCardHolderName("Rambo");
		debitCard.setCardHolderName("Ram");
		System.err.println(debitCard.getCardHolderName());
		System.err.println(debitCard);
	}
}