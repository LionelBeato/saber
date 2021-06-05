package works.lionel.saber.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ContentUrls {
    private Platform desktop;
    private Platform mobile;
}