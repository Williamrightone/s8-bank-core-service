package cc.synpulse8.bankcoreservice.domain.service.impl;

import cc.synpulse8.bankcoreservice.domain.model.TransactionEntity;
import cc.synpulse8.bankcoreservice.domain.repository.TransactionEntityRepository;
import cc.synpulse8.bankcoreservice.domain.service.TransactionInfoService;
import cc.synpulse8.bankcoreservice.presentation.dto.TransactionPageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TransactionInfoServiceImpl implements TransactionInfoService {

    @Autowired
    TransactionEntityRepository transactionEntityRepository;

    @Override
    public Page<TransactionEntity> getTransactionList(TransactionPageRequest transactionPageRequest) {

        Pageable pageable = PageRequest.of(transactionPageRequest.getPage(), transactionPageRequest.getSize());

        return transactionEntityRepository.findAllByAccountIBANAndValueDateBetween(transactionPageRequest.getIban(), transactionPageRequest.getStartDate(), transactionPageRequest.getEndDate(), pageable);
    }
}
