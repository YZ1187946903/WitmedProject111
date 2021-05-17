package cn.ekgc.witmed.transport.system.division;

import cn.ekgc.witmed.base.pojo.vo.PageQueryVO;
import cn.ekgc.witmed.base.pojo.vo.PageVO;
import cn.ekgc.witmed.pojo.system.division.vo.DivisionVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <b>智慧医疗-系统功能-区域信息传输层接口</b>
 * @author Arthur
 * @version 1.0.0
 */
@FeignClient(name = "witmed-system-provider")
@RequestMapping("/system/division/trans")
public interface DivisionTransport {
	/**
	 * <b>根据查询视图分页查询</b>
	 * @param pageQueryVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	PageVO<DivisionVO> getPageByQuery(@RequestBody PageQueryVO<DivisionVO> pageQueryVO) throws Exception;
}
