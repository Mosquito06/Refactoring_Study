package kr.or.dgit.refactoring.statement;

import java.util.List;

import kr.or.dgit.refactoring.Customer;
import kr.or.dgit.refactoring.Rental;

public abstract class Statement {
	public String value(Customer customer) {
		List<Rental> rentals = customer.getRentals();
		
		StringBuilder result = new StringBuilder(headerString(customer.getName()));

		for (Rental each : rentals) {
			result.append(eachRentalString(each));
		}

		result.append(footerString(customer));
		return result.toString();
	}
	
	protected abstract String footerString(Customer acustomer);

	protected abstract String eachRentalString(Rental aeach);

	protected abstract String headerString(String customerName);
}
