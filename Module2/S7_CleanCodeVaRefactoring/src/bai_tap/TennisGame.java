package bai_tap;

public class TennisGame {

    public static final String DRAW_SCORE_BY_0 = "Love-All";
    public static final String DRAW_SCORE_BY_1 = "Fifteen-All";
    public static final String DRAW_SCORE_BY_2 = "Thirty-All";
    public static final String DRAW_SCORE_BY_3 = "Forty-All";
    public static final String DRAW_SCORE_BY_4 = "Deuce";
    public static final String ADVANTAGE_FOR_PLAYER_1 = "Advantage player1";
    public static final String ADVANTAGE_FOR_PLAYER_2 = "Advantage player2";
    public static final String WIN_FOR_PLAYER_1 = "Win for player1";
    public static final String WIN_FOR_PLAYER_2 = "Win for player2";
    public static final String DASH = "-";
    public static final String SCORE_BY_0 = "Love";
    public static final String SCORE_BY_1 = "Fifteen";
    public static final String SCORE_BY_2 = "Thirty";
    public static final String SCORE_BY_3 = "Forty";
    public static final int NUMBER_OF_PLAYERS = 2;
    public static final int ONE_POINT = 1;
    public static final int TWO_POINT = 2;

    public static String getScore(String nameOfPlayer1, String nameOfPlayer2, int scoreOfPlayer1, int scoreOfPlayer2) {
        String result = "";

        if (isDrawScore(scoreOfPlayer1, scoreOfPlayer2)) {
            result = getDrawResult(scoreOfPlayer1);
        } else if (isBeyondDeuceScore(scoreOfPlayer1, scoreOfPlayer2)) {
            result = getBeyondDeuceScore(scoreOfPlayer1, scoreOfPlayer2);
        } else {
            result = getCurrentScore(scoreOfPlayer1, scoreOfPlayer2);
        }
        return result;
    }

    private static boolean isDrawScore(int scoreOfPlayer1, int scoreOfPlayer2) {
        return scoreOfPlayer1 == scoreOfPlayer2;
    }

    private static String getDrawResult(int drawScore) {
        String result;
        switch (drawScore) {
            case 0:
                result = DRAW_SCORE_BY_0;
                break;
            case 1:
                result = DRAW_SCORE_BY_1;
                break;
            case 2:
                result = DRAW_SCORE_BY_2;
                break;
            case 3:
                result = DRAW_SCORE_BY_3;
                break;
            default:
                result = DRAW_SCORE_BY_4;
                break;

        }
        return result;
    }

    private static boolean isBeyondDeuceScore(int scoreOfPlayer1, int scoreOfPlayer2) {
        return scoreOfPlayer1 >= 4 || scoreOfPlayer2 >= 4;
    }

    private static String getBeyondDeuceScore(int scoreOfPlayer1, int scoreOfPlayer2) {
        String result = "";
        int gap = scoreOfPlayer1 - scoreOfPlayer2;
        if (gap == ONE_POINT) result = ADVANTAGE_FOR_PLAYER_1;
        else if (gap == -ONE_POINT) result = ADVANTAGE_FOR_PLAYER_2;
        else if (gap >= TWO_POINT) result = WIN_FOR_PLAYER_1;
        else result = WIN_FOR_PLAYER_2;
        return result;
    }

    private static String getCurrentScore(int scoreOfPlayer1, int scoreOfPlayer2) {
        String result = "";
        int tempScore = 0;
        for (int i = 1; i <= NUMBER_OF_PLAYERS; i++) {
            if (i == 1) tempScore = scoreOfPlayer1;
            else {
                result += DASH;
                tempScore = scoreOfPlayer2;
            }
            switch (tempScore) {
                case 0:
                    result += SCORE_BY_0;
                    break;
                case 1:
                    result += SCORE_BY_1;
                    break;
                case 2:
                    result += SCORE_BY_2;
                    break;
                case 3:
                    result += SCORE_BY_3;
                    break;
            }
        }
        return result;
    }
}