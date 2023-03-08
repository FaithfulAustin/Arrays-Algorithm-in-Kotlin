
import java.util.Arrays
fun main(args: Array<String>) {
    //Number 1 Answer
    var no:Array<Int> = arrayOf(1, 1)
    var no2:Array<Int> = arrayOf()

//    println( sameFirstLast(no))

    //No 2 Answer
//    println( firstLast6(no))

    //no 3 Answer
//    println(commonEnd(no,no2))

    //NO 4 Answer
//    println(sum3(no))

//No 5 Answer
//    println(rotateLeft3(no))

    //No 6 Answer

//    println(reverse3(no))

    //No 7 Answer
//    println(maxEnd3(no))

    //No 8 Answer
//    println(sum2(no))

    //No 9 Answer
//    println(middleWay(no,no2))

    //No 10 Answer
//    println(makeEnds(no))

    // No 11 Answer
//    println(has23(no))

  // no 12 Answer
//  println(no23(no))
    //No 13 Answer
//    println(makeLast(no))
    //No 14 Answer
//    println(double23(no))
//    Number 15 Answer
//    println(fix23(no))
    //No 16
    println(start1(no,no2))
}


//Number One
fun sameFirstLast(array:Array<Int>):Boolean{ return array[0]===array[array.size-1]}

//Number Two
fun firstLast6(array: Array<Int>):Boolean{return array[0]=== 6 || array[array.size-1]===6}

//Number Three
fun commonEnd(arrayA: Array<Int> ,arrayB: Array<Int> ):Boolean{return arrayA[0]=== arrayB[0] || arrayA[arrayA.size-1]===arrayB[arrayB.size-1]}

//Number Four
fun sum3(array: Array<Int> ):String{
    var ans:String = "";
    if(array.size===3){

        ans= "${array[0]+array[1]+array[2]}"
    }else{
        ans = "Array length is greater or smaller than 3  ";
    }
    return ans;
}

//Number Five
fun rotateLeft3(array: Array<Int> ):String{
    var result:String="";
    if(array.size===3){
        result = "${array[1]},${array[2]},${array[0]}" }
    else{
        result = "Array length is greater or smaller than 3 "
    }
    return result
}

//Number Six
fun reverse3(array: Array<Int> ):String{
    var result:String="";
    if(array.size===3){
        result = "${array[2]},${array[1]},${array[0]}" }
    else{
        result = "Array length is greater or smaller than 3 "
    }
    return result
}
//Number SEVEN
fun maxEnd3(array: Array<Int> ):String{
    var result:String="";
    if(array.size===3){
        result = "${array.max().toString()}"
    } else{
        result = "Array length is greater or smaller than 3 "
    }
    return result
}
//Number Eight
fun sum2(array: Array<Int> ):Int{
    var result:Int=0;

        if(array.size >= 2){
            result= array[0]+array[1]
        }else if(array.size === 1){
            result= array[0]

        }else{
            result=0
        }

    return result
}
//Number Nine
fun middleWay(arrayA: Array<Int> , arrayB: Array<Int>):String{
    var result:String="";
    if(arrayA.size===3 && arrayB.size===3){
        result = "${arrayA[1]},${arrayB[1]}"
    } else{
        result = "Array length is greater or smaller than 3 "
    }
    return result
}

//Number Ten
//
fun makeEnds(array: Array<Int>):String{
    return "${array[0]},${array[array.size-1]}"
}

//Number 11
fun has23(array: Array<Int> ):Boolean{

   var result:Boolean = false
    if(array.size===2 ){
        result = array.contains(2) || array.contains(3)
    }
    return result
}
//Number 12

fun no23(array: Array<Int> ):Boolean{

    var result:Boolean = false
    if(array.size===2 ){
        result = !array.contains(2) && !array.contains(3)
    }
    return result
}

//Number 13

fun makeLast(array: Array<Int> ):String{


return "${"0,".repeat(array.size+array.size-1)}${array[array.size-1]}"
}

// Number 14
fun double23(array: Array<Int> ):Boolean{
    var result:Boolean = false
    if(array.size===2 ){
        if(array.contains(2) || array.contains(3)) {

            result  = array[0]===array[1]
        }
    }
    return result
}
//Number 15
fun fix23(array: Array<Int> ):String{
    var result:String="";
    if(array.size===3){

        if(array.contains(2) && array.contains(3)){

            if(!array[0].equals(3)){
                if(array[array.indexOf(3)-1]===2){
                    array[array.indexOf(3)]=0
                }
            }

        }

        result = Arrays.toString(array)

    } else{
        result = "Array length is greater or smaller than 3 "
    }
    return result
}

//Number 16
fun start1(arrayA: Array<Int> , arrayB: Array<Int>):Int {
    var result: Int = 0


    if (arrayA.contains(1) && arrayB.contains(1)) {
        result= 2
    }else if(arrayA.contains(1) && !arrayB.contains(1)){
        result=1
    }
    return result
}