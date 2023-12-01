package cc.synpulse8.bankcoreservice.presentation.controller;

import cc.synpulse8.bankcoreservice.application.TransactionService;
import cc.synpulse8.bankcoreservice.domain.model.TransactionEntity;
import cc.synpulse8.bankcoreservice.presentation.dto.PageRequest;
import cc.synpulse8.bankcoreservice.presentation.dto.TransactionListDto;
import cc.synpulse8.bankcoreservice.presentation.rest.RestfulResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/core-banking")
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @PostMapping("/transactions")
    public RestfulResponse<Page<TransactionEntity>> getTransactionList(@RequestBody PageRequest pageRequest) {

        return transactionService.getTransactionList(pageRequest);
    }

}
