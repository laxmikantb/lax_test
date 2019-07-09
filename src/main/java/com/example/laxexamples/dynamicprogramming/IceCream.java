package com.example.laxexamples.dynamicprogramming;
class IceCream implements Comparable{
    int cost;
    int index;

    public IceCream(int cost, int index) {
      this.cost = cost;
      this.index = index;
    }
   
    @Override
    public int compareTo(Object o) {
        IceCream i = (IceCream)o;
        if (this.cost == i.cost)
           return this.index-i.index;
        return this.cost - i.cost;
    }

    @Override
    public boolean equals(Object o){
       if (this.compareTo(o)==0)
           return true;
       return false;
    }
        
}