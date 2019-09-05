package maven.service.Impl;

import maven.dao.CourseMapper;
import maven.dao.GradeMapper;
import maven.dao.InfoMapper;
import maven.pojo.Course;
import maven.pojo.Grade;
import maven.pojo.Info;
import maven.pojo.Teacherinfo;
import maven.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoServiceImpl implements InfoService {

    @Autowired
    InfoMapper infoMapper;
    @Autowired
    CourseMapper courseMapper;
    @Autowired
    GradeMapper gradeMapper;

    @Override
    public List<Teacherinfo> selectTeacher() {
        return infoMapper.selectTeacher();
    }
    @Override
    public Info selectInfoById(int id) {
        return infoMapper.selectByUserId(id);
    }

    @Override
    public Course getCourse(int id) {
        return courseMapper.selectByPrimaryKey(id);
    }

    @Override
    public Grade getGrade(int id) {
        return gradeMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Info> permission() {
        return infoMapper.selectPermission();
    }

    @Override
    public void failInfo(int id) {
        infoMapper.failInfo(id);
    }

    @Override
    public void passInfo(int id) {
        infoMapper.passInfo(id);
    }
}
