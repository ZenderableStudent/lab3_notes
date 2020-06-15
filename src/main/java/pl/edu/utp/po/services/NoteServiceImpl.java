package pl.edu.utp.po.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.edu.utp.po.domain.Note;
import pl.edu.utp.po.repositories.NoteRepository;

@Service
public class NoteServiceImpl implements NoteService {
	private NoteRepository noteRepository;
	
	@Autowired
	public NoteServiceImpl(NoteRepository noteRepository) {
		this.noteRepository = noteRepository;
	}

	@Override
	public List<Note> listOfNotes() {	
		return noteRepository.findByOrderByTimestampDesc();
	}

	@Override
	public void addNote(Note n) {
		noteRepository.save(n);
	}

}