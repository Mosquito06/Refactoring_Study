package kr.or.dgit.refactoring.price;

public class NewReleasePrice extends Price {
	
	public static final NewReleasePrice INSTANCE = new NewReleasePrice();

	public static NewReleasePrice getInstance() {
		return INSTANCE;
	}

	private NewReleasePrice() {
		super();
	}
	
	
	@Override
	public MovieKind getPriceCode() {
		return MovieKind.NEW_RELEASE;
	}

	@Override
	public double getCharge(int aDaysRented) {
		double result = 0;
		result += aDaysRented * 3;
		return result;
	}

	@Override
	public int getFrequentRenterPoints(int aDaysRented) {
		return (aDaysRented > 1)? 2 : 1;
	}
	
	
}
