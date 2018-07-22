package com.gumei.spingbootmvc.easy;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.Logger;

@Controller
@Slf4j
public class EasyServiceController {

    @RequestMapping("/hi")
    @ResponseBody
    String home(){

        log.trace("日志级别 trace");
        log.debug("日志级别 debug");
        log.info("日志级别 info");
        log.warn("日志级别 warn");
        log.error("日志级别 error");
        String level ="info";
        String name ="jen";
        log.info("日志级别： {}， name:{} ",level,name);
        return "how are you";
    }
}
