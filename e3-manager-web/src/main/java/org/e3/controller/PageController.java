package org.e3.controller;

/**
 * @author xujin
 * @package-name org.e3.controller
 * @createtime 2019-10-04 11:43
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转controller
 */
@Controller
public class PageController {
    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }

    @RequestMapping("/{page}")
    public String showPage(@PathVariable(value ="page")String page){
        return page;
    }
}
