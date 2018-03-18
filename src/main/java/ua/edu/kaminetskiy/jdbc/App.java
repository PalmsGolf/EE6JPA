/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.kaminetskiy.jdbc;

import ua.edu.kaminetskiy.jdbc.LecturesWorker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.edu.kaminetskiy.jdbc.dao.impl.Lecture;


public class App
{
    public static void main( String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        
        Lecture lecture = new Lecture();
        
        lecture.setName("Introduction to Spring");
        lecture.setCredits(2.5);
        
        LecturesWorker worker = (LecturesWorker)context.getBean("worker");
        worker.addLecture(lecture);
    }
}
