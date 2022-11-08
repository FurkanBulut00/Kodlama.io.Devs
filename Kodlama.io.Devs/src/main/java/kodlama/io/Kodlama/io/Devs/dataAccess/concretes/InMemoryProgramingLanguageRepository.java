package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgramingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgramingLanguage;

@Repository
public class InMemoryProgramingLanguageRepository implements ProgramingLanguageRepository {

	List<ProgramingLanguage> programingLanguages;

	public InMemoryProgramingLanguageRepository(List<ProgramingLanguage> programingLanguages) {
		super();
		this.programingLanguages = programingLanguages;
		programingLanguages.add(new ProgramingLanguage(1, "C#"));
		programingLanguages.add(new ProgramingLanguage(2, "Java"));
		programingLanguages.add(new ProgramingLanguage(3, "Python"));

	}

	@Override
	public void add(ProgramingLanguage programingLanguage) {
		programingLanguages.add(programingLanguage);
	}

	@Override
	public void update(ProgramingLanguage programingLanguage) {
		for (ProgramingLanguage language : programingLanguages) {
			if (language.getId() == programingLanguage.getId()) {
				int index = programingLanguages.indexOf(language);
				programingLanguages.set(index, programingLanguage);
			}
		}

	}

	@Override
	public void delete(int id) {

		for (ProgramingLanguage language : programingLanguages) {

			if (language.getId() == id) {
				int index = programingLanguages.indexOf(language);
				programingLanguages.remove(index);
			}
		}

	}

	@Override
	public List<ProgramingLanguage> getAll() {

		return programingLanguages;
	}

	@Override
	public ProgramingLanguage findById(int id) {
		for (ProgramingLanguage language : programingLanguages) {
			if (language.getId() == id) {
				return language;
			}
		}
		return null;
	}

}
