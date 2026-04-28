package com.pago.servicio_de_pagos.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PagoResponceDTO {

    private Long id;
    private BigDecimal monto;
    private String metodoPago;
    private String estadoPago;
    private LocalDate fechaPago;

}
