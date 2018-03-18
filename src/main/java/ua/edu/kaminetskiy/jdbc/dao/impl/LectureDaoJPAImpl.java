/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.kaminetskiy.jdbc.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.edu.kaminetskiy.jdbc.LecturesDao;

@Repository
@Transactional

public class LectureDaoJPAImpl implements LecturesDao
{  
    @PersistenceContext
    private EntityManager em;

    public Lecture addLecture(Lecture lecture) 
    {
     em.persist(lecture);
     return lecture;
    }

    public Lecture getLecture(int id) 
    {
     return em.find(Lecture.class,id);
    }
   
    public void saveLecture(Lecture lecture)
    {
     em.merge(lecture);
    }
}