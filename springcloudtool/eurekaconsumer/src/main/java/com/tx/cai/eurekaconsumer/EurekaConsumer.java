package com.tx.cai.eurekaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class EurekaConsumer
{
    public static void main( String[] args )
    {
        SpringApplication.run(EurekaConsumer.class,args);
        //System.out.println( "Hello World!" );
    }
}
