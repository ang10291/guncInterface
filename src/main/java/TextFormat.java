import javax.print.attribute.TextSyntax;
import java.util.Map;
import java.util.function.Function;

public class TextFormat {
	//Map и здесь у нас будет enum. В значение value у нас будет храниться
	//ф-ция кот. принимает один аргумент в виде строки и должен вернуть аргумент в виде строки
	//Ф-ция интерфейса у нас проеобразует один тип в другой и мы указываем это в типе
	Map<SyntaxFormat, Function<String, String>> syntaxMapping =
			Map.of(
					SyntaxFormat.MD, s -> "**" + s + "**",
					SyntaxFormat.HTML, this::boldHTML  /* s -> boldHTML(s) or s -> "<strong>" + s + "</strong>" */,
                    SyntaxFormat.BB, s -> "[b]" + s + "[/b]"
			);
	public String bold(String text, SyntaxFormat formatSyntax){
		return syntaxMapping.get(formatSyntax).apply(text);
	}
	private String boldMD(String text){
		return "**" + text + "**";
	}
	private String boldHTML(String text){
		return "<strong>" + text + "</strong>";
	}
	public enum SyntaxFormat {
		MD, HTML, BB;

	}
	//public   Function<String, String> BB = ;
}
