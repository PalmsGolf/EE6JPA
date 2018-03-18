/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.kaminetskiy.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import ua.edu.kaminetskiy.jdbc.dao.impl.Lecture;

public class LecturesWorker 
{
    @Autowired
    LecturesDao lecturesDao;
    
    public Lecture addLecture(Lecture lecture)
    {
        lecture = lecturesDao.addLecture(lecture);
        System.out.println("lecture :"+lecture);
        return lecture;
    }
}
