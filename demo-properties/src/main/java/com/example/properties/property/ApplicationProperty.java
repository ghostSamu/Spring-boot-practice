package com.example.properties.property;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Description: 包括 get（） set（） toString（）
 */
@Data
/**
 * @Description: 表明是bean（一般不指明用途的时候用） 注入到springboot容器中
 */
@Component
public class ApplicationProperty {
    /**
     * @Description: 加载外部属性文件中的值  一般用来获取单个属性值  @Value与Configuration的作用相同
     */
    @Value("${application.name}")
    private String name;
    @Value("${application.version}")
    private String version;
}
