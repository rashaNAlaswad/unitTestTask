import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({MathOperationsTest.class, MathOperationsParameterizedTest.class})
public class MathOperationsTestSuite {
}