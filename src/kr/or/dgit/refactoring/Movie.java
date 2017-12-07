package kr.or.dgit.refactoring;

import kr.or.dgit.refactoring.price.MovieKind;
import kr.or.dgit.refactoring.price.Price;
import kr.or.dgit.refactoring.price.PriceFactory;

public class Movie {
	private String title;
	private Price price;

	public Movie(String title, MovieKind priceCode) {
		super();
		this.title = title;
		setPriceCode(priceCode);
	}

	public MovieKind getPriceCode() {
		return price.getPriceCode();
	}

	public void setPriceCode(MovieKind aPriceCode) {
		price = PriceFactory.getFactory(aPriceCode);
	}

	public String getTitle() {
		return title;
	}
	
	public double getCharge(int aDaysRented) {
		return price.getCharge(aDaysRented);
	}
	
	public int getFrequentRenterPoints(int aDaysRented) {
		if((getPriceCode() == MovieKind.NEW_RELEASE) && aDaysRented > 1) {
			return 2;
		}else {
			return 1;
		}
	}

}
