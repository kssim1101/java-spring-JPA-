package sim.backend.service;


import sim.backend.domain.Board;

import java.util.ArrayList;
import java.util.List;

public interface BoardService {

    List<Board> listS();

    Board insertS(Board board);

    Board contentS(int seq);

    Board updateS(int seq);

    Boolean updateSup(Board board);

    boolean deleteS(int seq);
}
