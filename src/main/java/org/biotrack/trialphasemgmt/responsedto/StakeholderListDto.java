package org.biotrack.trialphasemgmt.responsedto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StakeholderListDto {
        private Long id;
        private String firstName;
        private String lastName;
        private String email;
}
