package maven.pojo;

import java.util.Date;

public class Community {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column community.id
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column community.father
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    private Integer father;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column community.userId
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column community.comment
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    private String comment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column community.time
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    private Date time;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column community.id
     *
     * @return the value of community.id
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column community.id
     *
     * @param id the value for community.id
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column community.father
     *
     * @return the value of community.father
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    public Integer getFather() {
        return father;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column community.father
     *
     * @param father the value for community.father
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    public void setFather(Integer father) {
        this.father = father;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column community.userId
     *
     * @return the value of community.userId
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column community.userId
     *
     * @param userid the value for community.userId
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column community.comment
     *
     * @return the value of community.comment
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column community.comment
     *
     * @param comment the value for community.comment
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column community.time
     *
     * @return the value of community.time
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column community.time
     *
     * @param time the value for community.time
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    public void setTime(Date time) {
        this.time = time;
    }
}