package cc.synpulse8.bankcoreservice.domain.repository;

import cc.synpulse8.bankcoreservice.domain.model.TransactionEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface TransactionEntityRepository extends JpaRepository<TransactionEntity, String> {

    Page<TransactionEntity> findAllByValueDateBetween(LocalDate startDate, LocalDate endDate, Pageable pageable);

}
