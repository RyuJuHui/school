package egovframework.let.temp.service.impl;

import java.util.List;

import egovframework.let.temp.service.TempVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("tempMapper")
public interface TempMapper {

	//임시데이터 가져오기
	TempVO selectTemp(TempVO vo) throws Exception;
	
	//임시데이터 등록
	void insertTemp(TempVO vo) throws Exception;

	//임시데이터 목록 가져오기
	List<TempVO> listTemp(TempVO vo) throws Exception;
	
	//임시데이터 목록 수
	int selectTempListCnt(TempVO vo) throws Exception;
	
	//임시데이터 수정하기
	void updateTemp(TempVO vo) throws Exception;
	
	//임시데이터 삭제하기
	void deleteTemp(TempVO vo) throws Exception;


}
