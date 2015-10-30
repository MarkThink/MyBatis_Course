package com.yixiao;

import com.yixiao.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class MainApp {

    public static void main(String[] args) throws IOException {
        String resource = "mybatis.xml";
//        InputStream inputStream = MainApp.class.getClassLoader().getResourceAsStream(resource);
        Reader reader = Resources.getResourceAsReader(resource);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();
        String statement = "com.yixiao.mapper.UserMapper.getUser";
        User user = session.selectOne(statement,1);
        System.out.println(user);
    }
}
