package com.nowcoder.community.dao;

import com.nowcoder.community.entity.Students;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentsMapper {
    Students selectByidcard(String idcard);
}
