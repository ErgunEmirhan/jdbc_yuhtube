package com.ajwalker.databases;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface ICRUD<T> {
    void save(T t);
    void delete(int id);
    void softDelete(int id);
    void update(T t);
    List<T> findAll() throws SQLException;
    Optional<T> findById(int id) throws SQLException;
}
