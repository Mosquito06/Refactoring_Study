package kr.or.dgit.refactoring;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private List<Rental> rentals = new ArrayList<>();

	public Customer(String aName) {
		super();
		this.name = aName;
	}

	public void addRental(Rental aRental) {
		this.rentals.add(aRental);
	}

	public String getName() {
		return name;
	}
	
	public String statement() {
		double totalAmount = 0;
		int frequentRentarPoints = 0;
		
		StringBuilder result = new StringBuilder(getName() + "고객님의 대여 기록\n");
		
		for(Rental each: rentals) {
			/*double thisAmount = each.getCharge();*/
					
			frequentRentarPoints += each.getFrequentRenterPoints();
			
			result.append("\t" + each.getMovie().getTitle());
			result.append("\t" + String.valueOf(each.getCharge()) + "\n");
			
			totalAmount += each.getCharge();
		}
		
		result.append("누적 대여료 : " + String.valueOf(totalAmount) + "\n");
		result.append("적립 포인트 : " + String.valueOf(frequentRentarPoints));
		
		return result.toString();
	}

	/*private int getFrequentRenterPoints(Rental each) {
		if((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1) {
			return 2;
		}
		return 1;
	}*/
	
	/*// 대여료 계산을 위한 함수 별도로 추출
	private double amountFor(Rental aRental) {
		double result = 0;
		
		switch(aRental.getMovie().getPriceCode()) {
		case Movie.REGULAR:
			result += 2;
			if(aRental.getDaysRented() > 2) {
				result += (aRental.getDaysRented() - 2) * 1.5;
			}
			break;
		case Movie.NEW_RELEASE:
			result += aRental.getDaysRented() * 3;
			break;
		case Movie.CHILDRENS:
			result += 1.5;
			if(aRental.getDaysRented() >3) {
				result += (aRental.getDaysRented() - 3) *1.5;
			}
			break;
		}
		return result;
	}*/
}
