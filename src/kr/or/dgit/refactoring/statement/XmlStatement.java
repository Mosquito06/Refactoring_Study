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
		return null;
	}

	@Override
	protected String eachRentalString(Rental aeach) {
		return null;
	}

	@Override
	protected String headerString(String customerName) {
		return null;
	}

}
