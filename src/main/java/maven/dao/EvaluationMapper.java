package maven.dao;

import java.util.List;
import maven.pojo.Evaluation;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EvaluationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluation
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluation
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    int insert(Evaluation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluation
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    Evaluation selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluation
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    List<Evaluation> selectAll(int id);

    List<Evaluation> selectEvaInfo(int id);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluation
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    int updateByPrimaryKey(Evaluation record);


}