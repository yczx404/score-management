package org.example.repo;

import org.example.entity.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScoreDAO extends JpaRepository<Score, Integer> {

    List<Score> findByCidAndSidOrderByScore(int cid, int sid);
}
