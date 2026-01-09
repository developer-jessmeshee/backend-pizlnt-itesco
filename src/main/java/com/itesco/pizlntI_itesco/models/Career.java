package com.itesco.pizlntI_itesco.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document( collection = "career")
public class Career {
    @Id
    private String id;
    private String name;
    private Boolean active = true;
}
