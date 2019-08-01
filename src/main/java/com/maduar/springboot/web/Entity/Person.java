package com.maduar.springboot.web.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Description:
 *
 * @author maduar
 * @email maduar@163.com
 * @date 01/08/2019 16:33
 */
@Entity
public class Person {

    @Id
    private Integer id;

    private String name;

}
