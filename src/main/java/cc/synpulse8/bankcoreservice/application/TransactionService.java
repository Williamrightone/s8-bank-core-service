package cc.synpulse8.bankcoreservice.application;

import cc.synpulse8.bankcoreservice.domain.model.TransactionEntity;
import cc.synpulse8.bankcoreservice.presentation.dto.TransactionListDto;
import cc.synpulse8.bankcoreservice.presentation.dto.TransactionPageRequest;
import cc.synpulse8.bankcoreservice.presentation.rest.RestfulResponse;
import org.springframework.data.domain.Page;

public interface TransactionService {

    RestfulResponse<TransactionListDto> getTransactionList(TransactionPageRequest transactionPageRequest);

}
