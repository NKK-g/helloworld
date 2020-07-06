package com.wowowo.view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import com.wowowo.listener.FrameMouseListener;
import com.wowowo.listener.FrameMouseMotionListener;
import com.wowowo.model.Enemy001;
import com.wowowo.model.Enemy002;
import com.wowowo.model.Enemy003;
import com.wowowo.model.Enemy004;
import com.wowowo.model.Enemy005;
import com.wowowo.model.Enemy006;
import com.wowowo.model.Enemy007;
import com.wowowo.model.Enemy008;
import com.wowowo.model.Enemy009;
import com.wowowo.model.Enemy010;

public class BaseFrame extends JFrame {
	
	public static int frameWidth=512;
	
	public static int frameHeight=768;
	
	public MyPanel panel;
	
	public FrameMouseListener frameMouseListener;
	
//	public FrameMouseMotionListener frameMouseMotionListener;
	
	public void setTouchListener()
	{
		   this.frameMouseListener=new FrameMouseListener();
		   this.frameMouseListener.baseFrame=this;
		   this.addMouseListener(this.frameMouseListener);
	}
	
//	public void setMouseMotionListener()
//	{
//		   this.frameMouseMotionListener=new FrameMouseMotionListener();
//		   this.frameMouseMotionListener.baseFrame=this;
//		   this.addMouseMotionListener(this.frameMouseMotionListener);
//	}
	
	 public void addEnemyType(Class c)
	 {
		   this.panel.enemiesType.add(c);
	 }
	
	
	public BaseFrame()
	{
	 super("飞机大战");
	 Dimension screenSize=	Toolkit.getDefaultToolkit().getScreenSize();
	 setBounds(((int)screenSize.getWidth()-frameWidth)/2, 0, frameWidth, frameHeight);
	 setLayout(null);	
	 
	 this.panel=new MyPanel();
	 
	 this.panel.setBounds(0, 0, frameWidth, frameHeight);
	 
	 this.add( this.panel);	 
	 
	 //设置飞机跟随鼠标移动
	 setTouchListener();
	 
	 //setMouseMotionListener();
	 
	 //添加敌机
	 addEnemyType(Enemy001.class);
	 addEnemyType(Enemy002.class);
	 addEnemyType(Enemy003.class);
	 addEnemyType(Enemy004.class);
	 addEnemyType(Enemy005.class);
	 addEnemyType(Enemy006.class);
	 addEnemyType(Enemy007.class);
	 addEnemyType(Enemy008.class);
	 addEnemyType(Enemy009.class);
	 addEnemyType(Enemy010.class);
	 
	 
	 
	 setVisible(true);
	 
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

}
