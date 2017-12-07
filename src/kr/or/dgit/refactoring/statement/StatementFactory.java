package kr.or.dgit.refactoring.statement;

public class StatementFactory {
	public static Statement getStatement(ResultType isText) {
		Statement statement = null;
		switch(isText) {
		case TEXT:
			statement = TextStatement.getInstance();
			break;
		case HTML:
			statement = HtmlStatement.getInstance();
			break;
		case XML:
			statement = XmlStatement.getInstance();
			break;
		}
		return statement;
	}
}
