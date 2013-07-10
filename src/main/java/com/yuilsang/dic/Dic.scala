package com.yuilsang.dic

import scala.collection.immutable.HashMap

/**
 * Created with IntelliJ IDEA.
 * User: ilzzang
 * Date: 13. 7. 11.
 * Time: 오전 2:12
 * To change this template use File | Settings | File Templates.
 */
class Dic {
  val map: HashMap[String, String] = HashMap("list"->"목록", "print"->"출력")
  def search(word: String): String = {
    val result = map.get(word).get;
    println(result);
    result
  }

}
