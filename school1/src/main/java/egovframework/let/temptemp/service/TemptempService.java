package egovframework.let.temptemp.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

public interface TemptempService {

	public List<EgovMap> listTemp(TemptempVO searchVO) throws Exception;
}
