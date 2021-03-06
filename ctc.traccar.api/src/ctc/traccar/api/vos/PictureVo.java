package ctc.traccar.api.vos;

import java.io.Serializable;
import java.math.BigInteger;


/**
 * The persistent class for the pictures database table.
 * 
 */

public class PictureVo implements Serializable {
	private static final long serialVersionUID = 1L;


	private BigInteger id;

	private Byte[] data;

	private Integer height;

	private String mimeType;

	private String type;

	private Integer width;

	public PictureVo(BigInteger id) {
		super();
		this.id = id;
	}
	public PictureVo() {
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