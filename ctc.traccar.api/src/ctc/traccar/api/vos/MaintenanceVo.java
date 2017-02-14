package ctc.traccar.api.vos;

import java.io.Serializable;
import java.math.BigInteger;



/**
 * COLUMNS AND MAPS READY
 * 
 */

public class MaintenanceVo implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigInteger id;

	private BigInteger deviceId;

	private Integer indexNo;

	private Double lastService;

	private String name;

	private Double serviceInterval;

	
	public MaintenanceVo(BigInteger id) {
		super();
		this.id=id;
	}
	public MaintenanceVo() {
	}

	public BigInteger getId() {
		return this.id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public BigInteger getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(BigInteger deviceId) {
		this.deviceId = deviceId;
	}

	public Integer getIndexNo() {
		return this.indexNo;
	}

	public void setIndexNo(Integer indexNo) {
		this.indexNo = indexNo;
	}

	public Double getLastService() {
		return this.lastService;
	}

	public void setLastService(Double lastService) {
		this.lastService = lastService;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getServiceInterval() {
		return this.serviceInterval;
	}

	public void setServiceInterval(Double serviceInterval) {
		this.serviceInterval = serviceInterval;
	}


}