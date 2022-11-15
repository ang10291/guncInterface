import javax.print.attribute.TextSyntax;

public class TextFormat {
	public String bold(String text, SyntaxFormat formatSyntax){
		if (formatSyntax == SyntaxFormat.HTML){
			return boldHTML(text);
		} else if (formatSyntax == SyntaxFormat.MD) {
			return boldMD(text);
		}
		throw  new IllegalArgumentException("There is no SyntaxType ={" + formatSyntax + "}");

	}
	private String boldMD(String text){
		return "**" + text + "**";
	}
	private String boldHTML(String text){
		return "<strong>" + text + "</strong>";
	}
	public enum SyntaxFormat {
		MD, HTML
	}
}
