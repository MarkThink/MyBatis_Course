package com.yixiao.util;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MyBatisUtil {

    /*
    ��ȡSqlSessionFactory
     */
    public static SqlSessionFactory getSqlSessionFactory() {
        String resource = "mybatis.xml";
        InputStream inputStream = MyBatisUtil.class.getClassLoader().getResourceAsStream(resource);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        return factory;
    }

    /*
    ��ȡSqlSession
     */
    public static SqlSession getSqlSession() {
        return getSqlSessionFactory().openSession();
    }

    /*
    ��ȡSqlSession
    @param isAutoCommit
        true ��ʾ������SqlSession������ִ����SQL֮����Զ��ύ����
        false ��ʾ������SqlSession������ִ����SQL֮�󲻻��Զ��ύ������Ҫ�ֶ�����sqlSession.commit()�ύ����
     */
    public static SqlSession getSqlSession(boolean isAutoCommit){
        return getSqlSessionFactory().openSession(isAutoCommit);
    }
}
