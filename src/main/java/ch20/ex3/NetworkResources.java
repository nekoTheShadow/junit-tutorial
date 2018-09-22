package ch20.ex3;

import java.io.IOException;

public class NetworkResources {
	private NetworkLoader loader;
	
	public NetworkResources(NetworkLoader loader) {
		this.loader = loader;
	}
	
	public String load() throws IOException {
		return new String(loader.getInput().readAllBytes());
	}
}
