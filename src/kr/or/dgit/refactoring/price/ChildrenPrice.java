package kr.or.dgit.refactoring.price;

public class ChildrenPrice extends Price {

	@Override
	public MovieKind getPriceCode() {
		return MovieKind.CHILDRENS;
	}

	@Override
	public double getCharge(int aDaysRented) {
		double result = 0;
		result += 1.5;
		if(aDaysRented >3) {
			result += (aDaysRented - 3) *1.5;
		}
		return result;
	}

}
