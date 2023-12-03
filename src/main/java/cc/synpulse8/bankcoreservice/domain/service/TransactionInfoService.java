package cc.synpulse8.bankcoreservice.domain.service;

import cc.synpulse8.bankcoreservice.domain.model.TransactionEntity;
import cc.synpulse8.bankcoreservice.presentation.dto.TransactionPageRequest;
import org.springframework.data.domain.Page;

public interface TransactionInfoService {

    Page<TransactionEntity> getTransactionList(TransactionPageRequest transactionPageRequest);

}
