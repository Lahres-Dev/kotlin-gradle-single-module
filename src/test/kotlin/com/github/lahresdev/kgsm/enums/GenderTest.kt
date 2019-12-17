package com.github.lahresdev.kgsm.enums

import org.assertj.core.api.Assertions
import org.junit.Test

internal class GenderTest {

    @Test
    fun testGender() {
        Assertions.assertThat(Gender.FEMALE.toString()).isEqualTo("female")
        Assertions.assertThat(Gender.MALE.toString()).isEqualTo("male")
    }

}
