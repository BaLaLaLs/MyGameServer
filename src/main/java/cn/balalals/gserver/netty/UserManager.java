package cn.balalals.gserver.netty;

import io.netty.channel.Channel;

import java.util.HashMap;

class UserManager {
    private UserManager() {
    }

    private static HashMap<String, Channel> users = new HashMap<>();

    public static void addUser(String userId, Channel channel) {
        System.out.println("添加用户  --- " + userId);
        users.put(userId, channel);
    }
}
