package com.example.swigatto.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class FoodRequest {

    int requiredQuantity;

    String customerMobile;

    int menuItemId;
}
