package com.xinjue.controller;


import com.xinjue.common.BaseController;
import com.xinjue.common.InquiryCondition;
import com.xinjue.meta.User;
import com.xinjue.service.userService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class IndexController extends BaseController {
    @Resource userService userService;
    @RequestMapping(value = "index1")
    public  String index(HttpServletRequest request, HttpServletResponse response) throws IOException {
        InquiryCondition InquiryCondition = new InquiryCondition();
        int total = userService.countALL(InquiryCondition);
        setPagePrmt_line(request, InquiryCondition, total, "1", 10);
        List<User> list = userService.selectAll(InquiryCondition);
        request.setAttribute("list",list);
        return "index";
    }
}
