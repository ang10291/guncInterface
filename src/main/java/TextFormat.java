import javax.print.attribute.TextSyntax;

public class TextFormat {
	public String bold(String text, SyntaxFormat formatSyntax){
		if (formatSyntax == SyntaxFormat.HTML){
			return "<strong>" + text + "</strong>";
		} else if (formatSyntax == SyntaxFormat.MD) {
			return "**" + text + "**";
		}
		throw  new IllegalArgumentException("There is no SyntaxType ={" + formatSyntax + "}");

	}
	public enum SyntaxFormat {
		MD, HTML
	}
}
