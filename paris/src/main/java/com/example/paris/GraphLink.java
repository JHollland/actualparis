package com.example.paris;



//taken from notes


public class GraphLink {

    public GraphNode<?> destNode;//Could also store source node if required

    public int cost; //Other link attributes could be similarly stored


    public GraphLink(GraphNode<?> destNode,int cost) {
        this.destNode=destNode;
        this.cost=cost;
    }

    public Object getDestNode() {
        return destNode;
    }

    public int getCost() {
        return cost;
    }
}