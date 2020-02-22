package com.spyder.conman.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class FirstPostRequest {

    @JsonProperty("id")
    private String id;

    @JsonProperty("order_id")
    private String orderId;

    @JsonProperty("amount")
    private String amount;

    @JsonProperty("coupon")
    private String coupon;
}
