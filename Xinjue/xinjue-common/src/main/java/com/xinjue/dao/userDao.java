package com.xinjue.dao;

import com.xinjue.common.InquiryCondition;
import com.xinjue.meta.User;

import java.util.List;

public interface userDao {
    public int countALL(InquiryCondition InquiryCondition);
    public List<User> selectAll(InquiryCondition InquiryCondition);
}
