package cn.ekgc.witmed.division.service;

import cn.ekgc.witmed.base.pojo.vo.PageVO;
import cn.ekgc.witmed.pojo.system.division.vo.DivisionVO;

/**
 * <b>智慧医疗-系统功能-区域信息业务层接口</b>
 * @author Arthur
 * @version 1.0.0
 */
public interface DivisionService {
	/**
	 * <b>根据查询视图分页查询</b>
	 * @param pageVO
	 * @param queryVO
	 * @return
	 * @throws Exception
	 */
	PageVO<DivisionVO> getPageByQuery(PageVO<DivisionVO> pageVO, DivisionVO queryVO) throws Exception;

	/**
	 * <b>保存对象</b>
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	boolean save(DivisionVO vo) throws Exception;
}
