package ctc.traccar.data.dao;

import java.util.List;

import ctc.traccar.data.entities.Statistic;

public interface StatisticRepositoryInt {

	public List<Statistic> getAll();
	public Statistic getById(Statistic obj);
	
}
