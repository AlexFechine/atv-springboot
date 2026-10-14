package biblioteca.biblioteca.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LivroPostPutDto {
    @JsonProperty("ISBN")
    @NotBlank(message = "ISBN não pode ser nulo")
    private Long ISBN;

    @JsonProperty("titulo")
    @NotBlank(message = "Não pode ter titulo vazio")
    private String nome;
}
