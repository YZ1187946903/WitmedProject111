package cn.ekgc.witmed.base.pojo.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * <b>基础视图信息</b>
 * <b>
 *     基础视图信息设置了通用属性：<br/>
 *     <b>status：系统状态</b>、<b>createTime：创建时间</b>&nbsp;和&nbsp;<b>updateTime：修改时间</b>。<br/>
 *     项目其他功能的视图信息<b>必须继承于本基础视图信息</b>
 * </b>
 * @author Arthur
 * @version 1.0.0
 */
public class BaseVO implements Serializable {
	private static final long serialVersionUID = 7512361690727574184L;
	private String status;                      // 系统状态：0-禁用，1-启用
	private Date createTime;                    // 创建时间
	private Date updateTime;                    // 修改时间

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
