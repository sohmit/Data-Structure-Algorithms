

import java.util.*;
import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class GraphTraversal {

    void DFS(int startVertex, LinkedList<Integer> adjacencyList[])
    {
        int visited[] = new int[20];
        for(int i=1 ;i<16 ;i++)
            visited[i] =-1;
        for(int i=1 ;i<16 ;i++)
        {   if(visited[i] == -1)
        {       
                DFSVISIT(i,visited,adjacencyList);
                
        }
        }
    }
    
    void DFSVISIT(int u, int visited[], LinkedList<Integer> adjacencyList[])
    {
        visited[u] = 0;
        System.out.println(u + " ");
        
        Iterator<Integer> i = adjacencyList[u].listIterator();
        
        //for(int k=1 ;k<11 ;k++)
        //    System.out.println(visited[k]);
       
        while (i.hasNext())
        {
            int k = i.next();
            if (visited[k] == -1)
            {    //System.out.println("i.next = " + n);
                DFSVISIT(k, visited,adjacencyList);
            }
        }
        visited[u] = 1;
        
    }
    
    void BFS(int startVertex, LinkedList<Integer> adjacencyList[])
    {
        int visited[] = new int[20];
        for(int i=1;i<16;i++)
            visited[i]=-1;
        visited[startVertex] = 0;
        
        Queue<Integer> q = new LinkedList<>();
        q.add(startVertex);
        int u;
        while(!q.isEmpty())
        { 
            u = q.remove();
        
            System.out.print(u+" ");
 
            Iterator<Integer> i = adjacencyList[u].listIterator();
            while (i.hasNext())
            {
                int k = i.next();
                if (visited[k]==-1)
                {
                    visited[k] = 0;
                    q.add(k);
                }
            }
            visited[u]=1;
        }
        
        
    }
    
    
    
    public static void main(String[] args) 
    {   
        int v=16;
        LinkedList<Integer> adjacencyList[] = new LinkedList[v];
        
        for(int i =1; i<16; i++)
                adjacencyList[i]= new LinkedList<>();
        
        adjacencyList[1].add(2);
        adjacencyList[1].add(3);
        adjacencyList[2].add(1);
        adjacencyList[3].add(1);
        adjacencyList[3].add(4);
        adjacencyList[3].add(6);
        adjacencyList[3].add(7);
        adjacencyList[4].add(3);
        adjacencyList[4].add(5);
        adjacencyList[4].add(6);
        adjacencyList[4].add(10);
        adjacencyList[5].add(4);
        adjacencyList[5].add(6);
        adjacencyList[5].add(8);
        adjacencyList[6].add(3);
        adjacencyList[6].add(4);
        adjacencyList[6].add(5);
        adjacencyList[6].add(7);
        adjacencyList[7].add(3);
        adjacencyList[7].add(6);
        adjacencyList[7].add(8);
        adjacencyList[7].add(9);
        adjacencyList[8].add(5);
        adjacencyList[8].add(7);
        adjacencyList[8].add(10);
        adjacencyList[9].add(7);
        adjacencyList[10].add(4);
        adjacencyList[10].add(8);
        adjacencyList[10].add(11);
        adjacencyList[11].add(10);
        adjacencyList[11].add(12);
        adjacencyList[11].add(13);
        adjacencyList[12].add(11);
        adjacencyList[12].add(13);
        adjacencyList[13].add(11);
        adjacencyList[13].add(12);
        adjacencyList[13].add(14);
        adjacencyList[14].add(13);
        adjacencyList[14].add(15);
        adjacencyList[15].add(14);
        
        for(int i =1; i<16;i++)
        {
            System.out.println(i+"->"+adjacencyList[i]);
        }
       
        GraphTraversal gt = new GraphTraversal();
        System.out.println("DFS Traversal : ");
        gt.DFS(1, adjacencyList);
        System.out.println("BFS Traversal : ");
        gt.BFS(1, adjacencyList);
    }
    
}
