package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DemoUtilsTest {

    private static DemoUtils demoUtils ;

    @BeforeAll
    public static void beforeEachMethod(){
        demoUtils = new DemoUtils();
    }

    @Test
    public void testEqualsandNotEquals(){
        DemoUtils demoUtils = new DemoUtils();

        Assertions.assertEquals(17,demoUtils.add(8,9));
        Assertions.assertNotEquals(12,demoUtils.add(8,9));

    }

    @Test
    public void testNullandNotNull(){
        DemoUtils demoUtils = new DemoUtils();

        Assertions.assertNull(demoUtils.checkNull(null));
        Assertions.assertNotNull(demoUtils.checkNull("Manish"));
    }

    @Test
    public void testSameAndNotSame(){
        DemoUtils demoUtils = new DemoUtils();

        String str="Luv2Code";

        Assertions.assertSame(demoUtils.getAcademy(),demoUtils.getAcademyDuplicate());
        Assertions.assertNotSame(str,demoUtils.getAcademyDuplicate());
    }

    @Test
    @Order(-3)
    public void testTrueAndFalse(){
        DemoUtils demoUtils = new DemoUtils();
        int a1=10;
        int a2=5;
        Assertions.assertTrue(demoUtils.isGreater(a1,a2));
        Assertions.assertFalse(demoUtils.isGreater(a2,a1));

    }

    @Test
    public void testArrayEquals(){

        Assertions.assertArrayEquals(new String[]{"A", "B", "C"},demoUtils.getFirstThreeLettersOfAlphabet());

    }

    @Test
    public void testListEquals(){
        List<String> list=List.of("luv","2","code");

        Assertions.assertIterableEquals(list,demoUtils.getAcademyInList());

    }

    @Test
    public void testLinesMatches(){

        List<String> academyInList = List.of("luv", "2", "code");
        Assertions.assertLinesMatch(academyInList,demoUtils.getAcademyInList());
    }

    @Test
    @Order(1)
    public void testThrowsException(){

        Assertions.assertThrows(Exception.class,()->demoUtils.throwException(-2));
        Assertions.assertDoesNotThrow(()->demoUtils.throwException(4));
    }

    @Test
    public void testTimeoutPreamptively(){

        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(3),()->demoUtils.checkTimeout());
    }

    @Test
    public void testTimeout(){

        Assertions.assertTimeout(Duration.ofSeconds(3),()->demoUtils.checkTimeout());
    }

    @Test
    public void testMultiplyMethod(){
        Assertions.assertEquals(20,demoUtils.multiply(4,5));
    }

}
