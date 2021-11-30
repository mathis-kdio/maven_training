package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {
    @Test
    void op_add_5_and_5_should_produce_10() {
        int a = 5, b = 5;
        Assertions.assertThat(Sample.op(Sample.Operation.ADD, a, b)).as("add 5 and 5")
            .isEqualTo(10);
    }

    @Test
    void op_mult_5_and_5_should_produce_25() {
        int a = 5, b = 5;
        Assertions.assertThat(Sample.op(Sample.Operation.MULT, a, b)).as("mult 5 and 5")
            .isEqualTo(25);
    }

    @Test
    void fact_of_negative_should_produce_an_exception() {
        int n = -2;
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> Sample.fact(n));
    }

    @Test
    void fact_by_0_should_produce_1() {
        int n = 0;
        Assertions.assertThat(Sample.fact(n)).as("fact of 0")
            .isEqualTo(1);
    }

    @Test
    void fact_by_5_should_produce_120() {
        int n = 5;
        Assertions.assertThat(Sample.fact(n)).as("fact of 5")
            .isEqualTo(120);
    }
}
