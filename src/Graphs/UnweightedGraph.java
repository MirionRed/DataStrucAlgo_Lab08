/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphs;

import java.util.List;

/**
 *
 * @author BLANK
 */
public class UnweightedGraph<V> extends AbstractGraph<V> {

    public UnweightedGraph() {
    }

    public UnweightedGraph(int[][] edges, V[] vertices) {
        super(edges, vertices);
    }

    public UnweightedGraph(List<Edge> edges, List<V> vertices) {
        super(edges, vertices);
    }

    public UnweightedGraph(List<Edge> edges, int numberOfVertices) {
        super(edges, numberOfVertices);
    }

    public UnweightedGraph(int[][] edges, int numberOfVertices) {
        super(edges, numberOfVertices);
    }
}
