package kr.or.dgit.refactoring.statement;

import kr.or.dgit.refactoring.Customer;
import kr.or.dgit.refactoring.Rental;

public class XmlStatement extends Statement {
	
	public static final XmlStatement INSTANCE = new XmlStatement();

	public static XmlStatement getInstance() {
		return INSTANCE;
	}

	private XmlStatement() {
		super();
	}
	
	@Override
	protected String footerString(Customer acustomer) {
		return String.format("<TotalPrice> 누적 대여료 : %s</TotalPrice>%n <TotalPoint> 적립 포인트 : %s </TotalPoint>", acustomer.getTotalCharge(),
				acustomer.getTotalFrequentRenterPoints());
	}

	@Override
	protected String eachRentalString(Rental aeach) {
		return String.format("<Movie> %s </Movie> : <Price> %s </Price>%n", aeach.getMovie().getTitle(), aeach.getCharge());
	}

	@Override
	protected String headerString(String customerName) {
		return String.format("<Customer> %s 고객님의 대여기록 </Customer>%n", customerName);
	}

}
