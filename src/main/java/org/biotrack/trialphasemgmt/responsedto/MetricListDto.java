package org.biotrack.trialphasemgmt.responsedto;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class MetricListDto {
        private Long id;
        private Long trialId;
        private String metricName;
        private String unit;
}
