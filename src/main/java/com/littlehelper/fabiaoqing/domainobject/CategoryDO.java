package com.littlehelper.fabiaoqing.domainobject;

import java.util.Date;

public class CategoryDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_category.object_id
     *
     * @mbg.generated Wed May 29 16:18:58 CST 2019
     */
    private String objectId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_category.name
     *
     * @mbg.generated Wed May 29 16:18:58 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_category.seq
     *
     * @mbg.generated Wed May 29 16:18:58 CST 2019
     */
    private Integer seq;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_category.create_time
     *
     * @mbg.generated Wed May 29 16:18:58 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_category.update_time
     *
     * @mbg.generated Wed May 29 16:18:58 CST 2019
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_category.object_id
     *
     * @return the value of t_category.object_id
     *
     * @mbg.generated Wed May 29 16:18:58 CST 2019
     */
    public String getObjectId() {
        return objectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_category.object_id
     *
     * @param objectId the value for t_category.object_id
     *
     * @mbg.generated Wed May 29 16:18:58 CST 2019
     */
    public void setObjectId(String objectId) {
        this.objectId = objectId == null ? null : objectId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_category.name
     *
     * @return the value of t_category.name
     *
     * @mbg.generated Wed May 29 16:18:58 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_category.name
     *
     * @param name the value for t_category.name
     *
     * @mbg.generated Wed May 29 16:18:58 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_category.seq
     *
     * @return the value of t_category.seq
     *
     * @mbg.generated Wed May 29 16:18:58 CST 2019
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_category.seq
     *
     * @param seq the value for t_category.seq
     *
     * @mbg.generated Wed May 29 16:18:58 CST 2019
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_category.create_time
     *
     * @return the value of t_category.create_time
     *
     * @mbg.generated Wed May 29 16:18:58 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_category.create_time
     *
     * @param createTime the value for t_category.create_time
     *
     * @mbg.generated Wed May 29 16:18:58 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_category.update_time
     *
     * @return the value of t_category.update_time
     *
     * @mbg.generated Wed May 29 16:18:58 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_category.update_time
     *
     * @param updateTime the value for t_category.update_time
     *
     * @mbg.generated Wed May 29 16:18:58 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}