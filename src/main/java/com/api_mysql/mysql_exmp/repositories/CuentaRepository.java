package com.api_mysql.mysql_exmp.repositories;
import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api_mysql.mysql_exmp.models.CuentasModel;


@Repository
public interface CuentaRepository extends CrudRepository<CuentasModel, Long> {
}