package Editor;

public class Editor
{
    private static  Editor obj = null;

    private Editor() {}  /**making the default constructor private*/

    public static Editor getInstance()
    {
        if (obj == null)
        {
            /** To make sure that no more than a single  thread can
             * instantiate the
             * object
             */
            synchronized (Editor.class)
            {

                if (obj==null)
                    obj = new Editor();
            }
        }
        return obj;
    }
}

