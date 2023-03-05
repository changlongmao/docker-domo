
package com.example.dockerdemo;

import org.springframework.web.bind.annotation.*;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

/**
 * @ClassName: TestClassController
 * @Description:
 * @Author: Chang
 * @Date: 2021/01/24 21:14
 **/
@RequestMapping("/testClass")
@RestController
public class TestClassController {


    @GetMapping("/testDocker")
    public RestResponse testClass(@RequestParam Map<String, Object> map) throws Exception{
        return RestResponse.success("请求进来了：" + map.get("a"));
    }

}
