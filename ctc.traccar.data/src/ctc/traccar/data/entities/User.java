package ctc.traccar.data.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.math.BigInteger;


/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name="users")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private BigInteger id;

	@Column(name="admin")
	private Byte admin;

	@Column(name="archive")
	private Byte archive;

	@Column(name="blocked")
	private Byte blocked;

	@Column(name="companyName")
	private String companyName;

	@Column(name="email")
	private String email;

	@Temporal(TemporalType.DATE)
	@Column(name="expirationDate")
	private Date expirationDate;

	@Column(name="firstName")
	private String firstName;

	@Column(name="lastName")
	private String lastName;

	@Column(name="login")
	private String login;

	@Column(name="managedBy_id")
	private BigInteger managedBy_id;

	@Column(name="manager")
	private Byte manager;

	@Column(name="maxNumOfDevices")
	private Integer maxNumOfDevices;

	@Column(name="notifications")
	private Byte notifications;

	@Column(name="password")
	private String password;

	@Column(name="password_hash_method")
	private Integer passwordHashMethod;

	@Column(name="phoneNumber")
	private String phoneNumber;

	@Column(name="readOnly")
	private Byte readOnly;
	
	@Column(name="userSettings_id")
	private BigInteger userSettings_id;
		
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="managedBy_id",insertable=false, updatable = false)
	private User managedby;
	
	@ManyToMany
	  @JoinTable(
	      name="users_geofences",
	      joinColumns= 
	      	@JoinColumn (name="user_id"),
	      inverseJoinColumns= 
	      	@JoinColumn(name="geofence_id"))
	private List<Geofence> geofences;
	
	
	@ManyToMany(fetch=FetchType.LAZY)
	  @JoinTable(
	      name="users_devices",
	      joinColumns= 
	      	@JoinColumn (name="users_id"),
	      inverseJoinColumns= 
	      	@JoinColumn(name="devices_id"))
	private List<Device> sharedDevices;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="userSettings_id", insertable = false, updatable = false)
	private UserSetting userSettings;
	
	@ManyToMany
	  @JoinTable(
	      name="reports_users",
	      joinColumns= 
	      	@JoinColumn (name="user_id"),
	      inverseJoinColumns= 
	      	@JoinColumn(name="report_id"))
	private List<Report> reports;
	
	
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

	public User getManagedby() {
		return managedby;
	}

	public void setManagedby(User managedby) {
		this.managedby = managedby;
	}
	
	public List<Geofence> getGeofences() {
		return geofences;
	}

	public void setGeofences(List<Geofence> geofences) {
		this.geofences = geofences;
	}

	public List<Device> getSharedDevices() {
		return sharedDevices;
	}

	public void setSharedDevices(List<Device> sharedDevices) {
		this.sharedDevices = sharedDevices;
	}

	public UserSetting getUserSettings() {
		return userSettings;
	}

	public void setUserSettings(UserSetting userSettings) {
		this.userSettings = userSettings;
	}

	public List<Report> getReports() {
		return reports;
	}

	public void setReports(List<Report> reports) {
		this.reports = reports;
	}
	
	
}