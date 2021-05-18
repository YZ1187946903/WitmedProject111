package cn.ekgc.witmed.pojo.system.division.vo;

import cn.ekgc.witmed.base.pojo.vo.BaseVO;
import cn.ekgc.witmed.pojo.system.division.entity.Division;
import org.springframework.beans.BeanUtils;

/**
 * <b>智慧医疗-系统功能-区域视图信息</b>
 * @author Arthur
 * @version 1.0.0
 */
public class DivisionVO extends BaseVO {
	private static final long serialVersionUID = -7139454080177276787L;
	private String id;                      // 主键
	private DivisionVO parentVO;            // 上级区域
	private String text;                    // 区域文本
	private String code;                    // 区域编码

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public DivisionVO getParentVO() {
		return parentVO;
	}

	public void setParentVO(DivisionVO parentVO) {
		this.parentVO = parentVO;
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
	 * <b>将实体信息属性复制到视图信息</b>
	 * @param entity
	 * @return
	 */
	public static DivisionVO parseToVO(Division entity) {
		DivisionVO vo = new DivisionVO();

		if (entity != null) {
			// 拷贝普通属性
			BeanUtils.copyProperties(entity, vo);
			// 复制关联属性
			Division parent = entity.getParent();
			if (parent != null) {
				DivisionVO parentVO = new DivisionVO();
				// 将实体信息的关联属性复制到视图信息中
				BeanUtils.copyProperties(parent, parentVO);
				// 将关联属性设定到视图信息中
				vo.setParentVO(parentVO);
			}
		}

		return vo;
	}
}
