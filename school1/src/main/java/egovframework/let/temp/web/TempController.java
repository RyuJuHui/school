package egovframework.let.temp.web;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.let.temp.service.TempService;
import egovframework.let.temp.service.TempVO;
import egovframework.let.utl.fcc.service.EgovStringUtil;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;

@Controller
public class TempController {
	
	@Resource(name = "tempService")
	private TempService tempService;
	
	// 임시데이터 가져오기
	@RequestMapping(value = "/temp/select.do")
	public String select(@ModelAttribute("searchVO") TempVO searchVO, HttpServletRequest request, ModelMap model) throws Exception {
		TempVO result = tempService.selectTemp(searchVO);
		model.addAttribute("result", result);
		return "temp/TempSelect";
	}
	
	// 임시데이터 등록/수정 폼
	@RequestMapping(value = "/temp/tempRegist.do")
	public String tempRegist(@ModelAttribute("searchVO") TempVO tempVO,
			HttpServletRequest request, ModelMap model) throws Exception {
		TempVO result = new TempVO();
		if(!EgovStringUtil.isEmpty(tempVO.getTempId())) {
			result = tempService.selectTemp(tempVO);
		}
		
		model.addAttribute("result", result);
		
		return "temp/TempRegist";
	}
	
	// 임시데이터 등록하기
	@RequestMapping(value = "/temp/insert.do")
	public String insert(@ModelAttribute("searchVO") TempVO searchVO,
			HttpServletRequest request, ModelMap model) throws Exception {
		String tempId = tempService.insertTemp(searchVO);
		return "redirect:/temp/select.do?tempId=" + tempId;
	}
	
	// 임시데이터 목록 가져오기
	@RequestMapping(value = "/temp/tempList.do")
	public String list(@ModelAttribute("searchVO") TempVO searchVO, ModelMap model, 
			HttpServletRequest request, TempVO vo) throws Exception {
		
		PaginationInfo paginationInfo = new PaginationInfo();
		
		paginationInfo.setCurrentPageNo(searchVO.getPageIndex());
		paginationInfo.setRecordCountPerPage(searchVO.getPageUnit());
		paginationInfo.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());
		
		searchVO.setFirstIndex(paginationInfo.getFirstRecordIndex());
		searchVO.setLastIndex(paginationInfo.getLastRecordIndex());
		searchVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());
		
		List<TempVO> list = tempService.list(searchVO);
		model.addAttribute("list", list);
		
		int totCnt = tempService.selectTempListCnt(searchVO);
		
		paginationInfo.setTotalRecordCount(totCnt);
		model.addAttribute("paginationInfo", paginationInfo);
		
		return "temp/TempList";
	}
	
	// 임시데이터 수정하기
	@RequestMapping(value = "/temp/update.do")
	public String update(@ModelAttribute("searchVO") TempVO searchVO, 
			HttpServletRequest request, ModelMap model) throws Exception {
		
		tempService.updateTemp(searchVO);
		
		return "forward:/temp/tempList.do";
	}
	
	// 임시데이터 삭제하기
	@RequestMapping(value = "/temp/delete.do")
	public String delete(@ModelAttribute("searchVO") TempVO searchVO,
			HttpServletRequest request, ModelMap model) throws Exception {
		
		tempService.deleteTemp(searchVO);
		
		return "forward:/temp/tempList.do";
	}
	
}
