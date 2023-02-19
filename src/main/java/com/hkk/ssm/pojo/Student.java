package com.hkk.ssm.pojo;

public class Student {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student.student_id
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    private Integer studentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student.student_studentid
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    private Integer studentStudentid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student.student_name
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    private String studentName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student.student_sex
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    private String studentSex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student.student_phone
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    private Long studentPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student.student_classid
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    private Integer studentClassid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student.student_classname
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    private Integer studentClassname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student.student_dormitoryid
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    private Integer studentDormitoryid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student.student_id
     *
     * @return the value of t_student.student_id
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    public Integer getStudentId() {
        return studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student.student_id
     *
     * @param studentId the value for t_student.student_id
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student.student_studentid
     *
     * @return the value of t_student.student_studentid
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    public Integer getStudentStudentid() {
        return studentStudentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student.student_studentid
     *
     * @param studentStudentid the value for t_student.student_studentid
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    public void setStudentStudentid(Integer studentStudentid) {
        this.studentStudentid = studentStudentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student.student_name
     *
     * @return the value of t_student.student_name
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student.student_name
     *
     * @param studentName the value for t_student.student_name
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student.student_sex
     *
     * @return the value of t_student.student_sex
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    public String getStudentSex() {
        return studentSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student.student_sex
     *
     * @param studentSex the value for t_student.student_sex
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex == null ? null : studentSex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student.student_phone
     *
     * @return the value of t_student.student_phone
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    public Long getStudentPhone() {
        return studentPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student.student_phone
     *
     * @param studentPhone the value for t_student.student_phone
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    public void setStudentPhone(Long studentPhone) {
        this.studentPhone = studentPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student.student_classid
     *
     * @return the value of t_student.student_classid
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    public Integer getStudentClassid() {
        return studentClassid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student.student_classid
     *
     * @param studentClassid the value for t_student.student_classid
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    public void setStudentClassid(Integer studentClassid) {
        this.studentClassid = studentClassid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student.student_classname
     *
     * @return the value of t_student.student_classname
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    public Integer getStudentClassname() {
        return studentClassname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student.student_classname
     *
     * @param studentClassname the value for t_student.student_classname
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    public void setStudentClassname(Integer studentClassname) {
        this.studentClassname = studentClassname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student.student_dormitoryid
     *
     * @return the value of t_student.student_dormitoryid
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    public Integer getStudentDormitoryid() {
        return studentDormitoryid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student.student_dormitoryid
     *
     * @param studentDormitoryid the value for t_student.student_dormitoryid
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    public void setStudentDormitoryid(Integer studentDormitoryid) {
        this.studentDormitoryid = studentDormitoryid;
    }
}