package no.logger.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:context.xml"})
class LoggerServiceTest {

    @Autowired
    LoggerService loggerService;

    @Test
    void info() {
        loggerService.info("test");
    }

    @Test
    void debug() {
    }

    @Test
    void trace() {
    }

    @Test
    void warn() {
    }

    @Test
    void error() {
    }

    @Test
    void fatal() {
    }

    @Test
    void setClass() {
    }
}