package ctc.traccar.data.interfaces;

import java.util.List;

import ctc.traccar.data.entities.UiState;
import ctc.traccar.data.entities.User;

public interface UiStateRepositoryInt {

	public List<UiState> getAllUiState();
	public UiState getUiStateById(UiState ui);
	public User getUserByUiState(UiState ui);
	
}
