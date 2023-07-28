package com.prodeskco.prodeskco.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.prodeskco.prodeskco.entity.*;

public interface IUserRepo extends JpaRepository<user, Integer>{

}
