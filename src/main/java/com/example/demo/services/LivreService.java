package com.example.demo.services;

import com.example.demo.entities.Livre;
import com.example.demo.repository.LivreRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.OrderBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@RequiredArgsConstructor
@Service
public class LivreService
{
    @Autowired
    private LivreRepository livreRepository;


    @OrderBy(clause = "titre ASC")
    public List<Livre> listLivre()
    {
        return livreRepository.findAll();
    }

    public Livre retournerLivre(Integer id)
    {
        return livreRepository.findById(id).get();
    }

    public Livre ajouterLivre(Livre livre)
    {
         return livreRepository.save(livre);
    }

    public Livre modifierLivre(Livre livre)
    {
        return livreRepository.save(livre);
    }
    
    public void supprimerLivre(Integer id)
    {
        livreRepository.deleteById(id);
    }

/*    public void supprimerLivre2(Livre livre)
    {
         livreRepository.delete(livre);
    }
*/
}
