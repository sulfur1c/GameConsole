package gamingsite

/** 
 * A game developed for one or more game consoles 
 */ 
class Game(val name: String, val maker: String, val consoles: List[GameConsole]) { 
  def isSupported(console: GameConsole) = consoles contains console 
  override def toString = s"Game($name, by $maker)" 
}