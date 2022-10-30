package Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageRepository {
	List<Language> getAll();

	public Language add(Language language);

	public void update(Language language, int id);

	public void delete(int id);

	public Language getById(int id);

}
