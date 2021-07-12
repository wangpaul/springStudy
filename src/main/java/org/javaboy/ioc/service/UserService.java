package org.javaboy.ioc.service;

import org.javaboy.ioc.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/7/12 08:55
 */
@Service
public class UserService {
    @Autowired
    UserDao userdao;

    public List<String> getUsers(){
        String hello = userdao.hello();
        System.out.println(hello);
        ArrayList<String> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            users.add("wzz love cc:" + i);
        }

        return users;
    }
}
