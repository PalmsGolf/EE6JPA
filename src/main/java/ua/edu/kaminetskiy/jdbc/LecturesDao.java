
package ua.edu.kaminetskiy.jdbc;

import ua.edu.kaminetskiy.jdbc.dao.impl.Lecture;


public interface LecturesDao 
{
    Lecture addLecture(Lecture lecture);
    Lecture getLecture(int id);
    void saveLecture(Lecture lecture);
}
