public class RecursionWithStrings{
    public static String replaceChar(String s,char a,char b){
        if(s.length()==0){
            return s;
        }
        String smallOutput=replaceChar(s.substring(1),a,b);
        if(s.charAt(0)==a){
            return b+smallOutput;
        }else{
            return s.charAt(0)+smallOutput;
        }
    }
    public static void main(String[] args){
        System.out.println(replaceChar("abcxdxex",'x','y'));
    }
}
       String so = replaceCharacter(input.substring(1), c1, c2);
        if(input.charAt(0)==c1){
            return c2+so;
        }
        else{
            return input.charAt(0)+so;
        }

	}
    public static void main(String[] args){
        System.out.println(replaceCharacter(input, c1, c2));
    }
}
