package maven.service;

import maven.pojo.Apply;
import maven.pojo.Evaluation;
import maven.pojo.Record;
import maven.pojo.User;

import java.util.List;

public interface ApplyService {

    int insert(Apply apply);
    int selectByTwoId(Apply apply);

    List<User> selectByUserId(int id);

    int insertRecord(Record record);

    int updatePermission(Apply apply);

    List<Record> selectAllById(int id);

    List<Evaluation> selectEva(int id);

    int insertEva(Evaluation evaluation);

    List<Evaluation> selectEvaInfo(int id);
}
