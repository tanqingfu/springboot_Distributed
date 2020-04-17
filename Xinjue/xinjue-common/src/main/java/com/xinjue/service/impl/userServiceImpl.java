package com.xinjue.service.impl;

import com.xinjue.common.InquiryCondition;
import com.xinjue.dao.userDao;
import com.xinjue.meta.User;
import com.xinjue.service.userService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class userServiceImpl implements userService {

    @Resource
    userDao UserDao;
    @Override
    public int countALL(InquiryCondition InquiryCondition) {
        int total = UserDao.countALL(InquiryCondition);
        return total;
    }

    @Override
    public List<User> selectAll(InquiryCondition InquiryCondition) {
        List<User> list = UserDao.selectAll(InquiryCondition);
        return list;
    }
}
