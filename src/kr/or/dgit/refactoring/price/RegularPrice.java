package kr.or.dgit.refactoring.price;

public class RegularPrice extends Price {
	
	public static final RegularPrice INSTANCE = new RegularPrice();

	public static RegularPrice getInstance() {
		return INSTANCE;
	}

	private RegularPrice() {
		super();
	}
	
	@Override
	public MovieKind getPriceCode() {
		return MovieKind.REGULAR;
	}

	@Override
	public double getCharge(int aDaysRented) {
		double result = 0;
		result += 2;
		if(aDaysRented > 2) {
			result += (aDaysRented - 2) * 1.5;
		}
		return result;
	}

}
