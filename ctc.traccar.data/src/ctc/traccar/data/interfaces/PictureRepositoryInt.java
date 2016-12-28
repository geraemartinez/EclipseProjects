package ctc.traccar.data.interfaces;

import java.util.List;

import ctc.traccar.data.entities.Picture;

public interface PictureRepositoryInt {

	public List<Picture> getAllPicture();
	public Picture getPictureById(Picture pi);
}
