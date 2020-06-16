package emailApp;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class EmailApp {

	public static void main(String[]args) {
		Email em1 = new Email("John","Smith");
		System.out.println(em1.showInfo());
	}
}
