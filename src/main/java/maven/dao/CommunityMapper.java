package maven.dao;

import java.util.List;
import maven.pojo.Community;

public interface CommunityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table community
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table community
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    int insert(Community record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table community
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    Community selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table community
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    List<Community> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table community
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    int updateByPrimaryKey(Community record);
}