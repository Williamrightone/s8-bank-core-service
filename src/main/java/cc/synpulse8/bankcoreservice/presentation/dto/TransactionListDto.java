package cc.synpulse8.bankcoreservice.presentation.dto;

import cc.synpulse8.bankcoreservice.domain.vo.Transactions;
import lombok.Data;

import java.util.List;

@Data
public class TransactionListDto {

    List<Transactions> transactions;

    int totalPages;

    long totalElements;

}
