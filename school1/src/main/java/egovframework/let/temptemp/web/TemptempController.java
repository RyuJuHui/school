package egovframework.let.temptemp.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.let.temptemp.service.TemptempService;
import egovframework.let.temptemp.service.TemptempVO;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Controller
public class TemptempController {
	
	@Resource(name = "temptempService")
	private TemptempService temptempService;
	
	@RequestMapping("/temptemp/list.do")
	public String list(@ModelAttribute("searchVO") TemptempVO searchVO, ModelMap model) throws Exception {
		
		List<EgovMap> list = temptempService.listTemp(searchVO);
		
		model.addAttribute("list", list);
		
		return "temptemp/list";
	}
}
