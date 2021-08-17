package chess.domain.plate;

import chess.domain.RankComparator;
import chess.domain.piece.*;
import chess.domain.team.Camp;
import lombok.Getter;

import java.util.*;

@Getter
public class ChessPlate {
    private static final String BLANK =".";
    private Map<PiecePosition, Piece> plate = new HashMap<>();
    private List<Piece> allPieces = new LinkedList<>();

    public ChessPlate() {
        Camp black = new Camp(Team.BLACK);
        Camp white = new Camp(Team.WHITE);
        allPieces.addAll(black.getPieces());
        allPieces.addAll(white.getPieces());
        arrangePieces();
    }

    public Map<PiecePosition, Piece> arrangePieces() {
        RankComparator rankComparator = new RankComparator();

        for (Rank rank: Rank.values()) {
            for (File file : File.values()) {
//              plate.put(new PiecePosition(file, rank), new Piece(".",Team.BLACK, new PiecePosition(file,rank)));
              plate.put(new PiecePosition(file, rank), null);
            }
        }
        allPieces.forEach(piece -> {
            plate.put(piece.getPiecePosition(), piece);
        });

        return plate;
    }
    public void move(PiecePosition sposition, PiecePosition targPiecePosition){
        //TO-DO 기물별 허용 움직임 범위인지 체크
        // 가려는 곳이 상대편 말이거나, 비어있는지 체크

    }
}
