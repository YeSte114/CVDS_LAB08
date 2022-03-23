package edu.eci.cvds.sampleprj.dao;

import java.util.List;

public interface TipoItemDAO {
    public void save(TipoItemDAO ti) throws PersistenceException;

    public TipoItemDAO load(int id) throws PersistenceException;

    public List<TipoItemDAO> loadTiposItems() throws PersistenceException;


}
