package ch19.ex3;

import java.util.ArrayList;
import java.util.Objects;

import org.assertj.core.api.AbstractAssert;

public class TextAbstractAssert extends AbstractAssert<TextAbstractAssert, String> {
	
	public static TextAbstractAssert assertThat(String actualText) {
		return new TextAbstractAssert(actualText);
	}

	private String actualText;
	
	private TextAbstractAssert(String actualText) {
		super(actualText, TextAbstractAssert.class);
		this.actualText = actualText;
	}
	
	public TextAbstractAssert isSameText(String expectedText) {
		this.isNotNull();
		
		var actuals = actualText.split(System.lineSeparator());
		var expecteds = expectedText.split(System.lineSeparator());
		
		var messages = new ArrayList<String>();
		for (int i = 0, len = Math.max(actuals.length, expecteds.length); i < len; i++) {
			var actual = get(actuals, i);
			var expected = get(expecteds, i);
			
			if (!Objects.equals(actual, expected)) {
				messages.add(String.format("at %d lines: expected is <%s>, but actual is <%s>", i + 1, expected, actual));
			}
		}
		
		if (!messages.isEmpty()) {
			messages.add(0, "FAILED");
			this.failWithMessage(String.join(System.lineSeparator(), messages));
		}
		
		return this;
	}
	
	private String get(String[] lines, int index) {
		return 0 <= index && index < lines.length ? lines[index] : null;
	}
}


