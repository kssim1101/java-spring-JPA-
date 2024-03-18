package sim.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sim.backend.domain.Address;
import sim.backend.domain.Board;

import java.util.List;

public interface SpringDataJpaOracleBoardRepository  extends JpaRepository<Board, Integer> {

    Board findBySeq(int seq);//xxxContaining()은 like연산자의 역할

}
