package cn.ekgc.witmed.base.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * <b>基础实体信息</b>
 * <b>
 *     基础实体信息设置了通用属性：<br/>
 *     <b>status：系统状态</b>、<b>createUser：创建人</b>、<b>createTime：创建时间</b>、<br/>
 *     <b>updateUser：修改人</b>&nbsp;和&nbsp;<b>updateTime：修改时间</b>。<br/>
 *     项目其他功能的实体信息<b>必须继承于本基础实体信息</b>
 * </b>
 * @author Arthur
 * @version 1.0.0
 */
public class BaseEntity implements Serializable {
	private static final long serialVersionUID = 3563582030558185082L;
	private String status;                      // 系统状态：0-禁用，1-启用
	private String createUser;                  // 创建人
	private Date createTime;                    // 创建时间
	private String updateUser;                  // 修改人
	private Date updateTime;                    // 修改时间

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
