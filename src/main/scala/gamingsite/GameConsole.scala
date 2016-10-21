package gamingsite

import java.util.Date 
import gamingsite.MediaFormat
import gamingsite.VideoResolution
/** 
 * A console that can play games built for it with one or more video resolutions. 
 */ 
class GameConsole(val make: String, val model: String, val debut: Date, val wifiType: Option[String], 
                  val mediaFormats: List[MediaFormat], val maxVideoResolution: VideoResolution) { 
  override def toString = s"GameConsole($make, $model), max video resolution = ${maxVideoResolution.getClass.getName}" 
}