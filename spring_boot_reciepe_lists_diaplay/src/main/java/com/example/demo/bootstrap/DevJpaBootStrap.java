package com.example.demo.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.model.Notes;
import com.example.demo.model.Reciepe;
import com.example.demo.model.Ingredients;
import com.example.demo.repository.NotesRepository;
import com.example.demo.repository.ReciepeRepository;
import com.example.demo.repository.IngredientRepository;

@Component
public class DevJpaBootStrap implements ApplicationListener<ContextRefreshedEvent> {

@Autowired
public DevJpaBootStrap(NotesRepository notesRepository, ReciepeRepository reciepeRepository,
			IngredientRepository ingredientRepository) {
		super();
		this.notesRepository = notesRepository;
		this.reciepeRepository = reciepeRepository;
		this.ingredientRepository = ingredientRepository;
	}

public DevJpaBootStrap() {
		super();
		// TODO Auto-generated constructor stub
	}

private NotesRepository notesRepository ;
private ReciepeRepository reciepeRepository;
private IngredientRepository ingredientRepository;
	

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		
		Notes notes=new Notes("great notes");
	       
		Reciepe reciepe=new Reciepe("chickenFry","1 hour","moderate","a siple heavy and tasty food","boiled the chicken and add all the ingreinds mix it well and cok it untill it get dired thats it get ready ","cooking.com","10mins");
		 Ingredients id=new Ingredients("200","chicken,chilly,oil,salt,masala");
		
        
        
        
        reciepeRepository.save(reciepe);
        notesRepository.save(notes);
        ingredientRepository.save(id);
	
	}

}