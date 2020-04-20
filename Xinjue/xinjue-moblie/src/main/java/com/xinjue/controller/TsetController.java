package com.xinjue.controller;

import com.xinjue.common.BaseController;
import com.xinjue.common.Globals;
import com.xinjue.common.InquiryCondition;
import com.xinjue.common.JsonData;
import com.xinjue.meta.User;
import com.xinjue.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController  //返回json数据格式  不能返回页面
public class TsetController extends BaseController {

    @Autowired userService userService;

    /**
     * 测试获取数据
     * @param request
     * @param response
     * @throws IOException
     */
    @RequestMapping(value = "/getdate",method = RequestMethod.POST)
    public  String getdate(HttpServletRequest request, HttpServletResponse response) throws IOException{
        InquiryCondition InquiryCondition = new InquiryCondition();
        int total = userService.countALL(InquiryCondition);
        setPagePrmt_line(request, InquiryCondition, total, "1", 10);
        List<User> list = userService.selectAll(InquiryCondition);
        JsonData json = null;
        if(list.size()>0){
            json = new JsonData(Globals.SUCCESS,"",list,total);
        }else{
            json = new JsonData(Globals.SYSTEM_BUSY,"","");
        }
        return  json.toJsonString();

    }
}
