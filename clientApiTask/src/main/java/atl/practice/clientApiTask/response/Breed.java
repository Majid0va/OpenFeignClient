package atl.practice.clientApiTask.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Breed {
    private String breed;
    private String country;
    private String origin;
    private String coat;
    private String pattern;
}
