package com.example.properties.controller;

import cn.hutool.core.lang.Dict;
import com.example.properties.property.ApplicationProperty;
import com.example.properties.property.DeveloperProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 实例化下面两个对象
 */
@RestController
public class PropertyController {
    private final ApplicationProperty applicationProperty;
    private final DeveloperProperty developerProperty;

    /**
     * @Description: 有参构造函数 自动装配  属性赋值
     */
    @Autowired
    public PropertyController(ApplicationProperty applicationProperty, DeveloperProperty developerProperty){
        this.applicationProperty = applicationProperty;
        this.developerProperty =developerProperty;
    }

    @GetMapping("/property")
    public Dict index(){
        return Dict.create().set("applicationProperty",applicationProperty).set("developerProperty",developerProperty);
    }

}
