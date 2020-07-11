package com.xj;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 备品备件服务
 *
 * @author： chenr
 * @date： Created on 2020/07/09 20:36
 * @version： v1.0
 * @modified By:
 */
//@EnableFeignClients
//@SpringCloudApplication
@EnableSwagger2Doc
@EnableScheduling
@SpringBootApplication(scanBasePackages = {"com.xj.work"})
public class SparePartsApplication {
    public static void main(String[] args ) {
        SpringApplication.run(SparePartsApplication.class,args);
    }
}
