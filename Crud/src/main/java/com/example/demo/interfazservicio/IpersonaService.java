package com.example.demo.interfazservicio;
import com.example.demo.modelo.Persona;
import java.util.Optional;
import java.util.List;
public interface IpersonaService {
	public List<Persona>listar();
	public Optional<Persona>listarId(int id);
	public int save(Persona p);
	public void delete(int id);

}
