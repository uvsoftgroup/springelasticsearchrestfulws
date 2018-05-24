/**
 * 
 */
package uv.springelasticsearchrestfulws.model;

import java.sql.Date;

/**
 * @author A.Riaydh
 *
 */


public class PlotInfoPaymentInfo {

	Long paId;
	Long paBiId;
	String paType;
	Date  paDate;
	String paRefNumber;
	byte [] paCopy;
	Double paTotalAmount;
	Double paPaidAmount;
	String paRemark;
	Long paCreaterAddressId;
	String paCreaterName;
	String pyCreaterAuthority;
	Long paPlId;
	
	public PlotInfoPaymentInfo(){
		super();
	}
	
	
	public Long getPaId() {
		return paId;
	}
	public void setPaId(Long paId) {
		this.paId = paId;
	}
	public Long getPaBiId() {
		return paBiId;
	}
	public void setPaBiId(Long paBiId) {
		this.paBiId = paBiId;
	}
	public String getPaType() {
		return paType;
	}
	public void setPaType(String paType) {
		this.paType = paType;
	}
	public Date getPaDate() {
		return paDate;
	}
	public void setPaDate(Date paDate) {
		this.paDate = paDate;
	}
	public String getPaRefNumber() {
		return paRefNumber;
	}
	public void setPaRefNumber(String paRefNumber) {
		this.paRefNumber = paRefNumber;
	}
	public byte[] getPaCopy() {
		return paCopy;
	}
	public void setPaCopy(byte[] paCopy) {
		this.paCopy = paCopy;
	}
	public Double getPaTotalAmount() {
		return paTotalAmount;
	}
	public void setPaTotalAmount(Double paTotalAmount) {
		this.paTotalAmount = paTotalAmount;
	}
	public Double getPaPaidAmount() {
		return paPaidAmount;
	}
	public void setPaPaidAmount(Double paPaidAmount) {
		this.paPaidAmount = paPaidAmount;
	}
	public String getPaRemark() {
		return paRemark;
	}
	public void setPaRemark(String paRemark) {
		this.paRemark = paRemark;
	}
	public Long getPaCreaterAddressId() {
		return paCreaterAddressId;
	}
	public void setPaCreaterAddressId(Long paCreaterAddressId) {
		this.paCreaterAddressId = paCreaterAddressId;
	}
	public String getPaCreaterName() {
		return paCreaterName;
	}
	public void setPaCreaterName(String paCreaterName) {
		this.paCreaterName = paCreaterName;
	}
	public String getPyCreaterAuthority() {
		return pyCreaterAuthority;
	}
	public void setPyCreaterAuthority(String pyCreaterAuthority) {
		this.pyCreaterAuthority = pyCreaterAuthority;
	}
	public Long getPaPlId() {
		return paPlId;
	}
	public void setPaPlId(Long paPlId) {
		this.paPlId = paPlId;
	}
	

}
