package ctc.traccar.business.implementations;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ctc.traccar.api.vos.PictureVo;
import ctc.traccar.business.helpers.PictureHelper;
import ctc.traccar.business.interfaces.PictureServiceInt;
import ctc.traccar.data.entities.Picture;
import ctc.traccar.data.interfaces.PictureRepositoryInt;

@Service
public class PictureService implements PictureServiceInt{

	private static Logger logger = Logger.getLogger(PictureService.class);

	@Autowired
	PictureRepositoryInt repo;
	
	@Override
	public List<PictureVo> getAllPicture() {
		try {
			List<PictureVo> result = new ArrayList<PictureVo>();
			List<Picture> pics =  repo.getAllPicture();
			
			if (pics!=null && !pics.isEmpty()){
				
				result =  PictureHelper.converToVo(pics);
				return result;
				
			}
						
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at PictureService getAllPicture() method : " + e.getMessage());
		}
		return null;
	}

	@Override
	public PictureVo getPictureById(PictureVo pi) {
		try {
			
			PictureVo result = new PictureVo();
			
			if(pi!=null && pi.getId()!=null){
				
				Picture ToSearch = PictureHelper.converToObj(pi);
				result =  PictureHelper.converToVO(repo.getPictureById(ToSearch));
				return result;
				
			}
			
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at PictureService getPictureById() method : " + e.getMessage());
		}
		return null;
	}

}
