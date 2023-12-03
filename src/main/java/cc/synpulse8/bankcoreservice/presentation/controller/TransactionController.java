package cc.synpulse8.bankcoreservice.presentation.controller;

import cc.synpulse8.bankcoreservice.application.TransactionService;
import cc.synpulse8.bankcoreservice.presentation.dto.TransactionListDto;
import cc.synpulse8.bankcoreservice.presentation.dto.TransactionPageRequest;
import cc.synpulse8.bankcoreservice.presentation.rest.RestfulResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/core-banking")
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @PostMapping("/transactions")
    public RestfulResponse<TransactionListDto> getTransactionList(@RequestBody TransactionPageRequest transactionPageRequest) {

        return transactionService.getTransactionList(transactionPageRequest);
    }

}
