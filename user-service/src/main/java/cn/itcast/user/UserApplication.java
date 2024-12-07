package cn.itcast.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

/**
 * 如果不使用 @MapperScan，需要在每个 Mapper 接口上手动加上 @Mapper 注解进行标记，这样显得繁琐
 * @MapperScan 可以自动扫描一个包下的所有接口，简化配置。
 */

@MapperScan("cn.itcast.user.mapper")
@SpringBootApplication
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
