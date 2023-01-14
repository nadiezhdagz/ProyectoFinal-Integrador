
 
package com.portfolio.ngz.Interface;

import com.portfolio.ngz.Entity.Persona;
import java.util.List;


public interface IPersonaInterface {
     public List<Persona> getPersona();
     
     public void savaPersona(Persona persona);
     
     public void deletePersona(Long id);
     
     public Persona findPersona(Long id);
}
