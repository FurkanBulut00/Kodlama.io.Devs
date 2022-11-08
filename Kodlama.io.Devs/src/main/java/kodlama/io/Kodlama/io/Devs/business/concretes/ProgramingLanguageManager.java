package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgramingLanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgramingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgramingLanguage;

@Service
public class ProgramingLanguageManager implements ProgramingLanguageService {

	private ProgramingLanguageRepository programingLanguageRepository;

	@Autowired
	public ProgramingLanguageManager(ProgramingLanguageRepository programingLanguageRepository) {
		super();
		this.programingLanguageRepository = programingLanguageRepository;
	}

	@Override
	public void add(ProgramingLanguage programingLanguage) throws Exception {
		List<ProgramingLanguage> programingLanguages = programingLanguageRepository.getAll();
		if (programingLanguage.getName().isEmpty()) {
			throw new Exception("Program ismi bos olamaz");
		}
		for (ProgramingLanguage language : programingLanguages) {
			System.out.println(language.getName());
			System.out.println(programingLanguage.getName());
			if (language.getName().equals(programingLanguage.getName())) {
				System.out.println("Deneme");
				throw new Exception("Program isimleri aynı olamaz");
			}
		}
		programingLanguageRepository.add(programingLanguage);
	}

	@Override
	public void update(ProgramingLanguage programingLanguage) {
		programingLanguageRepository.update(programingLanguage);

	}

	@Override
	public void delete(int id) {
		programingLanguageRepository.delete(id);

	}

	@Override
	public List<ProgramingLanguage> getAll() {

		return programingLanguageRepository.getAll();
	}

	@Override
	public ProgramingLanguage findById(int id) {
		return programingLanguageRepository.findById(id);

	}

}
