
package com.develogment.sod.ui;

import java.util.List;

import com.develogment.sod.dal.PaymentDAO;
import com.develogment.sod.domain.Payment;
import com.develogment.sod.ui.PhotoComponent.CustomerDetailsView;
import com.develogment.sod.ui.first.Cat1Main;
import com.develogment.sod.ui.second.Cat2Main;
import com.develogment.sod.ui.second.Cat2ViewSecond;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.contextmenu.SubMenu;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.ThemeList;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.server.InitialPageSettings;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.server.PageConfigurator;
import com.vaadin.flow.theme.lumo.Lumo;


@PWA(name = "Project Base for RapidClipse", shortName = "Project Base    ", iconPath = "frontend/images/dev.png", offlineResources = "images/search.png", description = "Leider sind Sie nicht mehr mit dem Internet Verbunden", offlinePath = "offline.html", themeColor = "#FFF8DC")
@HtmlImport("frontend://styles/shared-styles.html")

public class MainContainer extends VerticalLayout implements PageConfigurator, RouterLayout

{
	private final Button theme;
	
	public MainContainer()
	{
		super();
		this.initUI();
		this.theme = new Button(new Icon(VaadinIcon.PALETE));
		this.theme.addClickListener(e -> this.ThemeChange());
		this.FixMenu();
		
	}
	
	private void FixMenu()
	{

		final MenuBar menuBar = new MenuBar();
		menuBar.setOpenOnHover(true);

		final MenuItem project        = menuBar.addItem("Customer");
		final MenuItem account        = menuBar.addItem("Account");
		final SubMenu  projectSubMenu = project.getSubMenu();

		final MenuItem users =
			projectSubMenu.addItem("Customer Details", e -> this.openCustomerView());

		final MenuItem billing      = projectSubMenu.addItem("Chart");
		final SubMenu  usersSubMenu = billing.getSubMenu();
		usersSubMenu.addItem((VaadinIcon.BAR_CHART_H.create()), e -> UI.getCurrent().navigate(Cat2ViewSecond.class));

		usersSubMenu.add(new RouterLink(" " + "Customer Chart with RouterLink", Cat2ViewSecond.class));
		menuBar.setSizeUndefined();

		this.navContainerMain.add(this.btnHome, this.btnNavCat1, this.btnNavCat2, this.button, menuBar, this.theme);

	}
	
	private Object ThemeChange()
	{

		final ThemeList themeList = UI.getCurrent().getElement().getThemeList();
		if(themeList.contains(Lumo.DARK))
		{ //
			
			themeList.remove(Lumo.DARK);
		}
		else
		{
			themeList.add(Lumo.DARK);
		}
		return this.theme;

	}
	
	private Object openCustomerView()
	{
		
		final List<Payment> findAll = new PaymentDAO().findAll();
		if(findAll != null && findAll.size() > 0)
		{
			final CustomerDetailsView detailsView = new CustomerDetailsView();
			detailsView.setPayment(findAll.get(0));
			detailsView.open();
			
		}
		
		return null;
	}
	
	@Override
	public void showRouterLayoutContent(final HasElement content)
	{
		this.getElement().appendChild(content.getElement());
	}
	
	@Override
	public void configurePage(final InitialPageSettings settings)
	{
		settings.addLink("shortcut icon", "frontend/images/favicon.ico");
		settings.addFavIcon("icon", "frontend/images/favicon256.png", "256x256");
	}
	
	/**
	 * Event handler delegate method for the {@link Button} {@link #btnNavCat1}.
	 *
	 * @see ComponentEventListener#onComponentEvent(ComponentEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void btnNavCat1_onClick(final ClickEvent<Button> event)
	{
		UI.getCurrent().navigate(Cat1Main.class);
	}
	
	/**
	 * Event handler delegate method for the {@link Button} {@link #btnNavCat2}.
	 *
	 * @see ComponentEventListener#onComponentEvent(ComponentEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */

	private void theme_onClick(final ClickEvent<Button> event)
	{
		
		final ThemeList themeList = UI.getCurrent().getElement().getThemeList();
		if(themeList.contains(Lumo.DARK))
		{ //
			
			themeList.remove(Lumo.DARK);
		}
		else
		{
			themeList.add(Lumo.DARK);
		}
		
	}

	private void btnNavCat2_onClick(final ClickEvent<Button> event)
	{
		UI.getCurrent().navigate(Cat2Main.class);
	}
	
	/**
	 *
	 * <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web -->
	 * <dependency>
	 * <groupId>org.springframework.boot</groupId>
	 * <artifactId>spring-boot-starter-web</artifactId>
	 * <version>2.5.6</version>
	 * </dependency>
	 * <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-test -->
	 * <dependency>
	 * <groupId>org.springframework.boot</groupId>
	 * <artifactId>spring-boot-starter-test</artifactId>
	 * <version>2.5.6</version>
	 * <scope>test</scope>
	 * </dependency>
	 * <dependency>
	 * <groupId>org.springframework</groupId>
	 * <artifactId>spring-core</artifactId>
	 * <version>3.2.3.RELEASE</version>
	 * <scope>runtime</scope>
	 * </dependency>
	 * Event handler delegate method for the {@link Button} {@link #btnHome}.
	 *
	 * @see ComponentEventListener#onComponentEvent(ComponentEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void btnHome_onClick(final ClickEvent<Button> event)
	{
		UI.getCurrent().navigate(MainView.class);
	}
	
	/**
	 * Event handler delegate method for the {@link Button} {@link #button}.
	 *
	 * @see ComponentEventListener#onComponentEvent(ComponentEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void button_onClick(final ClickEvent<Button> event)
	{
		UI.getCurrent().navigate(PaymentGrid.class);
	}

	/* WARNING: Do NOT edit!<br>The content of this method is always regenerated by the UI designer. */
	// <generated-code name="initUI">
	private void initUI()
	{
		this.navContainerMain = new HorizontalLayout();
		this.btnHome          = new Button();
		this.btnNavCat1       = new Button();
		this.btnNavCat2       = new Button();
		this.button           = new Button();
		
		this.setSpacing(false);
		this.setPadding(false);
		this.setDefaultHorizontalComponentAlignment(FlexComponent.Alignment.STRETCH);
		this.navContainerMain.setClassName("my-header");
		this.navContainerMain.setSpacing(false);
		this.navContainerMain.setMaxWidth("null");
		this.navContainerMain.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.STRETCH);
		this.btnHome.setClassName("my-navbutton");
		this.btnHome.setIcon(VaadinIcon.HOME.create());
		this.btnNavCat1.setClassName("my-navbutton");
		this.btnNavCat1.setText("documents");
		this.btnNavCat2.setClassName("my-navbutton");
		this.btnNavCat2.setText("media");
		this.button.setClassName("my-navbutton");
		this.button.setText("Grid");
		
		this.btnHome.setSizeUndefined();
		this.btnNavCat1.setSizeUndefined();
		this.btnNavCat2.setSizeUndefined();
		this.button.setSizeUndefined();
		this.navContainerMain.add(this.btnHome, this.btnNavCat1, this.btnNavCat2, this.button);
		this.navContainerMain.setWidthFull();
		this.navContainerMain.setHeight(null);
		this.add(this.navContainerMain);
		this.setSizeFull();
		
		this.btnHome.addClickListener(this::btnHome_onClick);
		this.btnNavCat1.addClickListener(this::btnNavCat1_onClick);
		this.btnNavCat2.addClickListener(this::btnNavCat2_onClick);
		this.button.addClickListener(this::button_onClick);
	} // </generated-code>

	// <generated-code name="variables">
	private Button           btnHome, btnNavCat1, btnNavCat2, button;
	private HorizontalLayout navContainerMain;
	// </generated-code>
	
}
