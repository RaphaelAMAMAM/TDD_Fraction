package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FractionToolsTest {

    FractionTools tools = new FractionTools();

    // naming : X/Y replaced by X_Y
    @Test
    void shouldReturn3_4WhenWeAdd1_4With2_4() {
        String operatorOne = "1;4";
        String operatorTwo = "2;4";
        String resultExpected = "3/4";
        String resultWithTool = tools.additionFraction(operatorOne, operatorTwo);
        assertThat(resultWithTool).isEqualTo(resultExpected);
    }

    @Test
    void shouldReturn3_5WhenWeAdd3_10With3_10() {
        String operatorOne = "3;10";
        String operatorTwo = "3;10";
        String resultExpected = "3/5";
        String resultWithTool = tools.additionFraction(operatorOne, operatorTwo);
        assertThat(resultWithTool).isEqualTo(resultExpected);
    }

    @Test
    void shouldReturn1_2WhenWeAdd1_3With1_6() {
        String operatorOne = "1;3";
        String operatorTwo = "1;6";
        String resultExpected = "1/2";
        String resultWithTool = tools.additionFraction(operatorOne, operatorTwo);
        assertThat(resultWithTool).isEqualTo(resultExpected);
    }

    @Test
    void shouldReturn1WhenWeAdd1_3With2_3() {
        String operatorOne = "1;3";
        String operatorTwo = "2;3";
        String resultExpected = "1";
        String resultWithTool = tools.additionFraction(operatorOne, operatorTwo);
        assertThat(resultWithTool).isEqualTo(resultExpected);
    }

    @Test
    void shouldReturn2_3WhenWeAdd0_3With2_3() {
        String operatorOne = "0;3";
        String operatorTwo = "2;3";
        String resultExpected = "2/3";
        String resultWithTool = tools.additionFraction(operatorOne, operatorTwo);
        assertThat(resultWithTool).isEqualTo(resultExpected);
    }

    @Test
    void shouldReturn0WhenWeAddLessOne_3With1_3() {
        String operatorOne = "-1;3";
        String operatorTwo = "1;3";
        String resultExpected = "0";
        String resultWithTool = tools.additionFraction(operatorOne, operatorTwo);
        assertThat(resultWithTool).isEqualTo(resultExpected);
    }

    @Test
    void shouldReturn2_LessThreeWhenWeAdd3_Less3With1_3() {
        String operatorOne = "1;-1";
        String operatorTwo = "1;3";
        String resultExpected = "2/-3";
        String resultWithTool = tools.additionFraction(operatorOne, operatorTwo);
        assertThat(resultWithTool).isEqualTo(resultExpected);
    }


    @Test
    void shouldReturn2_7WhenWeAdd1_Less7With3_7() {
        String operatorOne = "1;-7";
        String operatorTwo = "3;7";
        String resultExpected = "2/7";
        String resultWithTool = tools.additionFraction(operatorOne, operatorTwo);
        assertThat(resultWithTool).isEqualTo(resultExpected);
    }

    @Test
    void shouldReturnLessOne_4WhenWeSubstract1_4With2_4() {
        String operatorOne = "1;4";
        String operatorTwo = "2;4";
        String resultExpected = "-1/4";
        String resultWithTool = tools.soustractionFraction(operatorOne, operatorTwo);
        assertThat(resultWithTool).isEqualTo(resultExpected);
    }

    @Test
    void shouldReturn3_4WhenWeSubstract5_4With2_4() {
        String operatorOne = "5;4";
        String operatorTwo = "2;4";
        String resultExpected = "3/4";
        String resultWithTool = tools.soustractionFraction(operatorOne, operatorTwo);
        assertThat(resultWithTool).isEqualTo(resultExpected);
    }

    @Test
    void shouldReturn0WhenWeSubstract3_10With3_10() {
        String operatorOne = "3;10";
        String operatorTwo = "3;10";
        String resultExpected = "0";
        String resultWithTool = tools.soustractionFraction(operatorOne, operatorTwo);
        assertThat(resultWithTool).isEqualTo(resultExpected);
    }

    @Test
    void shouldReturn1_6WhenWeSubstract1_3With1_6() {
        String operatorOne = "1;3";
        String operatorTwo = "1;6";
        String resultExpected = "1/6";
        String resultWithTool = tools.soustractionFraction(operatorOne, operatorTwo);
        assertThat(resultWithTool).isEqualTo(resultExpected);
    }

    @Test
    void shouldReturn1WhenWeSubstract4_3With1_3() {
        String operatorOne = "4;3";
        String operatorTwo = "1;3";
        String resultExpected = "1";
        String resultWithTool = tools.soustractionFraction(operatorOne, operatorTwo);
        assertThat(resultWithTool).isEqualTo(resultExpected);
    }

    @Test
    void shouldReturn2_3WhenWeSubstract2_3With0_3() {
        String operatorOne = "2;3";
        String operatorTwo = "0;3";
        String resultExpected = "2/3";
        String resultWithTool = tools.soustractionFraction(operatorOne, operatorTwo);
        assertThat(resultWithTool).isEqualTo(resultExpected);
    }

    @Test
    void shouldReturn1_8WhenWeMultiply1_4With2_4() {
        String operatorOne = "1;4";
        String operatorTwo = "2;4";
        String resultExpected = "1/8";
        String resultWithTool = tools.multiplicationFraction(operatorOne, operatorTwo);
        assertThat(resultWithTool).isEqualTo(resultExpected);
    }

    @Test
    void shouldReturn5_8WhenWeMultiply5_4With2_4() {
        String operatorOne = "5;4";
        String operatorTwo = "2;4";
        String resultExpected = "5/8";
        String resultWithTool = tools.multiplicationFraction(operatorOne, operatorTwo);
        assertThat(resultWithTool).isEqualTo(resultExpected);
    }

    @Test
    void shouldReturn9_100WhenWeMultiply3_10With3_10() {
        String operatorOne = "3;10";
        String operatorTwo = "3;10";
        String resultExpected = "9/100";
        String resultWithTool = tools.multiplicationFraction(operatorOne, operatorTwo);
        assertThat(resultWithTool).isEqualTo(resultExpected);
    }

    @Test
    void shouldReturn1_18WhenWeMultiply1_3With1_6() {
        String operatorOne = "1;3";
        String operatorTwo = "1;6";
        String resultExpected = "1/18";
        String resultWithTool = tools.multiplicationFraction(operatorOne, operatorTwo);
        assertThat(resultWithTool).isEqualTo(resultExpected);
    }

    @Test
    void shouldReturn4_9WhenWeMultiply4_3With1_3() {
        String operatorOne = "4;3";
        String operatorTwo = "1;3";
        String resultExpected = "4/9";
        String resultWithTool = tools.multiplicationFraction(operatorOne, operatorTwo);
        assertThat(resultWithTool).isEqualTo(resultExpected);
    }

    @Test
    void shouldReturn0WhenWeMultiply2_3With0_3() {
        String operatorOne = "2;3";
        String operatorTwo = "0;3";
        String resultExpected = "0";
        String resultWithTool = tools.multiplicationFraction(operatorOne, operatorTwo);
        assertThat(resultWithTool).isEqualTo(resultExpected);
    }

    @Test
    void shouldReturnLess2_3WhenWeMultiplyLess2_3With3_3() {
        String operatorOne = "-2;3";
        String operatorTwo = "3;3";
        String resultExpected = "-2/3";
        String resultWithTool = tools.multiplicationFraction(operatorOne, operatorTwo);
        assertThat(resultWithTool).isEqualTo(resultExpected);
    }

    ///


    @Test
    void shouldReturn1_2WhenWeDivide1_4With2_4() {
        String operatorOne = "1;4";
        String operatorTwo = "2;4";
        String resultExpected = "1/2";
        String resultWithTool = tools.divisionFraction(operatorOne, operatorTwo);
        assertThat(resultWithTool).isEqualTo(resultExpected);
    }

    @Test
    void shouldReturn5_2WhenWeDivide5_4With2_4() {
        String operatorOne = "5;4";
        String operatorTwo = "2;4";
        String resultExpected = "5/2";
        String resultWithTool = tools.divisionFraction(operatorOne, operatorTwo);
        assertThat(resultWithTool).isEqualTo(resultExpected);
    }

    @Test
    void shouldReturn1WhenWeDivide3_10With3_10() {
        String operatorOne = "3;10";
        String operatorTwo = "3;10";
        String resultExpected = "1";
        String resultWithTool = tools.divisionFraction(operatorOne, operatorTwo);
        assertThat(resultWithTool).isEqualTo(resultExpected);
    }

    @Test
    void shouldReturn2WhenWeDivide1_3With1_6() {
        String operatorOne = "1;3";
        String operatorTwo = "1;6";
        String resultExpected = "2";
        String resultWithTool = tools.divisionFraction(operatorOne, operatorTwo);
        assertThat(resultWithTool).isEqualTo(resultExpected);
    }

    @Test
    void shouldReturn4WhenWeDivide4_3With1_3() {
        String operatorOne = "4;3";
        String operatorTwo = "1;3";
        String resultExpected = "4";
        String resultWithTool = tools.divisionFraction(operatorOne, operatorTwo);
        assertThat(resultWithTool).isEqualTo(resultExpected);
    }

    @Test
    void shouldReturnnullWhenWeDivide2_3With0_3() {
        String operatorOne = "2;3";
        String operatorTwo = "0;3";
        String resultExpected = null;
        String resultWithTool = tools.divisionFraction(operatorOne, operatorTwo);
        assertThat(resultWithTool).isEqualTo(resultExpected);
    }

    @Test
    void shouldReturnLess6_9WhenWeDivideLess2_3With3_3() {
        String operatorOne = "-2;3";
        String operatorTwo = "3;3";
        String resultExpected = "-2/3";
        String resultWithTool = tools.divisionFraction(operatorOne, operatorTwo);
        assertThat(resultWithTool).isEqualTo(resultExpected);
    }

}