package July_18_2021;
/*https://practice.geeksforgeeks.org/problems/java-if-else-decision-making0924/0/?categor
y[]=Java&category[]=Java&problemStatus=unsolved&page=1&query=category[]JavaproblemStatusunsolvedpage1category[]Java#*/

class DecisionMaking {
    static String compareNM(int n,int m){
        if(n<=m){
            if(n<m)
                return ("lesser");
            else
                return ("equal");
        }

        else
            return ("greater");
    }
}