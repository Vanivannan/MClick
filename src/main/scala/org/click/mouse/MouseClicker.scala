package org.click.mouse

import java.awt.Robot
import java.awt.event.InputEvent
import java.text.SimpleDateFormat
import java.time.LocalDate

object MouseClicker {
  def main(args: Array[String]): Unit = {
    val robot = new Robot()
    val sleepTime = 9 //设置的鼠标自动点击间隔

    System.out.println("*************************" + LocalDate.now() + "*************************")
    System.out.println(s"设置的鼠标点击间隔时间为${sleepTime}分钟，鼠标点击的时间为: ")


    while (true) {
      val mask = InputEvent.BUTTON1_DOWN_MASK
      robot.mousePress(mask)
      robot.mouseRelease(mask)
      System.out.println(new SimpleDateFormat("HH:mm:ss").format(System.currentTimeMillis()))
      Thread.sleep(sleepTime * 60 * 1000)
    }

    //        val stopTime: String = "00:15" //设置的鼠标自动点击停止时间
    //        new SimpleDateFormat("HH:mm").format(System.currentTimeMillis())!=stopTime
    //    while (new SimpleDateFormat("HH:mm").format(System.currentTimeMillis())!=stopTime){
    //      val mask = InputEvent.BUTTON1_DOWN_MASK
    //      robot.mousePress(mask)
    //      robot.mouseRelease(mask)
    //      System.out.println(new SimpleDateFormat("HH:mm:ss").format(System.currentTimeMillis()))
    //      Thread.sleep(sleepTime * 60 * 1000)
    //    }
  }
}
