package rs.edu.raf.banka1.model.dtos;


import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CurrencyDto {

    private String currencyName;

    private String currencyCode;
}
