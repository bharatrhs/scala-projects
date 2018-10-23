object Main extends App{
 
def findMaxWords(input:String):Int={
 val result = input.split("[.?]+").map(_.trim)
                   .map(_.split(" "))
                   .map(_.length).toList
                   .max
 
 return result
}
 print(findMaxWords("hey there. how are you? hope you are enjoying this content"))
}