package com.owen.mall.product;


import com.baomidou.mybatisplus.autoconfigure.DdlApplicationRunner;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;


@MapperScan("com.owen.mall.product.dao")
@SpringBootApplication
public class MallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }

    //  https://github.com/baomidou/mybatis-plus/issues/5867
    // 临时解决问题，等待后续版本升级
    @Bean
    public DdlApplicationRunner ddlApplicationRunner(@Autowired(required = false) List ddlList) {
        return new DdlApplicationRunner(ddlList);
    }

}
