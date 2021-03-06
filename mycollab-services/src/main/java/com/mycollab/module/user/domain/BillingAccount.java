/*Domain class of table s_account*/
package com.mycollab.module.user.domain;

import com.mycollab.core.arguments.ValuedBean;
import com.mycollab.db.metadata.Column;
import com.mycollab.db.metadata.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.ibatis.type.Alias;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
@Table("s_account")
@Alias("BillingAccount")
public class BillingAccount extends ValuedBean {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.id
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    @Column("id")
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.createdTime
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    @NotNull
    @Column("createdTime")
    private LocalDateTime createdtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.billingPlanId
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    @Column("billingPlanId")
    private Integer billingplanid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.accountName
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    @Length(max=100, message="Field value is too long")
    @Column("accountName")
    private String accountname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.status
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    @NotEmpty
    @Length(max=45, message="Field value is too long")
    @Column("status")
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.subDomain
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    @Length(max=45, message="Field value is too long")
    @Column("subDomain")
    private String subdomain;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.reminderStatus
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    @Length(max=45, message="Field value is too long")
    @Column("reminderStatus")
    private String reminderstatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.siteName
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    @Length(max=255, message="Field value is too long")
    @Column("siteName")
    private String sitename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.logoPath
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    @Length(max=255, message="Field value is too long")
    @Column("logoPath")
    private String logopath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.defaultTimezone
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    @Length(max=45, message="Field value is too long")
    @Column("defaultTimezone")
    private String defaulttimezone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.faviconPath
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    @Length(max=225, message="Field value is too long")
    @Column("faviconPath")
    private String faviconpath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.defaultCurrencyId
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    @Length(max=4, message="Field value is too long")
    @Column("defaultCurrencyId")
    private String defaultcurrencyid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.defaultYYMMDDFormat
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    @Length(max=45, message="Field value is too long")
    @Column("defaultYYMMDDFormat")
    private String defaultyymmddformat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.defaultHumanDateFormat
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    @Length(max=45, message="Field value is too long")
    @Column("defaultHumanDateFormat")
    private String defaulthumandateformat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.defaultMMDDFormat
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    @Length(max=45, message="Field value is too long")
    @Column("defaultMMDDFormat")
    private String defaultmmddformat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.defaultLanguageTag
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    @Length(max=10, message="Field value is too long")
    @Column("defaultLanguageTag")
    private String defaultlanguagetag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.displayEmailPublicly
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    @Column("displayEmailPublicly")
    private Boolean displayemailpublicly;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.trialFrom
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    @Column("trialFrom")
    private LocalDate trialfrom;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.trialTo
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    @Column("trialTo")
    private LocalDate trialto;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.paymentMethod
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    @Length(max=45, message="Field value is too long")
    @Column("paymentMethod")
    private String paymentmethod;

    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        if (obj == null) { return false;}
        if (obj == this) { return true;}
        if (!obj.getClass().isAssignableFrom(getClass())) { return false;}
        BillingAccount item = (BillingAccount)obj;
        return new EqualsBuilder().append(id, item.id).build();
    }

    public final int hashCode() {
        return new HashCodeBuilder(1521, 1685).append(id).build();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.id
     *
     * @return the value of s_account.id
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public BillingAccount withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.id
     *
     * @param id the value for s_account.id
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.createdTime
     *
     * @return the value of s_account.createdTime
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public LocalDateTime getCreatedtime() {
        return createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public BillingAccount withCreatedtime(LocalDateTime createdtime) {
        this.setCreatedtime(createdtime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.createdTime
     *
     * @param createdtime the value for s_account.createdTime
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public void setCreatedtime(LocalDateTime createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.billingPlanId
     *
     * @return the value of s_account.billingPlanId
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public Integer getBillingplanid() {
        return billingplanid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public BillingAccount withBillingplanid(Integer billingplanid) {
        this.setBillingplanid(billingplanid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.billingPlanId
     *
     * @param billingplanid the value for s_account.billingPlanId
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public void setBillingplanid(Integer billingplanid) {
        this.billingplanid = billingplanid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.accountName
     *
     * @return the value of s_account.accountName
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public String getAccountname() {
        return accountname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public BillingAccount withAccountname(String accountname) {
        this.setAccountname(accountname);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.accountName
     *
     * @param accountname the value for s_account.accountName
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.status
     *
     * @return the value of s_account.status
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public BillingAccount withStatus(String status) {
        this.setStatus(status);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.status
     *
     * @param status the value for s_account.status
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.subDomain
     *
     * @return the value of s_account.subDomain
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public String getSubdomain() {
        return subdomain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public BillingAccount withSubdomain(String subdomain) {
        this.setSubdomain(subdomain);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.subDomain
     *
     * @param subdomain the value for s_account.subDomain
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public void setSubdomain(String subdomain) {
        this.subdomain = subdomain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.reminderStatus
     *
     * @return the value of s_account.reminderStatus
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public String getReminderstatus() {
        return reminderstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public BillingAccount withReminderstatus(String reminderstatus) {
        this.setReminderstatus(reminderstatus);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.reminderStatus
     *
     * @param reminderstatus the value for s_account.reminderStatus
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public void setReminderstatus(String reminderstatus) {
        this.reminderstatus = reminderstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.siteName
     *
     * @return the value of s_account.siteName
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public String getSitename() {
        return sitename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public BillingAccount withSitename(String sitename) {
        this.setSitename(sitename);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.siteName
     *
     * @param sitename the value for s_account.siteName
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public void setSitename(String sitename) {
        this.sitename = sitename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.logoPath
     *
     * @return the value of s_account.logoPath
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public String getLogopath() {
        return logopath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public BillingAccount withLogopath(String logopath) {
        this.setLogopath(logopath);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.logoPath
     *
     * @param logopath the value for s_account.logoPath
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public void setLogopath(String logopath) {
        this.logopath = logopath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.defaultTimezone
     *
     * @return the value of s_account.defaultTimezone
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public String getDefaulttimezone() {
        return defaulttimezone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public BillingAccount withDefaulttimezone(String defaulttimezone) {
        this.setDefaulttimezone(defaulttimezone);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.defaultTimezone
     *
     * @param defaulttimezone the value for s_account.defaultTimezone
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public void setDefaulttimezone(String defaulttimezone) {
        this.defaulttimezone = defaulttimezone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.faviconPath
     *
     * @return the value of s_account.faviconPath
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public String getFaviconpath() {
        return faviconpath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public BillingAccount withFaviconpath(String faviconpath) {
        this.setFaviconpath(faviconpath);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.faviconPath
     *
     * @param faviconpath the value for s_account.faviconPath
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public void setFaviconpath(String faviconpath) {
        this.faviconpath = faviconpath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.defaultCurrencyId
     *
     * @return the value of s_account.defaultCurrencyId
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public String getDefaultcurrencyid() {
        return defaultcurrencyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public BillingAccount withDefaultcurrencyid(String defaultcurrencyid) {
        this.setDefaultcurrencyid(defaultcurrencyid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.defaultCurrencyId
     *
     * @param defaultcurrencyid the value for s_account.defaultCurrencyId
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public void setDefaultcurrencyid(String defaultcurrencyid) {
        this.defaultcurrencyid = defaultcurrencyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.defaultYYMMDDFormat
     *
     * @return the value of s_account.defaultYYMMDDFormat
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public String getDefaultyymmddformat() {
        return defaultyymmddformat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public BillingAccount withDefaultyymmddformat(String defaultyymmddformat) {
        this.setDefaultyymmddformat(defaultyymmddformat);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.defaultYYMMDDFormat
     *
     * @param defaultyymmddformat the value for s_account.defaultYYMMDDFormat
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public void setDefaultyymmddformat(String defaultyymmddformat) {
        this.defaultyymmddformat = defaultyymmddformat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.defaultHumanDateFormat
     *
     * @return the value of s_account.defaultHumanDateFormat
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public String getDefaulthumandateformat() {
        return defaulthumandateformat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public BillingAccount withDefaulthumandateformat(String defaulthumandateformat) {
        this.setDefaulthumandateformat(defaulthumandateformat);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.defaultHumanDateFormat
     *
     * @param defaulthumandateformat the value for s_account.defaultHumanDateFormat
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public void setDefaulthumandateformat(String defaulthumandateformat) {
        this.defaulthumandateformat = defaulthumandateformat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.defaultMMDDFormat
     *
     * @return the value of s_account.defaultMMDDFormat
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public String getDefaultmmddformat() {
        return defaultmmddformat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public BillingAccount withDefaultmmddformat(String defaultmmddformat) {
        this.setDefaultmmddformat(defaultmmddformat);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.defaultMMDDFormat
     *
     * @param defaultmmddformat the value for s_account.defaultMMDDFormat
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public void setDefaultmmddformat(String defaultmmddformat) {
        this.defaultmmddformat = defaultmmddformat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.defaultLanguageTag
     *
     * @return the value of s_account.defaultLanguageTag
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public String getDefaultlanguagetag() {
        return defaultlanguagetag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public BillingAccount withDefaultlanguagetag(String defaultlanguagetag) {
        this.setDefaultlanguagetag(defaultlanguagetag);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.defaultLanguageTag
     *
     * @param defaultlanguagetag the value for s_account.defaultLanguageTag
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public void setDefaultlanguagetag(String defaultlanguagetag) {
        this.defaultlanguagetag = defaultlanguagetag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.displayEmailPublicly
     *
     * @return the value of s_account.displayEmailPublicly
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public Boolean getDisplayemailpublicly() {
        return displayemailpublicly;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public BillingAccount withDisplayemailpublicly(Boolean displayemailpublicly) {
        this.setDisplayemailpublicly(displayemailpublicly);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.displayEmailPublicly
     *
     * @param displayemailpublicly the value for s_account.displayEmailPublicly
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public void setDisplayemailpublicly(Boolean displayemailpublicly) {
        this.displayemailpublicly = displayemailpublicly;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.trialFrom
     *
     * @return the value of s_account.trialFrom
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public LocalDate getTrialfrom() {
        return trialfrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public BillingAccount withTrialfrom(LocalDate trialfrom) {
        this.setTrialfrom(trialfrom);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.trialFrom
     *
     * @param trialfrom the value for s_account.trialFrom
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public void setTrialfrom(LocalDate trialfrom) {
        this.trialfrom = trialfrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.trialTo
     *
     * @return the value of s_account.trialTo
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public LocalDate getTrialto() {
        return trialto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public BillingAccount withTrialto(LocalDate trialto) {
        this.setTrialto(trialto);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.trialTo
     *
     * @param trialto the value for s_account.trialTo
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public void setTrialto(LocalDate trialto) {
        this.trialto = trialto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.paymentMethod
     *
     * @return the value of s_account.paymentMethod
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public String getPaymentmethod() {
        return paymentmethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public BillingAccount withPaymentmethod(String paymentmethod) {
        this.setPaymentmethod(paymentmethod);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.paymentMethod
     *
     * @param paymentmethod the value for s_account.paymentMethod
     *
     * @mbg.generated Mon Feb 11 19:53:05 CST 2019
     */
    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public enum Field {
        id,
        createdtime,
        billingplanid,
        accountname,
        status,
        subdomain,
        reminderstatus,
        sitename,
        logopath,
        defaulttimezone,
        faviconpath,
        defaultcurrencyid,
        defaultyymmddformat,
        defaulthumandateformat,
        defaultmmddformat,
        defaultlanguagetag,
        displayemailpublicly,
        trialfrom,
        trialto,
        paymentmethod;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}