package GFG;

import java.util.ArrayList;
import java.util.Arrays;


public class WordBoggle {
    public static void main(String[] args) {
        WordBoggle word=new WordBoggle();
        char[][] board=new char[][]{{'f','f'},{'d','e'},{'f','b'},{'b','e'}};
        String[] dictionary=new String[]{"dfd", "ded", "fd", "e", "dec", "df"};
        String answer[]=word.wordBoggle(board,dictionary);
        for(int i=0;i<answer.length;i++){
            System.out.println(answer[i]);
        }
    }

    private String[] wordBoggle(char[][] board, String[] dictionary) {
        int r=board.length;
        int c=board[0].length;
        ArrayList<String> ans=new ArrayList<>();
        boolean[][] visited=new boolean[r][c];
        for(int d=0;d<dictionary.length;d++){
            loop:
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if(board[i][j]==dictionary[d].charAt(0)){

                        if(present(board,dictionary[d],i,j,visited,"",0)){
                            ans.add(dictionary[d]);
                            break loop;
                        }
                    }
                }
            }
        }
        String[] a=new String[ans.size()];
        for(int i=0;i<ans.size();i++){
            a[i]=ans.get(i);
        }
        Arrays.sort(a);
        return a;
    }
    public static boolean present(char[][]board,String str,int i,int j,boolean[][] visited,String psf,int index){
        if(psf.equals(str)){
            return true;
        }
        if(i<0 || j<0 || i>=board.length || j>=board[0].length ||
                visited[i][j]  ||index >=str.length()|| board[i][j]!=str.charAt(index)){
            return false;
        }
        visited[i][j]=true;

        boolean ans1=present(board,str,i-1,j,visited,psf+board[i][j],index+1);
        boolean ans2=present(board,str,i-1,j+1,visited,psf+board[i][j],index+1);
        boolean ans3=present(board,str,i,j+1,visited,psf+board[i][j],index+1);
        boolean ans4=present(board,str,i+1,j+1,visited,psf+board[i][j],index+1);
        boolean ans5=present(board,str,i+1,j,visited,psf+board[i][j],index+1);
        boolean ans6=present(board,str,i+1,j-1,visited,psf+board[i][j],index+1);
        boolean ans7=present(board,str,i,j-1,visited,psf+board[i][j],index+1);
        boolean ans8=present(board,str,i-1,j-1,visited,psf+board[i][j],index+1);
        visited[i][j]=false;
        return ans1||ans2||ans3||ans4||ans5||ans6||ans7||ans8;
    }
}
