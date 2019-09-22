package org.dojo.kata;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayName("JUnit5 Starter")
public class KataTest {

    @Test
    @DisplayName("Check my environment in order to be able to start...")
    public void check_environment() {
        Assertions.assertThat(false).isTrue();
    }

    @ParameterizedTest
    @CsvSource({
        "false, true",
        "true, false"
    })
    @DisplayName("Check my environment with a parameterized test")
    public void check_environment(boolean actuel, boolean expected){
        Assertions.assertThat(actuel).isEqualTo(expected);
    }
}