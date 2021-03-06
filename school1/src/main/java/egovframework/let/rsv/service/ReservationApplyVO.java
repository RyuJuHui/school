package egovframework.let.rsv.service;

import java.io.Serializable;
import java.util.Date;

public class ReservationApplyVO extends ReservationVO implements Serializable{
	//예약아이디
	private String resveId;
	//예약자 아이디
	private String reqstId;
	//신청구분코드
	private String resveDe;
	
	private String chargerNm;
	private String telno;
	private String email;
	private String confmSeCode;
	private String confmerId;
	private String returnResn;
	private Date confmPnttm;
	private String creatIp;
	private String useAt;
	private Date frstRegistPnttm;
	private String frstRegisterId;
	private Date lastUpdtPnttm;
	private String lastUpdusrId;
	
	//사용자 ID
	private String userId;
	//관리자여부
	private String mngAt;
	//에러코드
	private String errorCode;
	//메세지
	private String message;
	//엑셀 여부
	private String excelAt;
	//임시예약자ID
	private String reqsttempId;
	
	public String getExcelAt() {
		return excelAt;
	}
	public void setExcelAt(String excelAt) {
		this.excelAt = excelAt;
	}
	public String getReqsttempId() {
		return reqsttempId;
	}
	public void setReqsttempId(String reqsttempId) {
		this.reqsttempId = reqsttempId;
	}
	public String getResveId() {
		return resveId;
	}
	public void setResveId(String resveId) {
		this.resveId = resveId;
	}
	public String getReqstId() {
		return reqstId;
	}
	public void setReqstId(String reqstId) {
		this.reqstId = reqstId;
	}
	public String getResveDe() {
		return resveDe;
	}
	public void setResveDe(String resveDe) {
		this.resveDe = resveDe;
	}
	public String getChargerNm() {
		return chargerNm;
	}
	public void setChargerNm(String chargerNm) {
		this.chargerNm = chargerNm;
	}
	public String getTelno() {
		return telno;
	}
	public void setTelno(String telno) {
		this.telno = telno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getConfmSeCode() {
		return confmSeCode;
	}
	public void setConfmSeCode(String confmSeCode) {
		this.confmSeCode = confmSeCode;
	}
	public String getConfmerId() {
		return confmerId;
	}
	public void setConfmerId(String confmerId) {
		this.confmerId = confmerId;
	}
	public String getReturnResn() {
		return returnResn;
	}
	public void setReturnResn(String returnResn) {
		this.returnResn = returnResn;
	}
	public Date getConfmPnttm() {
		return confmPnttm;
	}
	public void setConfmPnttm(Date confmPnttm) {
		this.confmPnttm = confmPnttm;
	}
	public String getCreatIp() {
		return creatIp;
	}
	public void setCreatIp(String creatIp) {
		this.creatIp = creatIp;
	}
	public String getUseAt() {
		return useAt;
	}
	public void setUseAt(String useAt) {
		this.useAt = useAt;
	}
	public Date getFrstRegistPnttm() {
		return frstRegistPnttm;
	}
	public void setFrstRegistPnttm(Date frstRegistPnttm) {
		this.frstRegistPnttm = frstRegistPnttm;
	}
	public String getFrstRegisterId() {
		return frstRegisterId;
	}
	public void setFrstRegisterId(String frstRegisterId) {
		this.frstRegisterId = frstRegisterId;
	}
	public Date getLastUpdtPnttm() {
		return lastUpdtPnttm;
	}
	public void setLastUpdtPnttm(Date lastUpdtPnttm) {
		this.lastUpdtPnttm = lastUpdtPnttm;
	}
	public String getLastUpdusrId() {
		return lastUpdusrId;
	}
	public void setLastUpdusrId(String lastUpdusrId) {
		this.lastUpdusrId = lastUpdusrId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMngAt() {
		return mngAt;
	}
	public void setMngAt(String mngAt) {
		this.mngAt = mngAt;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}