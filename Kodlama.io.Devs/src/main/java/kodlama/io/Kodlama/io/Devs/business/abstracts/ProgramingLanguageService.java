package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgramingLanguage;

public interface ProgramingLanguageService {

	void add(ProgramingLanguage programingLanguage) throws Exception;

	void update(ProgramingLanguage programingLanguage);

	void delete(int id);

	List<ProgramingLanguage> getAll();

	ProgramingLanguage findById(int id);
}
