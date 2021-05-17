package cn.ekgc.witmed.division.dao;

import cn.ekgc.witmed.pojo.system.division.entity.Division;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <b>智慧医疗-系统功能-区域信息数据持久层接口</b>
 * @author Arthur
 * @version 1.0.0
 */
@Repository
public interface DivisionDao {
	/**
	 * <b>根据查询对象查询列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<Division> findByQuery(Division query) throws Exception;

	/**
	 * <b>保存对象</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int save(Division entity) throws Exception;

	/**
	 * <b>修改对象</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int update(Division entity) throws Exception;
}
