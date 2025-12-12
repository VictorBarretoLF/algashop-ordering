package com.algaworks.algashop.ordering.domain.exception;

public class CustomerArchivedException extends DomainException {

    public CustomerArchivedException() {
        super(ERROR_CUSTOMER_ARCHIVED);
    }

    public CustomerArchivedException(Throwable cause) {
        super(ERROR_CUSTOMER_ARCHIVED, cause);
    }

    public static final String ERROR_CUSTOMER_ARCHIVED = "Customer is archived it cannot be changed";
}

