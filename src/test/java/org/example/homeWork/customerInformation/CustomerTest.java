package org.example.homeWork.customerInformation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    private final String filePath = "1.txt";
    @BeforeEach
     void setUp(){
        Customer customer = new Customer();
    }

    @Test
     void createCountMapTeast() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filePath));
        Map<Character, Integer> result = Customer.createCountMap(lines);
        assertNotNull(result);
    }

}