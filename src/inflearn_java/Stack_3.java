package inflearn_java;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Stack_3 {
    public static class Main {
        public static int Solution(int[][] board, int[] moves) {
            int ans = 0;
            Stack<Integer> basket = new Stack<>();
            int tmp=0;
            for (int move : moves) {
                for (int i = 0; i < board.length; i++) {
                    // move 는 1부터 시작이므로, 인형이 있으면 뽑아서 스택에 넣어주는데 스택에 동일한 친구가 있으면 pop만 해주고 0 처리
                    if (board[i][move-1]!=0){
                        tmp = board[i][move-1];
                        board[i][move-1] =0;
                        if(basket.isEmpty()) basket.push(tmp);
                        else if (basket.peek()==tmp) {
                            basket.pop();
                            ans+=2;
                        }
                        else basket.push(tmp);
                        break;
                    }
                }
            }

            return ans;
        }

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[][] board = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    board[i][j] = in.nextInt();
                }
            }
            int moveCnt = in.nextInt();
            int[] moves = new int[moveCnt];
            for (int i = 0; i < moveCnt; i++) {
                moves[i] = in.nextInt();
            }
            System.out.println(Solution(board, moves));
        }
    }
}
