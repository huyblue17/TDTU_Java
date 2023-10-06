public class ResizableCircle extends Circle implements Resize 
{
    public ResizableCircle()
    {
        super();
    }
    
  
    public ResizableCircle(double radius)
    {
        super(radius);
    }

    @Override
    public void resize(int percent)
    {
        radius *= (percent / 100.0);
    }
}
