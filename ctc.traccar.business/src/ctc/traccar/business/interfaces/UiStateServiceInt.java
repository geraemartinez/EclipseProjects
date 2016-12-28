package ctc.traccar.business.interfaces;

import java.util.Set;

import ctc.traccar.api.vos.*;

public interface UiStateServiceInt {

	public Set<UiStateVo> getAllUiState();
	public UiStateVo getUiStateById(UiStateVo ui);
	public UserVo getUserByUiState(UiStateVo ui);
	
}