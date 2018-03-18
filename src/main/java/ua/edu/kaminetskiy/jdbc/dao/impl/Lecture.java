/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.kaminetskiy.jdbc.dao.impl;

import javax.persistence.*;

@Entity
@Table(name="db_department.lectures")

public class Lecture 
{
    @Id
    @GeneratedValue
    @Column(name = "ID")
    
    private int id;
    private String name;
    private double credits;

    public void setName(String _name) 
    {
       name = _name;
    }

    public void setCredits(double _credits) 
    {
       credits = _credits;
    }
}