import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorParameterizedTest {


    @ParameterizedTest // used to annotate that the method being tested WILL accept a parameter
    @ValueSource(strings = {"Java", "Python", "Ruby"}) // value being tested
    void testCase1(String args){
        Assertions.assertFalse(args.isEmpty());
    }



}
