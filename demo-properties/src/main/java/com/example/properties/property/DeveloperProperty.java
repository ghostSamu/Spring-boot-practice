package com.example.properties.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
/**
 * @Description: 加载META-INF目录下的json配置文件中的值   一般用来将整个配置文件封装成对象  @Value与Configuration的作用相同
 */
@ConfigurationProperties(prefix = "developer")
/**
 * @Description: 表明是bean（一般不指明用途的时候用） 注入到springboot容器中
 */
@Component
public class DeveloperProperty {
    private String name;
    private String website;
    private String qq;
    private String phoneNumber;
}
