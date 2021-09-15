package egovframework.let.temptemp.service.impl;

import java.util.List;

import egovframework.let.temptemp.service.TemptempVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Mapper("temptempMapper")
public interface TemptempMapper {
	
	List<EgovMap> listTemp(TemptempVO searchVO) throws Exception;
	
}
