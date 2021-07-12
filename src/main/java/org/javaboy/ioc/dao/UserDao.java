package org.javaboy.ioc.dao;

import org.springframework.stereotype.Repository;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/7/12 14:58
 */
@Repository
public class UserDao {
    public String hello(){
        return "hello";
    }
}
