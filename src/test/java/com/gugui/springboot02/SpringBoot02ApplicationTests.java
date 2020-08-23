package com.gugui.springboot02;

import com.gugui.springboot02.entity.person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
/**
 * Spring boot 单元测试
 *
 * 可以在测试期间很方便的类似编码一样的进行自动注入等容器的功能
 */

@SpringBootTest
class SpringBoot02ApplicationTests {

    @Autowired
    person person;
    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
