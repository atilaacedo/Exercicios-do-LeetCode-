package LeetCode455;



public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        int contentChildren =0;
        int index1 = 0;
        if(g.length == 0 || s.length == 0) return 0;
        int cont = 0;
        for(int i = 0; i < g.length; i++){
          cont = 0;
           for(int j = 0; j < s.length; j++){
                
                if(s[j] >= g[i]){
                    if(cont == 0) 
                        index1 = j;

                    if(s[index1] > s[j])
                        index1 = j;

                    cont++;
                }

            }

            if(cont > 0){
                s[index1] = -1;
                contentChildren++;
            }

            

        }
        return contentChildren;

    }



    public static void main(String[] args) {
        AssignCookies aC = new AssignCookies();

        int[] a1 = {1,2};
        int[] a2 = {1,2,3};
        System.out.println(aC.findContentChildren(a1, a2));
    }
}
