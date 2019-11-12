package es.fbenavente.termfrequency.termfrequency.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TermFrequencyReport {
    private List<DocumentRanking> documents;
}