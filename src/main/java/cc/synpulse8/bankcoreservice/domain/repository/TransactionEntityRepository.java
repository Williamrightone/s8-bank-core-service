package cc.synpulse8.bankcoreservice.domain.repository;

import cc.synpulse8.bankcoreservice.domain.model.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionEntityRepository extends JpaRepository<TransactionEntity, String> {
}
