package ctc.traccar.api.vos;

import java.io.Serializable;
import java.math.BigInteger;

/**
 * COLUMNS AND MAPS READY
 * 
 */

public class GroupVo implements Serializable {
	private static final long serialVersionUID = 1L;


	private BigInteger id;
	
	private String description;
	
	private String name;
	
	private BigInteger parentId;

	public GroupVo(BigInteger id) {
		super();
		this.id =id;
	}

	public GroupVo() {
	}

	public BigInteger getId() {
		return this.id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigInteger getParentId() {
		return this.parentId;
	}

	public void setParentId(BigInteger parentId) {
		this.parentId = parentId;
	}



}