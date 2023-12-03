package cc.synpulse8.bankcoreservice.application.impl;

import cc.synpulse8.bankcoreservice.application.TransactionService;
import cc.synpulse8.bankcoreservice.domain.model.TransactionEntity;
import cc.synpulse8.bankcoreservice.domain.service.TransactionInfoService;
import cc.synpulse8.bankcoreservice.domain.vo.Transactions;
import cc.synpulse8.bankcoreservice.presentation.dto.TransactionListDto;
import cc.synpulse8.bankcoreservice.presentation.dto.TransactionPageRequest;
import cc.synpulse8.bankcoreservice.presentation.rest.RestfulResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    TransactionInfoService transactionInfoService;

    @Override
    public RestfulResponse<TransactionListDto> getTransactionList(TransactionPageRequest transactionPageRequest) {

        Page<TransactionEntity> transactionEntityPage = transactionInfoService.getTransactionList(transactionPageRequest);

        TransactionListDto transactionListDto = new TransactionListDto();

        List<Transactions> transactions = new ArrayList<>();

        transactionEntityPage.getContent().forEach(transactionEntity -> {
            Transactions transaction = new Transactions();
            transaction.setTransactionType(transactionEntity.getTransactionType());
            transaction.setUniqueIdentifier(transactionEntity.getUniqueIdentifier());
            transaction.setId(transactionEntity.getId());
            transaction.setCurrencyCode(transactionEntity.getCurrencyCode());
            transaction.setAmount(transactionEntity.getAmount());
            transaction.setAccountIBAN(transactionEntity.getAccountIBAN());
            transaction.setValueDate(transactionEntity.getValueDate());
            transaction.setDescription(transactionEntity.getDescription());
            transactions.add(transaction);
        });

        transactionListDto.setTransactions(transactions);
        transactionListDto.setTotalPages(transactionEntityPage.getTotalPages());
        transactionListDto.setTotalElements(transactionEntityPage.getTotalElements());

        log.info("transactionListDto: =====> {}", transactionListDto);


        log.info("transactionListDto: =====> {}", transactionListDto);

        return new RestfulResponse<>(transactionListDto);
    }
}
