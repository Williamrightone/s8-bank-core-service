package cc.synpulse8.bankcoreservice.domain.service.impl;

import cc.synpulse8.bankcoreservice.domain.model.TransactionEntity;
import cc.synpulse8.bankcoreservice.domain.repository.TransactionEntityRepository;
import cc.synpulse8.bankcoreservice.domain.service.TransactionInfoService;
import cc.synpulse8.bankcoreservice.presentation.dto.TransactionListDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionInfoServiceImpl implements TransactionInfoService {

    @Autowired
    TransactionEntityRepository transactionEntityRepository;

    @Override
    public Page<TransactionEntity> getTransactionList(int page, int size) {

        Pageable pageable = PageRequest.of(page, size);

        return transactionEntityRepository.findAll(pageable);
    }
}
