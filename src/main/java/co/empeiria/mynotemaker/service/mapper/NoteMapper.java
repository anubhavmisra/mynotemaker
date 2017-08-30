package co.empeiria.mynotemaker.service.mapper;

import co.empeiria.mynotemaker.domain.*;
import co.empeiria.mynotemaker.service.dto.NoteDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Note and its DTO NoteDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface NoteMapper extends EntityMapper <NoteDTO, Note> {
    
    
    default Note fromId(Long id) {
        if (id == null) {
            return null;
        }
        Note note = new Note();
        note.setId(id);
        return note;
    }
}
