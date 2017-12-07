package kr.or.dgit.refactoring.price;

public class ActionPrice extends Price {

	public static final ActionPrice INSTANCE = new ActionPrice();

	public static ActionPrice getInstance() {
		return INSTANCE;
	}

	private ActionPrice() {
		super();
	}

	@Override
	public MovieKind getPriceCode() {
		return MovieKind.ACTION;
	}

	@Override
	public double getCharge(int aDaysRented) {
		double result = 0;
		result += 4;
		if (aDaysRented > 2) {
			result += (aDaysRented - 2) * 2;
		}
		return result;
	}

}
