package aaa.com.Controller;


import aaa.com.Service.StatisService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@CrossOrigin
public class StatisController {
    @Resource
    StatisService ser;

    @RequestMapping("query")
    @ResponseBody
    public Object query(){
        ser.query();
        System.out.println(ser.query());
        return ser.query();

    }

}
