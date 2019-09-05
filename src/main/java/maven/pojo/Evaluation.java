package maven.pojo;

public class Evaluation {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column evaluation.id
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column evaluation.userId
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column evaluation.infoId
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    private Integer infoid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column evaluation.comment
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    private String comment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column evaluation.star
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    private Integer star;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column evaluation.id
     *
     * @return the value of evaluation.id
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column evaluation.id
     *
     * @param id the value for evaluation.id
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column evaluation.userId
     *
     * @return the value of evaluation.userId
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column evaluation.userId
     *
     * @param userid the value for evaluation.userId
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column evaluation.infoId
     *
     * @return the value of evaluation.infoId
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    public Integer getInfoid() {
        return infoid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column evaluation.infoId
     *
     * @param infoid the value for evaluation.infoId
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    public void setInfoid(Integer infoid) {
        this.infoid = infoid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column evaluation.comment
     *
     * @return the value of evaluation.comment
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column evaluation.comment
     *
     * @param comment the value for evaluation.comment
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column evaluation.star
     *
     * @return the value of evaluation.star
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    public Integer getStar() {
        return star;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column evaluation.star
     *
     * @param star the value for evaluation.star
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    public void setStar(Integer star) {
        this.star = star;
    }

    @Override
    public String toString() {
        return "Evaluation{" +
                "id=" + id +
                ", userid=" + userid +
                ", infoid=" + infoid +
                ", comment='" + comment + '\'' +
                ", star=" + star +
                '}';
    }
}