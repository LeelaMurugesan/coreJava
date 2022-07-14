package com.chainsys.collectionreferencework;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();//sort in ascending order
		for(int i=10;i>0;i--) {
			queue.add(i);
		}
			System.out.println("Queue size:"+queue.size());
			System.out.println(queue.peek());
			System.out.println("Head of Queue:"+queue.peek());
			queue.poll();//remove the head
			System.out.println(queue.poll());
			System.out.println("Queue size after change:"+queue.size());
		}
	}

