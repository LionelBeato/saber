package works.lionel.saber.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import lombok.*;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

/**
 *
 * Object representing a unit of knowledge or "knol."
 * @author Lionel Beato
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Document
public class Knol {

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Id
    private String id;
    private String title;
    private String description;
    private ContentUrls content_urls;
    private Image originalimage;
    private Image thumbnail;
    private String extract;
}

@AllArgsConstructor
@NoArgsConstructor
@Data
class ContentUrls {
    private Platform desktop;
    private Platform mobile;
}

@AllArgsConstructor
@NoArgsConstructor
@Data
class Platform {
    private String page;
    private String revisions;
    private String edit;
    private String talk;
}

@AllArgsConstructor
@NoArgsConstructor
@Data
class Image {
    private String source;
    private Integer width;
    private Integer height;
}