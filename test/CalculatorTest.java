import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void shouldReturnZeroOnEmptyString(){
        assertThat(new Calculator().add(""),is(0));
    }

    @Test
    public void shouldReturnZeroOnNullStringAdd(){
        assertThat(new Calculator().add(null),is(0));
    }

    @Test
    public void shouldReturnOneOnStringOne(){
        assertThat(new Calculator().add("1"),is(1));
    }
    
    @Test
    public void shouldReturnSumOfTwoNumbersSeparatedByComma(){
        assertThat(new Calculator().add("1,2"),is(3));
    }
    
    @Test
    public void shouldReturnSumOfnNumbersSeparatedByCommas(){
        assertThat(new Calculator().add("1,2,3"),is(6));
        assertThat(new Calculator().add("1,2,3,4"),is(10));
        assertThat(new Calculator().add("1,2,3,4,5"),is(15));
        assertThat(new Calculator().add("1,5,6,3,7,8"),is(30));
    }
    
    @Test
    public void shouldReturnSumOfNumbersSeparatedByNewLine(){
        assertThat(new Calculator().add("1\n2,4"),is(7));
    }

    @Test
    public void shouldNotSuccessfullyAddDodgyCombo(){
        assertThat(new Calculator().add("1,\n2,4"),is(7));
    }

    @Test
    public void shouldReturnSumOfNumbersSeparatedByNewDelimiter(){
        assertThat(new Calculator().add("//;\n1;2"),is(3));
    }
}
