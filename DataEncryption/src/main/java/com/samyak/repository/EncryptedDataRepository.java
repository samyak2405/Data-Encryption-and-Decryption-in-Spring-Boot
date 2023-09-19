package com.samyak.repository;

import com.samyak.entity.EncryptedData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EncryptedDataRepository extends JpaRepository<EncryptedData,Long> {
}
