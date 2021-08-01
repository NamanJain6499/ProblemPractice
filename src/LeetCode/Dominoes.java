package LeetCode;

public class Dominoes {
    public static void main(String[] args) {
        Dominoes dominoes=new Dominoes();
        String A="RR.L";
        String answer=dominoes.solve(A);
        System.out.println(answer);
    }

    private String solve(String dominoes) {
        int n=dominoes.length();
        StringBuilder sb=new StringBuilder(dominoes);
        int start=0;
        for(int i=0;i<n;i++){
            if(dominoes.charAt(i)=='.'){
                continue;
            }else if(dominoes.charAt(i)=='L'){
                while(start<=i){
                    sb.setCharAt(start,'L');
                    start++;
                }
            }else{
                int end=i;
                while(end<n && dominoes.charAt(end)!='L'){
                    end++;
                }
                if(end==n){
                    while(i<n){
                        sb.setCharAt(i,'R');
                        i++;
                    }
                }else if((end-i-1)%2==0){
                    int mid=(end+i)/2;
                    while(i+1<=mid){
                        sb.setCharAt(i+1,dominoes.charAt(i));
                        i++;
                    }
                    while(i+1<=end && end<n){
                        sb.setCharAt(i+1,'L');
                        i++;
                    }
                }else{
                    int mid=(end+i)/2;
                    sb.setCharAt(mid,'.');
                    while(i<mid){
                        sb.setCharAt(i,'R');
                        i++;
                    }
                    i++;
                    while(i<=end){
                        sb.setCharAt(i,'L');
                        i++;
                    }
                    i=i-1;

                }
            }
        }
        return sb.toString();
    }
}
