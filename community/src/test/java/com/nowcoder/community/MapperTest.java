package com.nowcoder.community;

import com.nowcoder.community.dao.StudentsMapper;
import com.nowcoder.community.entity.Students;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MapperTest {
    @Autowired
    private StudentsMapper studentsMapper;

    @Test
    public void testSelect(){
        Students students=studentsMapper.selectByidcard("19030500060");
        System.out.println(students);
    }
}
