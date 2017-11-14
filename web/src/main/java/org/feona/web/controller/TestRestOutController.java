package org.feona.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @AUTHER feona
 * @CREATE 2017/11/10  14:17
 **/
@Controller
@RequestMapping("/test/")
public class TestRestOutController {

    @RequestMapping(value = "timeOut")
    @ResponseBody
    public String restTimeOut() {
        try {
            Thread.sleep(10*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello tester";
    }

}
