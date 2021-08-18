package chess.domain.piece;

public class Queen extends Piece {

    public Queen(Team team, PiecePosition pieceposition) {
        super("Q", team, pieceposition);
    }

    @Override
    public boolean movable(PiecePosition targetPosition) {
        int originFile = super.piecePosition.getFile().getFilePosition();
        int originRank = super.piecePosition.getRank().getRankPosition();
        int targetFile = targetPosition.getFile().getFilePosition();
        int targetRank = targetPosition.getRank().getRankPosition();
        int fileGap = Math.abs(originFile - targetFile);
        int rankGap = Math.abs(originRank - targetRank);
        return (fileGap == rankGap) || (fileGap == 0 || rankGap == 0);
    }


}
