
package com.develogment.sod.ui.first;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;


@Route(value = "second", layout = Cat1MainContainer.class)
public class Cat1ViewSecond extends VerticalLayout
{
	public Cat1ViewSecond()
	{
		super();
		this.initUI();
	}
	
	/* WARNING: Do NOT edit!<br>The content of this method is always regenerated by the UI designer. */
	// <generated-code name="initUI">
	private void initUI()
	{
		this.lblContent = new Label();
		
		this.lblContent.setText("[your tutorial items]");
		this.lblContent.getStyle().set("font-size", "5em");
		
		this.lblContent.setSizeUndefined();
		this.add(this.lblContent);
		this.setWidthFull();
		this.setHeight(null);
	} // </generated-code>
	
	// <generated-code name="variables">
	private Label lblContent;
	// </generated-code>
	
}
