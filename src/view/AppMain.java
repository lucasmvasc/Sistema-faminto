package view;

import java.io.IOException;
import java.util.Locale;
import view.Console;

public class AppMain {
	public static void main(String[] args) throws InterruptedException, IOException {
		Locale.setDefault(new Locale("pt", "BR"));
		view.Console console = new Console();
		console.run();
	}
}
