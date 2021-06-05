package works.lionel.saber.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public
class Image {
    private String source;
    private Integer width;
    private Integer height;
}