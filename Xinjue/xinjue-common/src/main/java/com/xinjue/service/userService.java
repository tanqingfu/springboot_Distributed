package com.xinjue.service;



import com.xinjue.common.InquiryCondition;
import com.xinjue.meta.User;

import java.util.List;

public interface userService {
    public int countALL(InquiryCondition InquiryCondition);
    public List<User> selectAll(InquiryCondition InquiryCondition);
}
