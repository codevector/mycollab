/*Domain class of table m_prj_notifications*/
package com.mycollab.module.project.domain;

import com.mycollab.core.arguments.ValuedBean;
import com.mycollab.db.metadata.Column;
import com.mycollab.db.metadata.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.ibatis.type.Alias;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
@Table("m_prj_notifications")
@Alias("ProjectNotificationSetting")
public class ProjectNotificationSetting extends ValuedBean {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_notifications.id
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    @Column("id")
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_notifications.username
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    @NotEmpty
    @Length(max=45, message="Field value is too long")
    @Column("username")
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_notifications.projectId
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    @NotNull
    @Column("projectId")
    private Integer projectid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_notifications.sAccountId
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    @NotNull
    @Column("sAccountId")
    private Integer saccountid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_notifications.level
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    @NotEmpty
    @Length(max=45, message="Field value is too long")
    @Column("level")
    private String level;

    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        if (obj == null) { return false;}
        if (obj == this) { return true;}
        if (!obj.getClass().isAssignableFrom(getClass())) { return false;}
        ProjectNotificationSetting item = (ProjectNotificationSetting)obj;
        return new EqualsBuilder().append(id, item.id).build();
    }

    public final int hashCode() {
        return new HashCodeBuilder(25, 27).append(id).build();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_notifications.id
     *
     * @return the value of m_prj_notifications.id
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_notifications
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    public ProjectNotificationSetting withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_notifications.id
     *
     * @param id the value for m_prj_notifications.id
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_notifications.username
     *
     * @return the value of m_prj_notifications.username
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_notifications
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    public ProjectNotificationSetting withUsername(String username) {
        this.setUsername(username);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_notifications.username
     *
     * @param username the value for m_prj_notifications.username
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_notifications.projectId
     *
     * @return the value of m_prj_notifications.projectId
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_notifications
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    public ProjectNotificationSetting withProjectid(Integer projectid) {
        this.setProjectid(projectid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_notifications.projectId
     *
     * @param projectid the value for m_prj_notifications.projectId
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_notifications.sAccountId
     *
     * @return the value of m_prj_notifications.sAccountId
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_notifications
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    public ProjectNotificationSetting withSaccountid(Integer saccountid) {
        this.setSaccountid(saccountid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_notifications.sAccountId
     *
     * @param saccountid the value for m_prj_notifications.sAccountId
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_notifications.level
     *
     * @return the value of m_prj_notifications.level
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    public String getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_notifications
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    public ProjectNotificationSetting withLevel(String level) {
        this.setLevel(level);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_notifications.level
     *
     * @param level the value for m_prj_notifications.level
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    public void setLevel(String level) {
        this.level = level;
    }

    public enum Field {
        id,
        username,
        projectid,
        saccountid,
        level;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}