package maven.pojo;

public class Course {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.id
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.courseName
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    private String coursename;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.id
     *
     * @return the value of course.id
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.id
     *
     * @param id the value for course.id
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.courseName
     *
     * @return the value of course.courseName
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    public String getCoursename() {
        return coursename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.courseName
     *
     * @param coursename the value for course.courseName
     *
     * @mbggenerated Mon Sep 02 14:34:23 CST 2019
     */
    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }
}