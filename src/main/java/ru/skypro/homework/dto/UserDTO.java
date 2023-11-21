package ru.skypro.homework.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(description = "")
public class UserDTO {
    @Schema(description = "id авторизованного пользователя")
    private int id;
    @Schema(description = "адрес электронной почты авторизованного пользователя")
    @NotBlank
    @Email
    private String email;
    @Schema(description = "имя пользователя")
    @NotBlank
    @Size(min = 1, max = 20)
    private String firstName;
    @Schema(description = "фамилия пользователя")
    @NotBlank
    @Size(min = 1, max = 20)
    private String lastName;
    @Schema(description = "номер телефона авторизованного пользователя")
    @NotBlank
    @Pattern(regexp = "\\+7\s?\\(?\\d{3}\\)?\s?\\d{3}-?\\d{2}-?\\d{2}")
    private String phone;
    @Schema(description = "роль пользователя")
    @NotBlank
    private RoleDTO role;
    @Schema(description = "ссылка на аватар авторизованного пользователя")
    @NotBlank
    private String image;

}
