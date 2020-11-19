package org.pract.test.practtest03;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LearnAssertJ {

    double var = 2.5;

    @Test
    void learnAssertJ() {
        assertThat(var)
        .isGreaterThan(1.0);

    }


}
