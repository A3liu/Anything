package com.a3.test;





import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: liuyaosen
 * @Date: 2019/1/8 22:10
 */
public class TestHashMap {
    public static void main(String[] args) {
        ConcurrentHashMap<String, User> map = new ConcurrentHashMap<>();
        map.put("1",new User("a1",1));
        map.put("2",new User("a2",2));
        map.put("3",new User("a3",3));
        map.put("4",new User("a4",4));
        User user=new User("a5",5);
        map.put("5",user);
        System.out.println(map);
        System.out.println();
        user =user.getClone();
        user.setAge(999);
        System.out.println(map);
    }
}
