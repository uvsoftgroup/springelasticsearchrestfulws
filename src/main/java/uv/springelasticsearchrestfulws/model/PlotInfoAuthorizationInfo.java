/**
 * 
 */
package uv.springelasticsearchrestfulws.model;

import java.sql.Date;


/**
 * @author A.Riaydh
 *
 */


public class PlotInfoAuthorizationInfo {
	
	Long auId;
	Long auAddressId;
	Date auAppliedDate;
	Date auApprovalDate;
	Date auPublishDate;
	String auCode;
	String auName;
	String auType;
	String auNumber;
	String auServiceCode;
	String auServiceName;
	byte [] auApplicationCopy;
	byte [] auApprovedCopy;
	String auRemark;
	Long auPlId;
	
	public PlotInfoAuthorizationInfo(){
		super();
	}
	public Long getAuId() {
		return auId;
	}
	public void setAuId(Long auId) {
		this.auId = auId;
	}
	public Long getAuAddressId() {
		return auAddressId;
	}
	public void setAuAddressId(Long auAddressId) {
		this.auAddressId = auAddressId;
	}
	public Date getAuAppliedDate() {
		return auAppliedDate;
	}
	public void setAuAppliedDate(Date auAppliedDate) {
		this.auAppliedDate = auAppliedDate;
	}
	public Date getAuApprovalDate() {
		return auApprovalDate;
	}
	public void setAuApprovalDate(Date auApprovalDate) {
		this.auApprovalDate = auApprovalDate;
	}
	public Date getAuPublishDate() {
		return auPublishDate;
	}
	public void setAuPublishDate(Date auPublishDate) {
		this.auPublishDate = auPublishDate;
	}
	public String getAuCode() {
		return auCode;
	}
	public void setAuCode(String auCode) {
		this.auCode = auCode;
	}
	public String getAuName() {
		return auName;
	}
	public void setAuName(String auName) {
		this.auName = auName;
	}
	public String getAuType() {
		return auType;
	}
	public void setAuType(String auType) {
		this.auType = auType;
	}
	public String getAuNumber() {
		return auNumber;
	}
	public void setAuNumber(String auNumber) {
		this.auNumber = auNumber;
	}
	public String getAuServiceCode() {
		return auServiceCode;
	}
	public void setAuServiceCode(String auServiceCode) {
		this.auServiceCode = auServiceCode;
	}
	public String getAuServiceName() {
		return auServiceName;
	}
	public void setAuServiceName(String auServiceName) {
		this.auServiceName = auServiceName;
	}
	public byte[] getAuApplicationCopy() {
		return auApplicationCopy;
	}
	public void setAuApplicationCopy(byte[] auApplicationCopy) {
		this.auApplicationCopy = auApplicationCopy;
	}
	public byte[] getAuApprovedCopy() {
		return auApprovedCopy;
	}
	public void setAuApprovedCopy(byte[] auApprovedCopy) {
		this.auApprovedCopy = auApprovedCopy;
	}
	public String getAuRemark() {
		return auRemark;
	}
	public void setAuRemark(String auRemark) {
		this.auRemark = auRemark;
	}
	public Long getAuPlId() {
		return auPlId;
	}
	public void setAuPlId(Long auPlId) {
		this.auPlId = auPlId;
	}
	
	
	
	

}
