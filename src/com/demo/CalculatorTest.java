package com.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calc = new Calculator();
    
    // 故意制造失败的测试（用于演示失败场景）
    @Test
    public void testAddFail() {
        assertEquals(10, calc.add(2, 3), "故意写错期望值以便演示失败");
    }
}