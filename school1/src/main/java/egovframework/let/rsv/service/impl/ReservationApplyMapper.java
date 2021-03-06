package egovframework.let.rsv.service.impl;

import java.util.List;

import egovframework.let.rsv.service.ReservationApplyVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Mapper("reservationApplyMapper")
public interface ReservationApplyMapper {
	
	//예약자 목록 가져오기
	List<EgovMap> selectReservationApplyList(ReservationApplyVO vo) throws Exception;
	
	//예약자 목록 수
	int selectReservationApplyListCnt(ReservationApplyVO vo) throws Exception;
	
	//예약자 상세정보
	ReservationApplyVO selectReservationApply(ReservationApplyVO vo) throws Exception;
	
	//예약자 삭제하기
	void deleteReservationApply(ReservationApplyVO vo) throws Exception;
	
	//예약자 승인처리
	void updateReservationConfirm(ReservationApplyVO vo) throws Exception;
	
	//예약자 수정하기
	
	//예약 가능여부 확인
	
	//임시예약자 등록하기
}
