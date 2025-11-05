package com.greenapi.baseline.database.repo;

import com.greenapi.baseline.database.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
// TODO : add queries
}

