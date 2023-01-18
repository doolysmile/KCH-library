package com.setting.kch.junitexample;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class ExampleTest {
    @BeforeAll
    static void beforeAll(){
//        System.out.println("beforeAll");
    }

    @BeforeEach
    void beforeEach(){
//        System.out.println("beforeEach");
    }

    @Test
    void 언더바_띄어쓰기(){
        // 클래스 위에 언더바 있으면 메소드에 언더바 띄어 쓰기
    }
    @Test
    @DisplayName("display name Test")
    void displayMethod(){
        // 테스트 이름은 디폴트로 메소드 네임이지만, @displayName 어노테이션으로 변경
    }
    @Test
    void succeedingTest() {
        System.out.println("succeedingTest");
        assertTrue(true);
    }

    @Test
    void failingTest() {
        System.out.println("failingTest");
        fail("의도적으로 실패시킨 테스트");
    }

    @Test
    @Disabled("의도적으로 비활성화한 테스트")
    void skippedTest() {
        System.out.println("skippedTest");
    }

    @Test
    void abortedTest() {
        assumeTrue(false);
        System.out.println("abortedTest");
    }
    @AfterEach
    void afterEach(){
//        System.out.println("afterEach");
    }

    @AfterAll
    static void afterAll(){
//        System.out.println("afterAll");
    }
}
