package com.itheima.edu.info.manager.web;

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.service.StudentService;

import java.util.Scanner;

/**
 * 学生管理系统入口
 */
public class StudentController {
    private Scanner scanner = new Scanner(System.in);
    /**
     * 启动学生管理系统
     */
    public void start(){
        stuStop:while (true) {
            System.out.println("--------欢迎来到 <学生> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");
            String item = scanner.next();
            switch (item) {
                case "1":
                    //添加学生
                    addStudent();
                    break;
                case "2":
                    //删除学生
                    deleteStudentById();
                    break;
                case "3":
                    //修改学生
                    updateStudentById();
                    break;
                case "4":
                    //查看学生
                    findAllStudent();
                    break;
                case "5":
                    //退出学生管理系统
                    System.out.println("感谢您使用学生管理系统, 再见!");
                    break stuStop;
                default:
                    System.out.println("您的输入有误, 请重新输入");
                    break;
            }
        }
    }
    /**
     * 查询学生
     */
    private void findAllStudent() {
    }
    /**
     * 通过id修改学生
     */
    private void updateStudentById() {
    }

    /**
     * 通过id删除学生
     */
    private void deleteStudentById() {
    }

    /**
     * 添加学生
     */
    private void addStudent() {
        System.out.println("请输入学生学号:");
        String id = scanner.next();
        System.out.println("请输入学生姓名:");
        String name = scanner.next();
        System.out.println("请输入学生年龄:");
        String age = scanner.next();
        System.out.println("请输入学生生日:");
        String birthday = scanner.next();
        //封装用户录入的数据
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setBirthday(birthday);

        StudentService studentService = new StudentService();
        boolean result = studentService.addStudent(student);
        if (result){
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败");
        }
    }
}