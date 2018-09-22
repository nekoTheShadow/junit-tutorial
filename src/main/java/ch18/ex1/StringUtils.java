package ch18.ex1;

public class StringUtils {
	public static String toSnakeCase(String text) {
		var sb = new StringBuilder();
		for (int i = 0; i < text.toCharArray().length; i++) {
			char ch = text.charAt(i);
			if (Character.isUpperCase(ch)) {
				if (i != 0) {
					sb.append("_");
				}
				sb.append(Character.toLowerCase(ch));
			} else {
				sb.append(ch);
			}
		}
		return sb.toString();
	}
}
