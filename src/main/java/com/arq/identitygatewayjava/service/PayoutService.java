package com.arq.identitygatewayjava.service;

import com.arq.identitygatewayjava.dto.PayoutResponse;
import com.arq.identitygatewayjava.repository.PayoutRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PayoutService {
    private final PayoutRepository repository;

    public PayoutService(PayoutRepository repository) {
        this.repository = repository;
    }

    public List<PayoutResponse> summarize() {
        return repository.findAll().stream().map(record -> new PayoutResponse(record.getId(), "ACTIVE", record.getOwner())).toList();
    }
}
