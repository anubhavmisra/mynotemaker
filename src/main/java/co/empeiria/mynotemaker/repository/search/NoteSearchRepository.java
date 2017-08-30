package co.empeiria.mynotemaker.repository.search;

import co.empeiria.mynotemaker.domain.Note;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the Note entity.
 */
public interface NoteSearchRepository extends ElasticsearchRepository<Note, Long> {
}
