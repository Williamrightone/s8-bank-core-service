package cc.synpulse8.bankcoreservice.domain.service;

import cc.synpulse8.bankcoreservice.domain.model.TransactionEntity;
import cc.synpulse8.bankcoreservice.presentation.dto.PageRequest;
import cc.synpulse8.bankcoreservice.presentation.dto.TransactionListDto;
import org.springframework.data.domain.Page;

public interface TransactionInfoService {

    Page<TransactionEntity> getTransactionList(PageRequest pageRequest);

}
