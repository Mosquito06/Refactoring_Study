package kr.or.dgit.refactoring.statement;

public class StatementFactory {
	public static Statement getStatement(int isText) {
		Statement statement = null;
		switch(isText) {
		case Statement.TEXT:
			statement = new TextStatement();
			break;
		case Statement.HTML:
			statement = new HtmlStatement();
			break;
		}
		return statement;
	}
}
