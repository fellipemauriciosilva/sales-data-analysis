package br.com.agibank.sale.domain;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@AllArgsConstructor
@EqualsAndHashCode(of = "cpf")
@ToString
@Builder
public class Seller {

	public Seller() {
		salesAmount = new BigDecimal(0);
	}

	private String cpf;
	private String name;
	private BigDecimal salary;
	private BigDecimal salesAmount;

	public void addSalePrice(BigDecimal value) {
		if (salesAmount == null)
			salesAmount = new BigDecimal(0);
		salesAmount = salesAmount.add(value);
	}
}
