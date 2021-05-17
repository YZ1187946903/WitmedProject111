package cn.ekgc.witmed.division.controller;

import cn.ekgc.witmed.base.controller.BaseController;
import cn.ekgc.witmed.base.pojo.vo.PageQueryVO;
import cn.ekgc.witmed.base.pojo.vo.PageVO;
import cn.ekgc.witmed.base.pojo.vo.ResponseVO;
import cn.ekgc.witmed.pojo.system.division.vo.DivisionVO;
import cn.ekgc.witmed.transport.system.division.DivisionTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <b>智慧医疗-系统功能-区域信息控制层类</b>
 * @author Arthur
 * @version 1.0.0
 */
@RestController("divisionController")
@RequestMapping("/system/division")
public class DivisionController extends BaseController {
	@Autowired
	private DivisionTransport transport;

	/**
	 * <b>根据查询视图分页查询</b>
	 * @param pageNum
	 * @param pageSize
	 * @param queryVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page/{pageNum}/{pageSize}")
	public ResponseVO queryPageByQuery(@PathVariable("pageNum") Integer pageNum, @PathVariable("pageSize") Integer pageSize,
	                                   @RequestBody DivisionVO queryVO) throws Exception {
		// 创建分页对象
		PageVO<DivisionVO> pageVO = new PageVO<DivisionVO>(pageNum, pageSize);
		// 将 PageVO 和 QueryVO 合称为 PageQueryVO 对象
		PageQueryVO<DivisionVO> pageQueryVO = new PageQueryVO<DivisionVO>(queryVO, pageVO);
		// 进行分页查询
		pageVO = transport.getPageByQuery(pageQueryVO);

		// 将查询后的分页信息和查询信息进行合成，一起返回给前端
		return ResponseVO.getSuccessResponseVO(new PageQueryVO<DivisionVO>(queryVO, pageVO));
	}

	/**
	 * <b>根据查询视图查询列表</b>
	 * @param queryVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/list")
	public ResponseVO queryList(@RequestBody DivisionVO queryVO) throws Exception {
		return ResponseVO.getSuccessResponseVO();
	}

	/**
	 * <b>保存信息</b>
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	public ResponseVO save(@RequestBody DivisionVO vo) throws Exception {
		return ResponseVO.getSuccessResponseVO();
	}

	/**
	 * <b>修改信息</b>
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	public ResponseVO update(@RequestBody DivisionVO vo) throws Exception {
		return ResponseVO.getSuccessResponseVO();
	}

	/**
	 * <b>修改状态</b>
	 * @param id
	 * @param status
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/status/{id}/{status}")
	public ResponseVO changeStatus(@PathVariable("id") String id, @PathVariable("status") String status) throws Exception {
		return ResponseVO.getSuccessResponseVO();
	}

	/**
	 * <b>根据主键查询对象</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/id/{id}")
	public ResponseVO queryById(@PathVariable("id") String id) throws Exception {
		return ResponseVO.getSuccessResponseVO();
	}

	/**
	 * <b>根据编码查询对象</b>
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/code/{code}")
	public ResponseVO queryByCode(@PathVariable("code") String code) throws Exception {
		return ResponseVO.getSuccessResponseVO();
	}
}
