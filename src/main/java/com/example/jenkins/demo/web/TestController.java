package com.example.jenkins.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <dl>
 * <dd>描述: ~节点业务逻辑实现</dd>
 * <dd>创建时间：  13:59 2018/8/28</dd>
 * <dd>创建人： zz</dd>
 * <dt>版本历史: </dt>
 * <pre>
 * Date         Author      Version     Description
 * ------------------------------------------------------------------
 * 2018/8/28      guodong       1.0        1.0 Version
 * </pre>
 * </dl>
 */
@RestController
public class TestController {

    @GetMapping("/HelloWorld")
    public String getHelloWorld(){
        return "Hello World";
    }

}
