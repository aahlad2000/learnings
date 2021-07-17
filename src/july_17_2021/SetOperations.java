package july_17_2021;
  /*https://practice.geeksforgeeks.org/problems/java-collection-set-2
  -set/0/?category[]=Java&category[]=Java&problemStatus=solved&page=1&query=category[]JavaproblemStatussolvedpage1category[]Java*/
class GfG
{
    /*inserts an element x to the set s */
    void insert(Set<Integer> s, int x)
    {
        s.add(x);
    }

    /*prints the contents of the set s in ascending order */
    void print_contents(Set<Integer> s)
    {
        TreeSet<Integer> sorted = new TreeSet<Integer>(s);
        Iterator  it = sorted.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }

    /*erases an element x from the set s */
    void erase(Set<Integer> s, int x)
    {
        s.remove(x);
    }

    /*returns the size of the set s */
    int size(Set<Integer> s)
    {
        return s.size();
    }

    /*returns 1 if the element x is
    present in set s else returns -1 */
    int find(Set<Integer> s, int x)
    {
        if(s.contains(x)){
            return 1;
        }

        else
            return -1;
    }
}
