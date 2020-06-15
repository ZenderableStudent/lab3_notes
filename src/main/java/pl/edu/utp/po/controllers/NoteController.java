package pl.edu.utp.po.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import pl.edu.utp.po.domain.ImportanceEnum;
import pl.edu.utp.po.domain.Note;
import pl.edu.utp.po.services.NoteService;

@Controller
public class NoteController {
	@Autowired
	private NoteService noteService;
	
	@GetMapping("/list")
	public String Get(Model model) {
		model.addAttribute("notes", noteService.listOfNotes());
		model.addAttribute("note", new Note());
		model.addAttribute("importance", ImportanceEnum.values());
		return "notes";
	}
	  @PostMapping("/list")
	  public String noteSubmit(@ModelAttribute Note note) {
		noteService.addNote(note);
	    return "redirect:/list";
	  }
}