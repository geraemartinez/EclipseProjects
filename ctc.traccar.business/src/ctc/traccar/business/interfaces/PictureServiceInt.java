package ctc.traccar.business.interfaces;

import java.util.Set;

import ctc.traccar.api.vos.PictureVo;


public interface PictureServiceInt {

	public Set<PictureVo> getAllPicture();
	public PictureVo getPictureById(PictureVo pi);
}
