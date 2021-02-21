package com.example.helloworld;

import cn.hutool.core.util.StrUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
* @Description:配置注释 包括@config @sacn @autoconfig
*/
@SpringBootApplication
/**
 * @Description:Rest方式的请求，前后端分离  包括@controller @responsebody  返回值直接放入到应答体中
 */
@RestController
public class SpringBootDemoHelloworldApplication{
    public static void main(String[] args){
        SpringApplication.run(SpringBootDemoHelloworldApplication.class,args);
    }
    /**
     * @Description:路径注释 URl中如果有/hello的话  就执行下面的方法
     */
    @GetMapping("/hello")
    /**
     * @Description:参数注释 如果URL中有who参数  就将其值付给下面的形参
     */
    public String sayHello(@RequestParam(required = false,name = "who") String who){
        if (StrUtil.isBlank(who)){
            who = "worlds";
        }
        return StrUtil.format("hello, {}!",who);
    }
}
