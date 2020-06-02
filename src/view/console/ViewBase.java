package view.console;

import java.util.Scanner;

public class ViewBase {
	protected final Scanner sc;

	public ViewBase(Scanner sc) {
		this.sc = sc;
	}

	protected int readInt() {
		int rv = sc.nextInt();
		sc.nextLine();
		return rv;
	}

	protected long readLong() {
		long rv = sc.nextLong();
		sc.nextLine();
		return rv;
	}

	protected void CLS() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
}
