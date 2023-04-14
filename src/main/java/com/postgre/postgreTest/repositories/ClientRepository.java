package com.postgre.postgreTest.repositories;

import com.postgre.postgreTest.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
