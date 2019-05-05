package com.pzhu.shopping.myshop;

import com.pzhu.shopping.myshop.commons.redis.JedisClientPool;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.pzhu.shopping.myshop.mapper")
public class MyshopApplication {
    @Autowired
    public JedisClientPool jedisClientPool;
    public static void main(String[] args) {
        SpringApplication.run(MyshopApplication.class, args);
    }

}
