package com.setting.kch.utility.app.basic.repository;

import com.setting.kch.utility.app.basic.entity.Basic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("test")
class BasicRepositoryTest {

    @Autowired
    BasicRepository basicRepository;

    @Test
    public void check(){
        System.out.println("qwe");
    }

    @Test
    @DisplayName("data save")
    public void saveBasic(){
        Basic basic = Basic.builder()
                .name("testName")
                .build();
        Basic newBasic = basicRepository.save(basic);
        Assertions.assertEquals("testName", newBasic.getName());
    }

    @Test
    @DisplayName("findByName")
    public void findByName(){
        Basic basic = Basic.builder()
                .name("testName")
                .build();
        basicRepository.save(basic);
        Basic findBasic = basicRepository.findByName("testName").get();
        Assertions.assertEquals("testName", findBasic.getName());
    }
}