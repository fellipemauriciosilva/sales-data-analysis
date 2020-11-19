package br.com.agibank.sale.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "cnpj")
@ToString
@Builder
public class Customer {

    private String cnpj;
    private String name;
    private String businessArea;
	
}
