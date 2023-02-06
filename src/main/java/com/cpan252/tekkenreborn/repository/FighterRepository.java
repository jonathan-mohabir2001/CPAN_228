/*
 * Lab 03 Commits Fighter Repository Interface with empty methods for the JDBC implementation
 * 
 */

package com.cpan252.tekkenreborn.repository;
import java.util.List;
import java.util.Optional;
import com.cpan252.tekkenreborn.model.Fighter;

public interface FighterRepository {
  List<Fighter> findAll();
  Optional<Fighter> findById(int id);
  int save(Fighter fighter);
}
