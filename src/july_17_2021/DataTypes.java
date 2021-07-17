package july_17_2021;

/*https://practice.geeksforgeeks.org/problems/data-types-java/0/?category[]=
Java&category[]=Java&problemStatus=solved&page=1&query=category[]JavaproblemStatussolvedpage1category[]Java*/
class Geeks{

    // Function to do operations with different data types
    static void dataTypes(int a, float b, double c, long l, byte d){

        double p = c/b;//c/b
        double q = b/a;//b/a
        double r = c/a;//c/a
        double m = r+l;//r+l
        int s = a/d;//a/d

        //Printing all the results
        System.out.println(p + " " + q + " " + r + " " + m + " " + s);

    }
}