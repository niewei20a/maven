package maven.service;

import maven.pojo.Course;
import maven.pojo.Grade;
import maven.pojo.Info;
import maven.pojo.Teacherinfo;

import java.util.List;

public interface InfoService {
    List<Teacherinfo> selectTeacher();
    Info selectInfoById(int id);

    Course getCourse(int id);
    Grade getGrade(int id);

    List<Info> permission();

    void failInfo(int id);
    void passInfo(int id);
}
