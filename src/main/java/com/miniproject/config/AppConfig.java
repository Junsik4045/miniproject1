package com.miniproject.config;

import com.miniproject.entity.BoardDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public BoardDao BoardDao(){
        return new BoardDao();
    }

}
