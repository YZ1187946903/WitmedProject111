package cn.ekgc.witmed.division.transport.impl;

import cn.ekgc.witmed.base.pojo.vo.PageQueryVO;
import cn.ekgc.witmed.base.pojo.vo.PageVO;
import cn.ekgc.witmed.division.service.DivisionService;
import cn.ekgc.witmed.pojo.system.division.vo.DivisionVO;
import cn.ekgc.witmed.transport.system.division.DivisionTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <b>智慧医疗-系统功能-区域信息传输层接口实现类</b>
 * @author Arthur
 * @version 1.0.0
 */
@RestController("divisionTransport")
@RequestMapping("/system/division/trans")
public class DivisionTransportImpl implements DivisionTransport {
	@Autowired
	private DivisionService service;

	/**
	 * <b>根据查询视图分页查询</b>
	 * @param pageQueryVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	@Override
	public PageVO<DivisionVO> getPageByQuery(@RequestBody PageQueryVO<DivisionVO> pageQueryVO) throws Exception {
		// 提取数据
		PageVO<DivisionVO> pageVO = pageQueryVO.getPageVO();
		DivisionVO queryVO = pageQueryVO.getQueryVO();
		return service.getPageByQuery(pageVO, queryVO);
	}
}
