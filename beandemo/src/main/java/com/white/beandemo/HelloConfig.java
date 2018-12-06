package com.white.beandemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfig{
   @Bean 
   public helloworld helloworld(){
      return new helloworld();
   }
}
