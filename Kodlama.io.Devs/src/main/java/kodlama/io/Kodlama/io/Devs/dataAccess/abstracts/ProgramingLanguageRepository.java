package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgramingLanguage;

public interface ProgramingLanguageRepository {

	// CRUD

	void add(ProgramingLanguage programingLanguage);

	void update(ProgramingLanguage programingLanguage);

	void delete(int id);

	// Listelemek ve id ile getirmek.

	List<ProgramingLanguage> getAll();

	ProgramingLanguage findById(int id);

}
