package ufv.dis.final2022.OMB;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(
        fieldVisibility = JsonAutoDetect.Visibility.ANY,
        getterVisibility = JsonAutoDetect.Visibility.NONE,
        setterVisibility = JsonAutoDetect.Visibility.NONE
)
public class Character {
    @JsonProperty("firstName")
    private String name;
    @JsonProperty("firstName")
    private String height;
    @JsonProperty("firstName")
    private String mass;
    @JsonProperty("firstName")
    private String hair_color;
    @JsonProperty("firstName")
    private String skin_color;
    @JsonProperty("firstName")
    private String eye_color;
    @JsonProperty("firstName")
    private String birth_year;
    @JsonProperty("firstName")
    private String gender;
    @JsonProperty("firstName")
    private films;
}
