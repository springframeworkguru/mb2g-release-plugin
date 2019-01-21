package guru.springframework;

import org.junit.jupiter.api.Test;

class JavaHelloWorldTest {

    @Test
    void getHello() {
        System.out.println(new JavaHelloWorld().getHello());

    }
}