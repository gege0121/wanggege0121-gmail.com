
//Merge Two Sorted Lists

import java.util.LinkedList;

public class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            //l1, l2 belong to the start of two list
            if (l1 == null && l2 == null) {
                return null;
            }
            if (l1 == null) {
                return l2;
            }
            if (l2 == null) {
                return l1;
            }

            ListNode result = new ListNode(0);

            ListNode prev = result;

            while (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    prev.next = l1;
                    //prev always stand on the smallest point.
                    l1 = l1.next;
                } else {
                    prev.next = l2;
                    l2 = l2.next;
                }
                prev = prev.next;
            }
            if (l1 != null) {
                prev.next = l1;
            }
            if (l2 != null) {
                prev.next = l2;
            }
            return result.next;
        }

        public static void main(String[] args){

        }
    }