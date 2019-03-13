import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class test {
	public static int main(String[] args) {
		Result result = JUnitCore.runClasses(TestSuite1.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		return result.getFailureCount();
	}
}

