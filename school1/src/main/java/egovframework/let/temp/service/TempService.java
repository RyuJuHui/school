package egovframework.let.temp.service;

import java.util.List;

public interface TempService {

	// 임시데이터 가져오기
	public TempVO selectTemp(TempVO vo) throws Exception;
	
	// 임시데이터 등록하기
	public String insertTemp(TempVO vo) throws Exception;
	
	// 리스트 이동
	public void listTemp(TempVO vo) throws Exception;

	public List<TempVO> list() throws Exception;

}
