package works.lionel.saber.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
class Platform {
    private String page;
    private String revisions;
    private String edit;
    private String talk;
}
