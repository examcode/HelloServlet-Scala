package com.yuilsang.dic

import scala.collection.immutable.HashMap

class Dic {
  val map: HashMap[String, String] = HashMap("list"->"목록", "print"->"출력")
  def search(word: String): Option[String] = {
    val result = map.get(word);
    result
  }

}
