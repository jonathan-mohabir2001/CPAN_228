package com.cpan252.tekkenreborn.repository.impl;

import java.util.List;
import java.util.Optional;

import com.cpan252.tekkenreborn.model.Fighter;
import com.cpan252.tekkenreborn.repository.FighterRepository;

public class JdbcFighterRepository implements FighterRepository {

  @Override
  public List<Fighter> findAll() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Optional<Fighter> findById(int id) {
    // TODO Auto-generated method stub
    return Optional.empty();
  }

  @Override
  public int save(Fighter fighter) {
    // TODO Auto-generated method stub
    return 0;
  }

}
