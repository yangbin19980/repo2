package com.itheima.edu.info.manager.service;

import com.itheima.edu.info.manager.dao.StudentDao;
import com.itheima.edu.info.manager.domain.Student;

public class StudentService {
    /**
     * 添加学生，返回controller成功或者失败
     * @return
     */
    public boolean addStudent(Student stu){
        //把学生对象传递给dao,获取dao返回的结果
        StudentDao studentDao = new StudentDao();
        boolean result = studentDao.addStudent(stu);
        return true;
    }
}
