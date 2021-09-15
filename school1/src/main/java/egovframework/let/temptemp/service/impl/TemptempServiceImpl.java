package egovframework.let.temptemp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.let.temptemp.service.TemptempService;
import egovframework.let.temptemp.service.TemptempVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import egovframework.rte.fdl.property.EgovPropertyService;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Service("temptempService")
public class TemptempServiceImpl extends EgovAbstractServiceImpl implements TemptempService {

	@Resource(name = "propertiesService")
	protected EgovPropertyService propertyService;
	
	@Resource(name = "temptempMapper")
	protected TemptempMapper temptempMapper;
	
	@Resource(name = "egovTempIdGnrService")
	private EgovIdGnrService idgenService;
	
	public List<EgovMap> listTemp(TemptempVO searchVO) throws Exception {
		return temptempMapper.listTemp(searchVO);
	}


}
