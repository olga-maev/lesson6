package org.example.lesson6_1.service;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
public class SQRServiceTest {

    @ParameterizedTest
//    @CsvSource({
//            "200,300,3",
//            "-10,10,0",
//            "1000,5000,39"
//    })
    @CsvFileSource(files = "src/test/resources/sqrdata.csv")

    void shouldSQRServiceOn(int left,int right, int expected){
        SQRService service = new SQRService();
        // подготавливаем данные
//        int left = 200;
//        int right = 300;
//        int expected = 3;

        // вызываем целевой метод
        int actual = service.inTarget(left,right);

        // произведем проверку
        assertEquals(expected,actual);

    }
}
