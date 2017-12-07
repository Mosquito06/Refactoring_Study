package kr.or.dgit.refactoring.price;

public class PriceFactory {
	public static Price getFactory(MovieKind aPriceCode) {
		Price price = null;
		switch(aPriceCode) {
		case REGULAR:
			price = new RegularPrice();
			break;
		case CHILDRENS:
			price = new ChildrenPrice();
			break;
		case NEW_RELEASE:
			price = new NewReleasePrice();
			break;
		default:
			throw new IllegalArgumentException("가격 코드가 잘못 됐습니다.");
		}
		return price;
	}
	
}
