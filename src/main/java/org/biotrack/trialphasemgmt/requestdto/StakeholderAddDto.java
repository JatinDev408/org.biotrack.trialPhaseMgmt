package org.biotrack.trialphasemgmt.requestdto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@Data
@AllArgsConstructor
public class StakeholderAddDto {

    @NotEmpty(message = "{participant.id.required}")
    private List<Long> participants;
    @NotEmpty(message = "{researcher.id.required}")
    private List<Long> researchers;
    @NotEmpty(message = "{complianceOffice.id.required}")
    private List<Long> compliance_officers;
}
