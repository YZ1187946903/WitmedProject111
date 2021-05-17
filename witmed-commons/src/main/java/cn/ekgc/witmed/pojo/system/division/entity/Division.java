package cn.ekgc.witmed.pojo.system.division.entity;

import cn.ekgc.witmed.base.pojo.entity.BaseEntity;
import cn.ekgc.witmed.pojo.system.division.vo.DivisionVO;
import org.springframework.beans.BeanUtils;

/**
 * <b>智慧医疗-系统功能-区域实体信息</b>
 * @author Arthur
 * @version 1.0.0
 */
public class Division extends BaseEntity {
	private static final long serialVersionUID = 8039836680292400790L;
	private String id;                      // 主键
	private Division parent;                // 上级区域
	private String text;                    // 区域文本
	private String code;                    // 区域编码

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Division getParent() {
		return parent;
	}

	public void setParent(Division parent) {
		this.parent = parent;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * <b>将视图信息属性复制到实体信息</b>
	 * @param vo
	 * @return
	 */
	public static Division parseToEntity(DivisionVO vo) {
		Division entity = new Division();
		// 拷贝普通属性
		BeanUtils.copyProperties(vo, entity);
		// 复制关联属性
		DivisionVO parentVO = vo.getParentVO();
		if (parentVO != null) {
			Division parent = new Division();
			// 将视图信息的关联属性复制到实体信息中
			BeanUtils.copyProperties(parentVO, parent);
			// 将关联属性设定到实体信息中
			entity.setParent(parent);
		}

		return entity;
	}
}
