import java.io.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.imageio.*;
	

public class image
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				imageframe frame=new imageframe();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}

class imageframe extends JFrame
{
	public imageframe()
	{
		setTitle("SpOngE bOb");
		setSize(w,h);
		ImageComponent component=new ImageComponent();
		component.setBackground(Color.PINK);
		add(component);


	}
public static final int w=500;
public static final int h=500;
}

class ImageComponent extends JComponent
{
	public ImageComponent()
	{

		try
		{
			image=ImageIO.read(new File("sponge.gif"));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

public void paintComponent(Graphics g)
{
	if(image==null)
	{
		System.out.println("no image.. okay :P ");
	}	

	int imageWidth=image.getWidth(this);
	int imageHeight=image.getHeight(this);
	g.drawImage(image,78,78,null);

	g.drawString("hellOOoo.. this is spOnge bOb",500,500);
}
private Image image;
}



