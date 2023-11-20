fun main(args: Array<String>) {

//    val nums: IntArray = intArrayOf(1, 1, 0, 1, 1, 1)
    val nums: IntArray = intArrayOf(1, 0, 1, 1, 0, 1)


    println(findMaxConsecutiveOnes(nums))

}

fun findMaxConsecutiveOnes(nums: IntArray): Int {
    var max = 0
    var currentMax = 0

    nums.forEach {

        if(it == 1){
            currentMax++
        }else{
            if(currentMax > max) {
                max = currentMax
            }
            currentMax = 0
        }

    }// end forEach

    return if(currentMax > max) currentMax else max

}