package com.maduar.springboot.web.repositoriy;

import com.maduar.springboot.web.Entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Description:
 *
 * @author maduar
 * @email maduar@163.com
 * @date 01/08/2019 16:35
 */
@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {
}
