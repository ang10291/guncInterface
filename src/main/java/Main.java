public class Main {
	public static void main(String[] args) {
		String text = "Java is answer!";
		System.out.println(new TextFormat().bold(text, TextFormat.SyntaxFormat.MD));
		System.out.println(new TextFormat().bold(text, TextFormat.SyntaxFormat.HTML));

	}
}
