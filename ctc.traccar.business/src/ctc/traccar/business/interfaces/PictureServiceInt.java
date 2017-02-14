package ctc.traccar.business.interfaces;

import java.util.List;

import ctc.traccar.api.vos.PictureVo;


public interface PictureServiceInt {

	public List<PictureVo> getAllPicture();
	public PictureVo getPictureById(PictureVo pi);
}
