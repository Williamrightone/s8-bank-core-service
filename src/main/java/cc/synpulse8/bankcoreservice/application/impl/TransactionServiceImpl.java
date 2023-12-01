package cc.synpulse8.bankcoreservice.application.impl;

import cc.synpulse8.bankcoreservice.application.TransactionService;
import cc.synpulse8.bankcoreservice.domain.model.TransactionEntity;
import cc.synpulse8.bankcoreservice.domain.service.TransactionInfoService;
import cc.synpulse8.bankcoreservice.presentation.dto.PageRequest;
import cc.synpulse8.bankcoreservice.presentation.dto.TransactionListDto;
import cc.synpulse8.bankcoreservice.presentation.rest.RestfulResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    TransactionInfoService transactionInfoService;

    @Override
    public RestfulResponse<Page<TransactionEntity>> getTransactionList(PageRequest pageRequest) {

        return new RestfulResponse<>(transactionInfoService.getTransactionList(pageRequest));
    }
}
