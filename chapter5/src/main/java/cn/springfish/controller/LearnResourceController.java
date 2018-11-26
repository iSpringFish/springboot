package cn.springfish.controller;

import cn.springfish.domain.LearnResource;
import cn.springfish.service.LearnResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author quanyu
 * @date 2018/11/26 19:13
 */
@Controller
@RequestMapping("/learn")
public class LearnResourceController {

    @Autowired
    LearnResourceService learnResourceService;

    @RequestMapping("")
    public ModelAndView index(){

        List<LearnResource> resourceList = learnResourceService.listResource();
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("resourceList",resourceList);
        return modelAndView;
    }
}
