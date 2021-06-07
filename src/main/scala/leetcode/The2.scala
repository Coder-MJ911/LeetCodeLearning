package leetcode

class The2 {

}

object Solution {
  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    var head: ListNode = new ListNode(0, null)
    var point = head
    var v = 0
    var t1 = l1
    var t2 = l2
    while(t1 != null && t2 != null) {
      val sum = t1.x + t2.x + v
      val temp = new ListNode(0, null)
      if(sum > 9) {
        v = 1
        temp.x = sum - 10
      } else {
        v = 0
        temp.x = sum
      }
      point.next = temp
      point = point.next
      t1 = t1.next
      t2 = t2.next
    }
    while(t1 != null) {
      val sum = t1.x + v
      val temp = new ListNode(0, null)
      if(sum > 9){
        v = 1;
        temp.x = sum - 10
      } else {
        v = 0
        temp.x = sum
      }
      point.next = temp
      point = point.next
      t1 = t1.next
    }
    while(t2 != null) {
      val sum = t2.x + v
      val temp = new ListNode(0, null)
      if(sum > 9){
        v = 1;
        temp.x = sum - 10
      } else {
        v = 0
        temp.x = sum
      }
      point.next = temp
      point = point.next
      t2 = t2.next
    }
    if(v == 1){
      point.next = new ListNode(1,null)
    }
    head.next
  }
}
//Definition for singly-linked list.
class ListNode(_x: Int = 0, _next: ListNode = null) {
  var next: ListNode = _next
  var x: Int = _x
}
