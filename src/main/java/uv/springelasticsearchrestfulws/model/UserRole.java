/**
 * 
 */
package uv.springelasticsearchrestfulws.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;



/**
 * @author A.Riaydh
 *
 */
@Document(indexName = "userregistration", type = "userroles")
public class UserRole implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	
	 Long userRoleId;
	 String userRoleName;
	 String userRoleType;
	 Date userRoleDate;
	public Long getUserRoleId() {
		return userRoleId;
	}
	public void setUserRoleId(Long userRoleId) {
		this.userRoleId = userRoleId;
	}
	public String getUserRoleName() {
		return userRoleName;
	}
	public void setUserRoleName(String userRoleName) {
		this.userRoleName = userRoleName;
	}
	public String getUserRoleType() {
		return userRoleType;
	}
	public void setUserRoleType(String userRoleType) {
		this.userRoleType = userRoleType;
	}
	public Date getUserRoleDate() {
		return userRoleDate;
	}
	public void setUserRoleDate(Date userRoleDate) {
		this.userRoleDate = userRoleDate;
	}
	 
	 
	 
}
