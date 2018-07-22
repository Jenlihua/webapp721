package com.gumei.spingbootmvc.log;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class LoggingLevelController {

    @RequestMapping("/log")
    @ResponseBody
    String loglevel(){
        log.trace("日志级别 trace");
        log.debug("日志级别 debug");
        log.info("日志级别 info");
        log.warn("日志级别 warn");
        log.error("日志级别 error");
        String level ="info";
        String name ="jen";
        log.info("日志级别： {}， name:{} ",level,name);

        return "see log";

    }
}
