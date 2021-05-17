package cn.ekgc.witmed.demo;

import cn.ekgc.witmed.division.service.DivisionService;
import cn.ekgc.witmed.pojo.system.division.vo.DivisionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("demoController")
@RequestMapping("/demo")
public class DemoController {
	@Autowired
	private DivisionService service;

	@GetMapping("/division")
	public boolean saveDivision() throws Exception {
		service.save(new DivisionVO());
		return true;
	}
}
