package ru.lessons.lesson3;

import java.time.LocalDate;
import java.util.UUID;

public class Request {
    private UUID productId;
    private LocalDate operationDate;

    public Request() {
    }

    public Request(UUID productId, LocalDate operationDate) {
        this.productId = productId;
        this.operationDate = operationDate;
    }

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public LocalDate getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(LocalDate operationDate) {
        this.operationDate = operationDate;
    }
}