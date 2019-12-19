package com.quechao.order.form;

import lombok.Data;

import javax.persistence.Lob;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;

@Data
public class ModifyOrderPrice {

    private Long orderId;

    @NotEmpty
    @Min(value = 0)
    private BigDecimal orderPrice;

    @Lob
    private String reason;

}
