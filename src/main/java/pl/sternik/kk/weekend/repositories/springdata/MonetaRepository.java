package pl.sternik.kk.weekend.repositories.springdata;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.sternik.kk.weekend.entities.Moneta;
import pl.sternik.kk.weekend.repositories.MonetyRepository;


@Repository
public interface MonetaRepository 
         extends JpaRepository<Moneta, Long>{
    public Moneta findByNumerKatalogowy(Long id);
}
