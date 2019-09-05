package maven.dao;

import java.util.List;
import maven.pojo.Apply;
import maven.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ApplyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    int insert(Apply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    Apply selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    List<Apply> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    int updateByPrimaryKey(Apply record);

    int selectByTwoId(Apply apply);

    List<User> selectByUserId(int id);

    int updatePermission(Apply apply);
}