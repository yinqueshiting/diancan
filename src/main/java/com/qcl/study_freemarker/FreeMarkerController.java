package com.qcl.study_freemarker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 作者：编程小石头
 */
@Controller
public class FreeMarkerController {

    @GetMapping("/fm")
    public String hello(@RequestParam(name = "age") int age, ModelMap map) {
        String[] listArr = {
                "第一条数据",
                "第2条数据",
                "第3条数据",
                "第4条数据",
                "第5条数据"
        };
        map.put("name", "编程小石头");
        map.put("list", listArr);
        map.put("age", age);
        return "hello";
    }
}
