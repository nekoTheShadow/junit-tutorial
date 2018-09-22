package ch20.ex2;

import java.io.IOException;
import java.util.Map;

public class LogAnalyzer {
	
	public static LogAnalyzer of(LogLoader loader) {
		return new LogAnalyzer(loader);
	}
	
	public static LogAnalyzer of() {
		return new LogAnalyzer(new LogLoader());
	}
	
	private LogLoader logLoader;
	
	private LogAnalyzer(LogLoader loader) {
		this.logLoader = loader;
	}
	
	public Object analyze(String file) {
		try {
			var rawData = logLoader.load(file);
			return doAnalyze(rawData);
		} catch (IOException e) {
			e.printStackTrace();
			throw new AnalyzeException(e);
		}
	}

	private Object doAnalyze(Map<String, String> rawData) {
		return new Object();
	}
}
