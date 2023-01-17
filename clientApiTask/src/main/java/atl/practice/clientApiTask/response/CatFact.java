package atl.practice.clientApiTask.response;

import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class CatFact implements Serializable {

    private String fact;
    private int length;
}
