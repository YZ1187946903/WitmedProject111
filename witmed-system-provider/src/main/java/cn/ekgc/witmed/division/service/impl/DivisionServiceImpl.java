package cn.ekgc.witmed.division.service.impl;

import cn.ekgc.witmed.base.pojo.vo.PageVO;
import cn.ekgc.witmed.base.util.IdGenerator;
import cn.ekgc.witmed.division.dao.DivisionDao;
import cn.ekgc.witmed.division.service.DivisionService;
import cn.ekgc.witmed.pojo.system.division.entity.Division;
import cn.ekgc.witmed.pojo.system.division.vo.DivisionVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>智慧医疗-系统功能-区域信息业务层接口实现类</b>
 * @author Arthur
 * @version 1.0.0
 */
@Service("divisionService")
@Transactional
public class DivisionServiceImpl implements DivisionService {
	@Autowired
	private DivisionDao dao;
	@Autowired
	private IdGenerator idGenerator;

	/**
	 * <b>根据查询视图分页查询</b>
	 * @param pageVO
	 * @param queryVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public PageVO<DivisionVO> getPageByQuery(PageVO<DivisionVO> pageVO, DivisionVO queryVO) throws Exception {
		// 将查询视图对象切换为查询实体对象
		Division query = Division.parseToEntity(queryVO);
		// 进行分页查询
		PageHelper.startPage(pageVO.getPageNum(), pageVO.getPageSize());
		List<Division> list = dao.findByQuery(query);
		// 创建 PageInfo 对象
		PageInfo<Division> pageInfo = new PageInfo<Division>(list);
		// 提取数据
		// 创建视图对象列表
		List<DivisionVO> voList = new ArrayList<DivisionVO>();
		List<Division> entityList = pageInfo.getList();
		if (entityList != null && !entityList.isEmpty()) {
			for (Division entity : entityList) {
				voList.add(DivisionVO.parseToVO(entity));
			}
		}
		pageVO.setList(voList);
		pageVO.setTotalCount(pageInfo.getTotal());
		pageVO.setTotalSize((long) pageInfo.getPages());

		return pageVO;
	}

	/**
	 * <b>保存对象</b>
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean save(DivisionVO vo) throws Exception {
		return true;
	}
}
