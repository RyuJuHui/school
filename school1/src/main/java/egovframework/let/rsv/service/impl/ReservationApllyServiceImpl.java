package egovframework.let.rsv.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.com.cmm.service.FileVO;
import egovframework.let.rsv.service.ReservationApplyService;
import egovframework.let.rsv.service.ReservationApplyVO;
import egovframework.let.rsv.service.ReservationService;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import egovframework.rte.fdl.property.EgovPropertyService;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Service("reservationApplyService")
public class ReservationApllyServiceImpl implements ReservationApplyService {
	
	@Resource(name="propertiesService")
	protected EgovPropertyService propertyService;
	
	@Resource(name="reservationApplyMapper")
	private ReservationApplyMapper reservationApplyMapper;
	
	@Resource(name = "egovRsvIdGnrService")
	private EgovIdGnrService idgenService;
	
	@Resource(name="reservationService")
	private ReservationService reservationService;
	
	//예약자 목록 가져오기
	@Override
	public List<EgovMap> selectReservationApplyList(ReservationApplyVO vo) throws Exception {
		return reservationApplyMapper.selectReservationApplyList(vo);
	}
	
	//예약자 목록 수
	@Override
	public int selectReservationApplyListCnt(ReservationApplyVO vo) throws Exception {
		return reservationApplyMapper.selectReservationApplyListCnt(vo);
	}
	
	//예약자 상세정보
	@Override
	public ReservationApplyVO selectReservationApply(ReservationApplyVO vo) throws Exception {
		return reservationApplyMapper.selectReservationApply(vo);
	}
	
	//예약자 등록
	@Override
	public ReservationApplyVO insertReservationApply(ReservationApplyVO vo) throws Exception {
		return null;
	}
	
	//예약자 변경
	@Override
	public void updateReservationApply(ReservationApplyVO vo) throws Exception {
		
	}
	
	//예약자 삭제하기
	@Override
	public void deleteReservationApply(ReservationApplyVO vo) throws Exception {
		reservationApplyMapper.deleteReservationApply(vo);
	}
	
	//예약자 승인처리
	@Override
	public void updateReservationConfirm(ReservationApplyVO vo) throws Exception {
		reservationApplyMapper.updateReservationConfirm(vo);
	}
	
	//예약가능여부 확인
	@Override
	public ReservationApplyVO rsvCheck(ReservationApplyVO vo) throws Exception {
		return null;
	}
	
	
	@Override
	public Map<String, Object> excelUpload(FileVO file, ReservationApplyVO vo) throws Exception {
		return null;
	}

}
