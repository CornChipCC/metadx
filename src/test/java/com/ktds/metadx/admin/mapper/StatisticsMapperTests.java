package com.ktds.metadx.admin.mapper;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ktds.metadx.admin.domain.History;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class StatisticsMapperTests {
    @Autowired
    StatisticsMapper mapper;

    // @Test
    // public void testInsert10() {
    //     IntStream.rangeClosed(1, 10)
    //     .forEach(i -> {
    //         History history = History.builder()
    //         .hbool('Y')
    //         .bid(1L)
    //         .build();

    //         mapper.insert(history);
    //     });
    // }

    @Test
    public void testLoadList() {
        mapper.getList().forEach(history -> log.info(history));
    }
    
}