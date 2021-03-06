/*Domain class of table m_prj_role*/
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
@Table("m_prj_role")
@Alias("ProjectRole")
public class ProjectRole extends ValuedBean {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_role.id
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    @Column("id")
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_role.roleName
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    @NotEmpty
    @Length(max=255, message="Field value is too long")
    @Column("roleName")
    private String rolename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_role.sAccountId
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    @NotNull
    @Column("sAccountId")
    private Integer saccountid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_role.projectId
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    @NotNull
    @Column("projectId")
    private Integer projectid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_role.isSystemRole
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    @Column("isSystemRole")
    private Boolean issystemrole;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_role.description
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    @Length(max=65535, message="Field value is too long")
    @Column("description")
    private String description;

    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        if (obj == null) { return false;}
        if (obj == this) { return true;}
        if (!obj.getClass().isAssignableFrom(getClass())) { return false;}
        ProjectRole item = (ProjectRole)obj;
        return new EqualsBuilder().append(id, item.id).build();
    }

    public final int hashCode() {
        return new HashCodeBuilder(1823, 1515).append(id).build();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_role.id
     *
     * @return the value of m_prj_role.id
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    public ProjectRole withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_role.id
     *
     * @param id the value for m_prj_role.id
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_role.roleName
     *
     * @return the value of m_prj_role.roleName
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    public String getRolename() {
        return rolename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    public ProjectRole withRolename(String rolename) {
        this.setRolename(rolename);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_role.roleName
     *
     * @param rolename the value for m_prj_role.roleName
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_role.sAccountId
     *
     * @return the value of m_prj_role.sAccountId
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    public ProjectRole withSaccountid(Integer saccountid) {
        this.setSaccountid(saccountid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_role.sAccountId
     *
     * @param saccountid the value for m_prj_role.sAccountId
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_role.projectId
     *
     * @return the value of m_prj_role.projectId
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    public ProjectRole withProjectid(Integer projectid) {
        this.setProjectid(projectid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_role.projectId
     *
     * @param projectid the value for m_prj_role.projectId
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_role.isSystemRole
     *
     * @return the value of m_prj_role.isSystemRole
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    public Boolean getIssystemrole() {
        return issystemrole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    public ProjectRole withIssystemrole(Boolean issystemrole) {
        this.setIssystemrole(issystemrole);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_role.isSystemRole
     *
     * @param issystemrole the value for m_prj_role.isSystemRole
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    public void setIssystemrole(Boolean issystemrole) {
        this.issystemrole = issystemrole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_role.description
     *
     * @return the value of m_prj_role.description
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    public ProjectRole withDescription(String description) {
        this.setDescription(description);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_role.description
     *
     * @param description the value for m_prj_role.description
     *
     * @mbg.generated Sat Feb 09 11:42:24 CST 2019
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public enum Field {
        id,
        rolename,
        saccountid,
        projectid,
        issystemrole,
        description;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}