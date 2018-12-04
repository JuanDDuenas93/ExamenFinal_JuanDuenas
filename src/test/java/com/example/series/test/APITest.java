/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.series.test;

import com.anarsoft.vmlens.concurrent.junit.ConcurrentTestRunner;
import com.anarsoft.vmlens.concurrent.junit.ThreadCount;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import static org.hamcrest.CoreMatchers.equalTo;
import org.junit.Assert;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author estudiante
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class APITest {
    
    @LocalServerPort
    int randomServerPort;
    
    @Test
    @ThreadCount(10)
    public void concurrentQueryToAPI() throws IOException {
        String url = "http://localhost:"+randomServerPort;
        for (int i = 0; i < 10; i++) {
            HttpUriRequest request = new HttpGet( url+"/TempConverter/ToCelsius/10");
            HttpResponse httpResponse = HttpClientBuilder.create().build().execute( request );
             assertThat(httpResponse.getStatusLine().getStatusCode(),equalTo(HttpStatus.SC_ACCEPTED));
        }
    }

}   