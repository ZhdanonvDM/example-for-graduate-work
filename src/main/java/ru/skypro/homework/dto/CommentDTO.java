package ru.skypro.homework.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(description = "комментарий к объявлению")
public class CommentDTO {
    @Schema(description = "id создателя комментария")
    private int author;
    @Schema(description = "ссылка на аватар автора комментария")
    @NotBlank
    private String authorImage;
    @Schema(description = "имя создателя комментария")
    @NotNull
    @Size(min = 3, max=20)
    private String authorFirstName;
    @Schema(description = "время создания комментария")
    private int createdAt;
    @Schema(description = "id комментария")
    private int pk;
    @Schema(description = "заголовок комментария")
    @NotBlank
    @Size(min = 4, max = 25)
    private String title;
    @Schema(description = "текст комментария")
    @NotBlank
    @Size(min = 4, max = 100)
    private String text;

}
