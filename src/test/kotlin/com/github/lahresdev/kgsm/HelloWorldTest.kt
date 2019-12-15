package com.github.lahresdev.kgsm

import org.assertj.core.api.Assertions
import org.junit.Test

internal class HelloWorldTest{

    @Test
    fun testHello(){
        Assertions.assertThat(HelloWorld.sayHello()).isEqualTo("Hello world!")
    }
}
