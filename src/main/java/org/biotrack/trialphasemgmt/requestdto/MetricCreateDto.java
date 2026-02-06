package org.biotrack.trialphasemgmt.requestdto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@Data
@AllArgsConstructor
public class MetricCreateDto {

    @NotEmpty(message = "{metrics.array.required}")
    private List<MetricDto> metrics;

    @Data
    @AllArgsConstructor
    public static class MetricDto{

        @NotBlank(message= "{metric.name.required}")
        private String metricName;

        @NotBlank(message = "{metric.unit.required}")
        private String unit;
    }
}
