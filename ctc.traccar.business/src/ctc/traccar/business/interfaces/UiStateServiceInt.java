package ctc.traccar.business.interfaces;

import java.util.List;

import ctc.traccar.api.vos.*;

public interface UiStateServiceInt {

	public List<UiStateVo> getAllUiState();
	public UiStateVo getUiStateById(UiStateVo ui);
	public UserVo getUserByUiState(UiStateVo ui);
	
}
