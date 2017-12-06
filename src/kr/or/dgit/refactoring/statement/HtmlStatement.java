package kr.or.dgit.refactoring.statement;

import java.util.List;

import kr.or.dgit.refactoring.Customer;
import kr.or.dgit.refactoring.Rental;

public class HtmlStatement extends Statement {
	@Override
	protected String footerString(Customer acustomer) {
		return String.format("<p>누적 대여료 : <EM>%s</EM>%n<p>적립 포인트 : <EM> %s </EM><p>", acustomer.getTotalCharge(), 
				acustomer.getTotalFrequentRenterPoints());
	}
	@Override
	protected String eachRentalString(Rental aeach) {
		return String.format("%s : %s<br>%n", aeach.getMovie().getTitle(), aeach.getCharge());
	}
	@Override
	protected String headerString(String customerName) {
		return String.format("<H1><EM>%s 고객님의 대여기록 </EM></H1><p>\\n", customerName);
	}
}
