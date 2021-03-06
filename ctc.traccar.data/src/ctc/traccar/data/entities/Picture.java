package ctc.traccar.data.entities;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.*;



/**
 * The persistent class for the pictures database table.
 * 
 */
@Entity
@Table(name="pictures")
public class Picture implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private BigInteger id;

	@Lob
	@Column(name="data")
	private Byte[] data;

	@Column(name="height")
	private Integer height;

	@Column(name="mimeType")
	private String mimeType;

	@Column(name="type")
	private String type;

	@Column(name="width")
	private Integer width;

	
	public Picture() {
	}

	public BigInteger getId() {
		return this.id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public Byte[] getData() {
		return this.data;
	}

	public void setData(Byte[] data) {
		this.data = data;
	}

	public Integer getHeight() {
		return this.height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public String getMimeType() {
		return this.mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getWidth() {
		return this.width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	
}