package org.crazyit.firstboot.dao;

import org.crazyit.firstboot.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookDao extends CrudRepository<Book, Integer> {
}
