package com.yixiao;

import java.util.List;
import com.yixiao.domain.User;
import com.yixiao.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestCRUDByXmlMapper {

    @Test
    public void testAdd() {
        //SqlSession sqlSession = MyBatisButil.getSqlSession(false);
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        /*
        映射sql的标识字符串
         */
        String statement = "com.yixiao.mapper.UserMapper.addUser";//映射SQL的标识字符串
        User user = new User();
        user.setName("用户四");
        user.setAge(10);
        //执行插入操作
        int retResult = sqlSession.insert(statement,user);
        //手动提交事务操作
        //sqlSession.commit();
        //使用SqlSesssion执行完SQL之后需要关闭SqlSession
        sqlSession.close();
        System.out.println(retResult);
    }
    @Test
    public void testUpdate(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        /*
        映射SQL的标识字符
         */
        String statement = "com.yixiao.mapper.UserMapper.updateUser";
        User user = new User();
        user.setId(2);
        user.setName("用户王王");
        user.setAge(25);
        //执行修改操作
        int retResult = sqlSession.update(statement,user);
        //使用SqlSession执行完后需要关闭SqlSession
        sqlSession.close();
        System.out.println(retResult);
    }
    @Test
    public void testDelete(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        String statement = "com.yixiao.mapper.UserMapper.deleteUser";
        //执行删除操作
        int retResult = sqlSession.delete(statement,13);
        sqlSession.close();
        System.out.println(retResult);
    }
    @Test
    public void testGetAll(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        String statement = "com.yixiao.mapper.UserMapper.getAllUsers";
        //执行查询操作 将查询结果自动封装成List<User>返回
        List<User> lstUsers = sqlSession.selectList(statement);
        sqlSession.close();
        System.out.println(lstUsers);
    }
}