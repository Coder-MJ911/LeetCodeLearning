package leetcode

class The1 {

}
object Solution {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    var mapIndex: Map[Int, Int] = Map()
    for (index <- nums.indices) {
      if(mapIndex.contains(target - nums(index))) return Array(mapIndex(target - nums(index)), index)
      else mapIndex += (nums(index) -> index)
    }
    Array(0, 0)
  }
}
