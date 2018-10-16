package Blackjack;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main (String args[]) {
		TestRunner.allTests();
	}

	public static void allTests() {
		Result result = JUnitCore.runClasses(
				InvalidEntries.class,
				ValidEntries.class);
				System.out.println("All results have passed: "+result.wasSuccessful());
				if (!result.wasSuccessful()) {
					System.out.println("Failed Tests:");
					for (Failure failure: result.getFailures()) {
						System.out.println(failure.getMessage());
					}
				}
	}
}
