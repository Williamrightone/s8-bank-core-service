package cc.synpulse8.bankcoreservice.presentation.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class TransactionPageRequest {

    private int page;

    private int size;

    private LocalDate startDate;

    private LocalDate endDate;

    private String iban;

}
