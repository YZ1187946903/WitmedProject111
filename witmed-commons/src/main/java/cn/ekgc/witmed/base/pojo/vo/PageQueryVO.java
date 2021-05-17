package cn.ekgc.witmed.base.pojo.vo;

import java.io.Serializable;

/**
 * <b>分页查询视图信息</b>
 * <b>
 *     当传输层需要根据查询对象进行分页查询时，<b>必须将查询对象和分页视图封装为本分页查询视图信息</b>
 * </b>
 * @param <E>
 * @author Arthur
 * @version 1.0.0
 */
public class PageQueryVO<E extends BaseVO> implements Serializable {
	private static final long serialVersionUID = 7895975264176972837L;
	private E queryVO;                        // 查询对象视图
	private PageVO<E> pageVO;               // 分页视图

	public PageQueryVO() {}

	public PageQueryVO(E queryVO, PageVO<E> pageVO) {
		this.queryVO = queryVO;
		this.pageVO = pageVO;
	}

	public E getQueryVO() {
		return queryVO;
	}

	public void setQueryVO(E query) {
		this.queryVO = queryVO;
	}

	public PageVO<E> getPageVO() {
		return pageVO;
	}

	public void setPageVO(PageVO<E> pageVO) {
		this.pageVO = pageVO;
	}
}
