package com.kgc;




import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sound.midi.Soundbank;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootTestApplicationTests {
    @After
    public void after(){
        System.out.println("after");
    }

    @Before
    public void before(){
        System.out.println("before");
    }
    @Test
   public  void aaa() {
        System.out.println("test");
    }
    public  void bbb() {
        System.out.println("test2");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("beforeClass");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("afterclass");
    }




    }
