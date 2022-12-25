package com.yuan.io;

public class LogTest {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.log("用户尝试登录，结果失败");
        logger.log("用户尝试注销账号，结果失败");
        logger.log("用户登录成功");
    }
}
