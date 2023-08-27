package com.bofa.demo.demosessionexternalization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableCaching
public class DemoSessionExternalizationApplication {

    public static void main(String[] args) {
        ApplicationContext ctx =  SpringApplication.run(DemoSessionExternalizationApplication.class, args);
        //displayAllBeans(ctx);
    }

    public static void displayAllBeans(ApplicationContext ctx) {
        List<String> beans = Arrays.asList(ctx.getBeanDefinitionNames());

        beans.forEach((n) -> {
            System.out.println("*** A bean: " + n);
        });
    }
}
