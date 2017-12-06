package kr.or.dgit.refactoring.statement;

import kr.or.dgit.refactoring.Customer;
import kr.or.dgit.refactoring.Rental;

public class TextStatement extends Statement {
	@Override
	protected String footerString(Customer acustomer) {
		return String.format("누적 대여료 : %s%n 적립 포인트 : %s", acustomer.getTotalCharge(), acustomer.getTotalFrequentRenterPoints());
	}

	@Override
	protected String eachRentalString(Rental aeach) {
		return String.format("\t%s\t%s%n", aeach.getMovie().getTitle(), aeach.getCharge());
	}

	@Override
	protected String headerString(String customerName) {
		return String.format("%s 고객님의 대여기록%n", customerName);
	}
}
