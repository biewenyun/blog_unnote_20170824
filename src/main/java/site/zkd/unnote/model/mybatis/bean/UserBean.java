package site.zkd.unnote.model.mybatis.bean;

import java.io.Serializable;
import java.util.Date;

public class UserBean implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blog_sys_user.user_id
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blog_sys_user.user_nickname
     *
     * @mbggenerated
     */
    private String userNickname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blog_sys_user.user_pwd
     *
     * @mbggenerated
     */
    private String userPwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blog_sys_user.user_displayname
     *
     * @mbggenerated
     */
    private String userDisplayname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blog_sys_user.user_login_status
     *
     * @mbggenerated
     */
    private String userLoginStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blog_sys_user.user_last_login_time
     *
     * @mbggenerated
     */
    private Date userLastLoginTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blog_sys_user.user_last_login_ip
     *
     * @mbggenerated
     */
    private String userLastLoginIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blog_sys_user.user_sessionid
     *
     * @mbggenerated
     */
    private String userSessionid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blog_sys_user.user_url
     *
     * @mbggenerated
     */
    private String userUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blog_sys_user.user_salt
     *
     * @mbggenerated
     */
    private String userSalt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blog_sys_user.user_createtime
     *
     * @mbggenerated
     */
    private Date userCreatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blog_sys_user.user_email
     *
     * @mbggenerated
     */
    private String userEmail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blog_sys_user.user_photo_url
     *
     * @mbggenerated
     */
    private String userPhotoUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blog_sys_user.user_options_id
     *
     * @mbggenerated
     */
    private Long userOptionsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blog_sys_user.spare_field1
     *
     * @mbggenerated
     */
    private String spareField1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blog_sys_user.spare_field2
     *
     * @mbggenerated
     */
    private String spareField2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blog_sys_user.spare_field3
     *
     * @mbggenerated
     */
    private String spareField3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blog_sys_user.spare_field4
     *
     * @mbggenerated
     */
    private String spareField4;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blog_sys_user.spare_field5
     *
     * @mbggenerated
     */
    private String spareField5;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blog_sys_user.user_extend_id
     *
     * @mbggenerated
     */
    private Long userExtendId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_blog_sys_user
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog_sys_user.user_id
     *
     * @return the value of t_blog_sys_user.user_id
     *
     * @mbggenerated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog_sys_user.user_id
     *
     * @param userId the value for t_blog_sys_user.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog_sys_user.user_nickname
     *
     * @return the value of t_blog_sys_user.user_nickname
     *
     * @mbggenerated
     */
    public String getUserNickname() {
        return userNickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog_sys_user.user_nickname
     *
     * @param userNickname the value for t_blog_sys_user.user_nickname
     *
     * @mbggenerated
     */
    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname == null ? null : userNickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog_sys_user.user_pwd
     *
     * @return the value of t_blog_sys_user.user_pwd
     *
     * @mbggenerated
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog_sys_user.user_pwd
     *
     * @param userPwd the value for t_blog_sys_user.user_pwd
     *
     * @mbggenerated
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog_sys_user.user_displayname
     *
     * @return the value of t_blog_sys_user.user_displayname
     *
     * @mbggenerated
     */
    public String getUserDisplayname() {
        return userDisplayname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog_sys_user.user_displayname
     *
     * @param userDisplayname the value for t_blog_sys_user.user_displayname
     *
     * @mbggenerated
     */
    public void setUserDisplayname(String userDisplayname) {
        this.userDisplayname = userDisplayname == null ? null : userDisplayname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog_sys_user.user_login_status
     *
     * @return the value of t_blog_sys_user.user_login_status
     *
     * @mbggenerated
     */
    public String getUserLoginStatus() {
        return userLoginStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog_sys_user.user_login_status
     *
     * @param userLoginStatus the value for t_blog_sys_user.user_login_status
     *
     * @mbggenerated
     */
    public void setUserLoginStatus(String userLoginStatus) {
        this.userLoginStatus = userLoginStatus == null ? null : userLoginStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog_sys_user.user_last_login_time
     *
     * @return the value of t_blog_sys_user.user_last_login_time
     *
     * @mbggenerated
     */
    public Date getUserLastLoginTime() {
        return userLastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog_sys_user.user_last_login_time
     *
     * @param userLastLoginTime the value for t_blog_sys_user.user_last_login_time
     *
     * @mbggenerated
     */
    public void setUserLastLoginTime(Date userLastLoginTime) {
        this.userLastLoginTime = userLastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog_sys_user.user_last_login_ip
     *
     * @return the value of t_blog_sys_user.user_last_login_ip
     *
     * @mbggenerated
     */
    public String getUserLastLoginIp() {
        return userLastLoginIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog_sys_user.user_last_login_ip
     *
     * @param userLastLoginIp the value for t_blog_sys_user.user_last_login_ip
     *
     * @mbggenerated
     */
    public void setUserLastLoginIp(String userLastLoginIp) {
        this.userLastLoginIp = userLastLoginIp == null ? null : userLastLoginIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog_sys_user.user_sessionid
     *
     * @return the value of t_blog_sys_user.user_sessionid
     *
     * @mbggenerated
     */
    public String getUserSessionid() {
        return userSessionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog_sys_user.user_sessionid
     *
     * @param userSessionid the value for t_blog_sys_user.user_sessionid
     *
     * @mbggenerated
     */
    public void setUserSessionid(String userSessionid) {
        this.userSessionid = userSessionid == null ? null : userSessionid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog_sys_user.user_url
     *
     * @return the value of t_blog_sys_user.user_url
     *
     * @mbggenerated
     */
    public String getUserUrl() {
        return userUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog_sys_user.user_url
     *
     * @param userUrl the value for t_blog_sys_user.user_url
     *
     * @mbggenerated
     */
    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl == null ? null : userUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog_sys_user.user_salt
     *
     * @return the value of t_blog_sys_user.user_salt
     *
     * @mbggenerated
     */
    public String getUserSalt() {
        return userSalt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog_sys_user.user_salt
     *
     * @param userSalt the value for t_blog_sys_user.user_salt
     *
     * @mbggenerated
     */
    public void setUserSalt(String userSalt) {
        this.userSalt = userSalt == null ? null : userSalt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog_sys_user.user_createtime
     *
     * @return the value of t_blog_sys_user.user_createtime
     *
     * @mbggenerated
     */
    public Date getUserCreatetime() {
        return userCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog_sys_user.user_createtime
     *
     * @param userCreatetime the value for t_blog_sys_user.user_createtime
     *
     * @mbggenerated
     */
    public void setUserCreatetime(Date userCreatetime) {
        this.userCreatetime = userCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog_sys_user.user_email
     *
     * @return the value of t_blog_sys_user.user_email
     *
     * @mbggenerated
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog_sys_user.user_email
     *
     * @param userEmail the value for t_blog_sys_user.user_email
     *
     * @mbggenerated
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog_sys_user.user_photo_url
     *
     * @return the value of t_blog_sys_user.user_photo_url
     *
     * @mbggenerated
     */
    public String getUserPhotoUrl() {
        return userPhotoUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog_sys_user.user_photo_url
     *
     * @param userPhotoUrl the value for t_blog_sys_user.user_photo_url
     *
     * @mbggenerated
     */
    public void setUserPhotoUrl(String userPhotoUrl) {
        this.userPhotoUrl = userPhotoUrl == null ? null : userPhotoUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog_sys_user.user_options_id
     *
     * @return the value of t_blog_sys_user.user_options_id
     *
     * @mbggenerated
     */
    public Long getUserOptionsId() {
        return userOptionsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog_sys_user.user_options_id
     *
     * @param userOptionsId the value for t_blog_sys_user.user_options_id
     *
     * @mbggenerated
     */
    public void setUserOptionsId(Long userOptionsId) {
        this.userOptionsId = userOptionsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog_sys_user.spare_field1
     *
     * @return the value of t_blog_sys_user.spare_field1
     *
     * @mbggenerated
     */
    public String getSpareField1() {
        return spareField1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog_sys_user.spare_field1
     *
     * @param spareField1 the value for t_blog_sys_user.spare_field1
     *
     * @mbggenerated
     */
    public void setSpareField1(String spareField1) {
        this.spareField1 = spareField1 == null ? null : spareField1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog_sys_user.spare_field2
     *
     * @return the value of t_blog_sys_user.spare_field2
     *
     * @mbggenerated
     */
    public String getSpareField2() {
        return spareField2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog_sys_user.spare_field2
     *
     * @param spareField2 the value for t_blog_sys_user.spare_field2
     *
     * @mbggenerated
     */
    public void setSpareField2(String spareField2) {
        this.spareField2 = spareField2 == null ? null : spareField2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog_sys_user.spare_field3
     *
     * @return the value of t_blog_sys_user.spare_field3
     *
     * @mbggenerated
     */
    public String getSpareField3() {
        return spareField3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog_sys_user.spare_field3
     *
     * @param spareField3 the value for t_blog_sys_user.spare_field3
     *
     * @mbggenerated
     */
    public void setSpareField3(String spareField3) {
        this.spareField3 = spareField3 == null ? null : spareField3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog_sys_user.spare_field4
     *
     * @return the value of t_blog_sys_user.spare_field4
     *
     * @mbggenerated
     */
    public String getSpareField4() {
        return spareField4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog_sys_user.spare_field4
     *
     * @param spareField4 the value for t_blog_sys_user.spare_field4
     *
     * @mbggenerated
     */
    public void setSpareField4(String spareField4) {
        this.spareField4 = spareField4 == null ? null : spareField4.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog_sys_user.spare_field5
     *
     * @return the value of t_blog_sys_user.spare_field5
     *
     * @mbggenerated
     */
    public String getSpareField5() {
        return spareField5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog_sys_user.spare_field5
     *
     * @param spareField5 the value for t_blog_sys_user.spare_field5
     *
     * @mbggenerated
     */
    public void setSpareField5(String spareField5) {
        this.spareField5 = spareField5 == null ? null : spareField5.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog_sys_user.user_extend_id
     *
     * @return the value of t_blog_sys_user.user_extend_id
     *
     * @mbggenerated
     */
    public Long getUserExtendId() {
        return userExtendId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog_sys_user.user_extend_id
     *
     * @param userExtendId the value for t_blog_sys_user.user_extend_id
     *
     * @mbggenerated
     */
    public void setUserExtendId(Long userExtendId) {
        this.userExtendId = userExtendId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_sys_user
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userNickname=").append(userNickname);
        sb.append(", userPwd=").append(userPwd);
        sb.append(", userDisplayname=").append(userDisplayname);
        sb.append(", userLoginStatus=").append(userLoginStatus);
        sb.append(", userLastLoginTime=").append(userLastLoginTime);
        sb.append(", userLastLoginIp=").append(userLastLoginIp);
        sb.append(", userSessionid=").append(userSessionid);
        sb.append(", userUrl=").append(userUrl);
        sb.append(", userSalt=").append(userSalt);
        sb.append(", userCreatetime=").append(userCreatetime);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", userPhotoUrl=").append(userPhotoUrl);
        sb.append(", userOptionsId=").append(userOptionsId);
        sb.append(", spareField1=").append(spareField1);
        sb.append(", spareField2=").append(spareField2);
        sb.append(", spareField3=").append(spareField3);
        sb.append(", spareField4=").append(spareField4);
        sb.append(", spareField5=").append(spareField5);
        sb.append(", userExtendId=").append(userExtendId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}