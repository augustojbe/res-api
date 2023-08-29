package com.restApi.api.db;

import com.restApi.api.Entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoriContato extends JpaRepository<Contato, Long> {

}
