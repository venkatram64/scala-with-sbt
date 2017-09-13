package com.venkat

/**
  * Created by Venkatram on 9/11/2017.
  */


class Message(p_id: String, p_msg: String){
  val id = p_id
  val msg = p_msg

}

object Message {
  def apply(id: String, msg: String) = new Message(id, msg)

  def unapply(m: Message): Option[(String, String)] = {
    if(m == null) None
    else Some(m.id, m.msg)
  }
}

object EmailAddress {
  def apply(uname: String, dname: String) = uname + "@" + dname

  def unapply(str: String): Option[(String,String)] = {
    val parts = str split "@"
    if(parts.length == 2) Some(parts(0), parts(1))  else None
  }
}






object MessageDemo extends App{



  val msgList = List(
    Message("venkat@gmail.com","Message text 1"),
    Message("venkat@hotmail.com","Message text 7"),
    Message("ram@gmail.com","Message text 2"),
    Message("srijan@gmail.com","Message text 3"),
    Message("chintu@gmail.com","Message text 4"),
    Message("tinku@gmail.com","Message text 5"),
    Message("aarya@gmail.com","Message text 6")

  )

  def testMsgPatter(l: List[Message]): String = {
    l match {
      case Nil => "Not found"
      case Message(EmailAddress(u1, d1), _) :: Message(EmailAddress(u2,d2),_) :: _ if(u1 == u2) => u1 + "got two successive emails"
      case h::t => testMsgPatter(t)
    }
  }
  println(testMsgPatter(msgList))

}
