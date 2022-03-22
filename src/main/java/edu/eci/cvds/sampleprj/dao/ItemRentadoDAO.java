package edu.eci.cvds.sampleprj.dao;

import java.sql.Date;
import java.util.List;

import edu.eci.cvds.samples.entities.ItemRentado;

public interface ItemRentadoDAO {

    public ItemRentado load(int idItem) throws PersistenceException;

    public List<ItemRentado> loadAll(long idClient) throws PersistenceException;

}