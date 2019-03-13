import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class test {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestSuite1.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("Tests: " + result.wasSuccessful());
	}
}

