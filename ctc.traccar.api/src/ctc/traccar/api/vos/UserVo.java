package ctc.traccar.api.vos;

import java.io.Serializable;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the users database table.
 * 
 */

public class UserVo implements Serializable {
	

	private static final long serialVersionUID = 1L;

	private BigInteger id;

	private Byte admin;

	private Byte archive;

	private Byte blocked;

	private String companyName;

	private String email;
	
	private Date expirationDate;

	private String firstName;

	private String lastName;

	private String login;

	private BigInteger managedBy_id;

	private Byte manager;

	private Integer maxNumOfDevices;

	private Byte notifications;

	private String password;

	private Integer passwordHashMethod;

	private String phoneNumber;

	private Byte readOnly;
	
	private BigInteger userSettings_id;
	
	public UserVo(){
		
	}
	
	public UserVo(BigInteger id) {
		super();
		this.id = id;
	}

	public UserVo(String email) {
		super();
		this.email = email;
	}
	public UserVo(String login,String password) {
		super();
		this.login = login;
		this.password = password;
	}
		
	
	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public Byte getAdmin() {
		return admin;
	}

	public void setAdmin(Byte admin) {
		this.admin = admin;
	}

	public Byte getArchive() {
		return archive;
	}

	public void setArchive(Byte archive) {
		this.archive = archive;
	}

	public Byte getBlocked() {
		return blocked;
	}

	public void setBlocked(Byte blocked) {
		this.blocked = blocked;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public BigInteger getManagedBy_id() {
		return managedBy_id;
	}

	public void setManagedBy_id(BigInteger managedBy_id) {
		this.managedBy_id = managedBy_id;
	}

	public Byte getManager() {
		return manager;
	}

	public void setManager(Byte manager) {
		this.manager = manager;
	}

	public Integer getMaxNumOfDevices() {
		return maxNumOfDevices;
	}

	public void setMaxNumOfDevices(Integer maxNumOfDevices) {
		this.maxNumOfDevices = maxNumOfDevices;
	}

	public Byte getNotifications() {
		return notifications;
	}

	public void setNotifications(Byte notifications) {
		this.notifications = notifications;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getPasswordHashMethod() {
		return passwordHashMethod;
	}

	public void setPasswordHashMethod(Integer passwordHashMethod) {
		this.passwordHashMethod = passwordHashMethod;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Byte getReadOnly() {
		return readOnly;
	}

	public void setReadOnly(Byte readOnly) {
		this.readOnly = readOnly;
	}

	public BigInteger getUserSettings_id() {
		return userSettings_id;
	}

	public void setUserSettings_id(BigInteger userSettings_id) {
		this.userSettings_id = userSettings_id;
	}

}