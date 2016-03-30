package de.shinchillahh.vaadin;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

@SpringUI
public class RootUI extends UI
{
    private static final long serialVersionUID = -5508691235080555823L;

    @Override
    protected void init(VaadinRequest vaadinRequest)
    {
        MyWindow window = new MyWindow();
        UI.getCurrent().addWindow(window);
        window.focus();
    }

    private class MyWindow extends Window
    {
        private static final long serialVersionUID = 5229889812149488912L;

        public MyWindow()
        {
            setCaption("<center><b>My Dialog</b></center>");
            setCaptionAsHtml(true);

            setHeight(600, Unit.PIXELS);
            setWidth(800, Unit.PIXELS);

            VerticalLayout layoutRoot = new VerticalLayout();
            layoutRoot.setMargin(true);
            layoutRoot.setSpacing(true);

            for (int i = 0; i < 20; i++)
                layoutRoot.addComponent(new Label("Placeholder"));

            setContent(layoutRoot);

            setModal(true);

            setResizable(false);
        }

    }

}
