package com.carnasa.cr.mergerequestbackend.repositories;

import com.carnasa.cr.mergerequestbackend.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Long> {

}
