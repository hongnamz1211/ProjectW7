package tennisgame;

public class TennisGame {
    public static String getScore(String playerFirstName, String playerSecondName, int firstPlayerScore, int secondPlayerScore) {
        String score = "";
        int tempScore = 0;
        boolean deuceScore = firstPlayerScore == secondPlayerScore;
        if (deuceScore) {
            switch (firstPlayerScore) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else {
            boolean playerWin = firstPlayerScore >= 4 || secondPlayerScore >= 4;
            if (playerWin) {
                int minusResult = firstPlayerScore - secondPlayerScore;
                if (minusResult == 1) score = "Advantage player1";
                else if (minusResult == -1) score = "Advantage player2";
                else if (minusResult >= 2) score = "Win for player1";
                else score = "Win for player2";
            } else {
                for (int i = 1; i < 3; i++) {
                    if (i == 1) tempScore = firstPlayerScore;
                    else {
                        score += "-";
                        tempScore = secondPlayerScore;
                    }
                    switch (tempScore) {
                        case 0:
                            score += "Love";
                            break;
                        case 1:
                            score += "Fifteen";
                            break;
                        case 2:
                            score += "Thirty";
                            break;
                        case 3:
                            score += "Forty";
                            break;
                    }
                }
            }
        }
        return score;
    }
}
