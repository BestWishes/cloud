package com.bestwish.userservice.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long createBy;
    private Long createTimeSpan = new Date().getTime();
    private Date createDate = new Date();

    private Long updateBy;
    private Long updateTimeSpan = new Date().getTime();
    private Date updateDate = new Date();
    private Boolean deletedFlag = Boolean.FALSE;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreateTimeSpan() {
        return createTimeSpan;
    }

    public void setCreateTimeSpan(Long createTimeSpan) {
        this.createTimeSpan = createTimeSpan;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public Long getUpdateTimeSpan() {
        return updateTimeSpan;
    }

    public void setUpdateTimeSpan(Long updateTimeSpan) {
        this.updateTimeSpan = updateTimeSpan;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Boolean getDeletedFlag() {
        return deletedFlag;
    }

    public void setDeletedFlag(Boolean deletedFlag) {
        this.deletedFlag = deletedFlag;
    }


}
