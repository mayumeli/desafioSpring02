package com.example.challenge_quality.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class District {

    private Integer id;

    @NotBlank(message = "O bairro não pode estar vazio.")
    @Size(min = 3, max = 45, message = "O comprimento do nome do bairro deve ter entre 3 e 45 caracteres.")
    @Pattern(regexp = "\\p{Upper}.*", message = "O nome do bairro deve começar com uma letra maiúscula.")
    private String name;

    @NotNull(message = "O valor do metro quadrado do bairro não pode estar vazio.")
    @Digits(integer=11, fraction=2)
    private BigDecimal valueDistrictM2;
}
