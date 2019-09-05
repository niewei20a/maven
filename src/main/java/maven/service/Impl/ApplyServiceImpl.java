package maven.service.Impl;

import maven.dao.ApplyMapper;
import maven.dao.EvaluationMapper;
import maven.dao.RecordMapper;
import maven.pojo.Apply;
import maven.pojo.Evaluation;
import maven.pojo.Record;
import maven.pojo.User;
import maven.service.ApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplyServiceImpl implements ApplyService {

    @Autowired
    ApplyMapper applyMapper;

    @Autowired
    RecordMapper recordMapper;

    @Autowired
    EvaluationMapper evaluationMapper;

    @Override
    public int insert(Apply apply) {
       return applyMapper.insert(apply);
    }

    @Override
    public int selectByTwoId(Apply apply) {
        return applyMapper.selectByTwoId(apply);
    }

    @Override
    public List<User> selectByUserId(int id) {
        return applyMapper.selectByUserId(id);
    }

    @Override
    public int insertRecord(Record record) {
        return recordMapper.insert(record);
    }

    @Override
    public int updatePermission(Apply apply) {
        return applyMapper.updatePermission(apply);
    }

    @Override
    public List<Record> selectAllById(int id) {
        return recordMapper.selectAllById(id);
    }

    @Override
    public List<Evaluation> selectEva(int id) {
        return evaluationMapper.selectAll(id);
    }

    @Override
    public int insertEva(Evaluation evaluation) {
        return evaluationMapper.insert(evaluation);
    }

    @Override
    public List<Evaluation> selectEvaInfo(int id) {
        return evaluationMapper.selectEvaInfo(id);
    }
}
