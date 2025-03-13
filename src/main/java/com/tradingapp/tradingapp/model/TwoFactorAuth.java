package com.tradingapp.tradingapp.model;

import com.tradingapp.tradingapp.domain.VerificationType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TwoFactorAuth {
	private boolean isEnabled = false;
	private VerificationType sendToType;
}
