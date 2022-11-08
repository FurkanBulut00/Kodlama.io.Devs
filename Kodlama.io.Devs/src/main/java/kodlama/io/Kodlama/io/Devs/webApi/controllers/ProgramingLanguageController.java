package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgramingLanguageService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgramingLanguage;

@RestController
@RequestMapping("/api/programinglanguages")
public class ProgramingLanguageController {

	private ProgramingLanguageService programingLanguageService;

	@Autowired
	public ProgramingLanguageController(ProgramingLanguageService programingLanguageService) {
		super();
		this.programingLanguageService = programingLanguageService;
	}

	@PostMapping("/add")
	public void add(ProgramingLanguage programingLanguage) throws Exception {
		programingLanguageService.add(programingLanguage);
	}

	@PutMapping("/update")
	public void update(ProgramingLanguage programingLanguage) {
		programingLanguageService.update(programingLanguage);
	}

	@DeleteMapping("/delete")
	public void delete(int id) {
		programingLanguageService.delete(id);
	}

	@GetMapping("/getall")
	public List<ProgramingLanguage> getAll() {
		return programingLanguageService.getAll();
	}

	@GetMapping("/findbyid")
	public ProgramingLanguage findById(int id) {
		return programingLanguageService.findById(id);
	}

}
