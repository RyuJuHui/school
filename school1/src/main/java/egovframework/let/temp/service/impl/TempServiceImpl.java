package egovframework.let.temp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.let.temp.service.TempService;
import egovframework.let.temp.service.TempVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import egovframework.rte.fdl.property.EgovPropertyService;

@Service("tempService")
public class TempServiceImpl extends EgovAbstractServiceImpl implements TempService {

	@Resource(name = "propertiesService")
	protected EgovPropertyService propertyService;

	
	@Resource(name = "tempMapper")
	protected TempMapper tempMapper;
	
	@Resource(name = "tempDAO")
	private TempDAO tempDAO; 
//	ibatis와 연결
	
	@Resource(name = "egovTempIdGnrService")
	private EgovIdGnrService idgenService;
	
	@Override
	public TempVO selectTemp(TempVO vo) throws Exception {
		return tempMapper.selectTemp(vo);
	}
	
	public String insertTemp(TempVO vo) throws Exception {
		String id = idgenService.getNextStringId();
		vo.setTempId(id);
		tempMapper.insertTemp(vo);
		
		return id;
	}
//	@Override
//	public TempVO selectTemp(TempVO vo) throws Exception {
//		return tempDAO.selectTemp(vo);
//	}
//	ibatis와 연결

	@Override
	public List<TempVO> list(TempVO vo) throws Exception {
	
		return tempMapper.listMap(vo);
	}
	
	



}
