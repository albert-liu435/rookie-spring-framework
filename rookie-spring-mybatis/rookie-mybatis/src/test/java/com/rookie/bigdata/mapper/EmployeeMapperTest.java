package com.rookie.bigdata.mapper;

import com.rookie.bigdata.entity.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @Author rookie
 * @Description
 * @Date 2024/11/25 20:06
 * @Version 1.0
 */
class EmployeeMapperTest {

    @Test
    void getAll() throws Exception{
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
            List<Employee> all = employeeMapper.getAll();
            for (Employee item : all)
                System.out.println(item);
        } finally {
            sqlSession.close();
        }

    }
}