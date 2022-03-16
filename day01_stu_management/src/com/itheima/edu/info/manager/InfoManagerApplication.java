package com.itheima.edu.info.manager;

import com.itheima.edu.info.manager.web.StudentController;

import java.util.Scanner;

public class InfoManagerApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // 主菜单搭建
            System.out.println("--------欢迎来到黑马信息管理系统--------");
            System.out.println("请输入您的选择: 1.学生管理  2.老师管理  3.退出");
            switch (scanner.next()){
                case "1":
                    //学生管理系统
                    new StudentController().start();
                    break;
                case "2":
                    //老师管理系统
                    break;
                case "3":
                    //退出系统
                    //强制退出虚拟机
                    System.exit(0);
                    break;
            }
        }
    }
}
