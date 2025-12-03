public class MisMatch_String {
    public static void main(String[] args) {
        String[] arr={"bana","apple","banaba","bananza"};
        String s="banana";
        for(String word:arr){
            if(word.length()!=s.length()){
                continue;
            }
            int count=0;
            for(int i=0;i<s.length();i++){
                if(word.charAt(i)!=s.charAt(i)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(word+" -> One Mismatch");
            }
        }
    }
}
