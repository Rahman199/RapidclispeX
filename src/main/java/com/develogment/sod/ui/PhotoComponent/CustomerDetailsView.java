
package com.develogment.sod.ui.PhotoComponent;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import com.develogment.sod.dal.AddressDAO;
import com.develogment.sod.dal.CustomerDAO;
import com.develogment.sod.domain.Address;
import com.develogment.sod.domain.Customer;
import com.develogment.sod.domain.Payment;
import com.rapidclipse.framework.server.data.converter.ConverterBuilder;
import com.rapidclipse.framework.server.resources.CaptionUtils;
import com.rapidclipse.framework.server.ui.ItemLabelGeneratorFactory;
import com.rapidclipse.framework.server.ui.StartsWithIgnoreCaseItemFilter;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.FormItem;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.Push;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.tabs.Tabs.SelectedChangeEvent;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.data.provider.DataProvider;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.InputStreamFactory;
import com.vaadin.flow.server.StreamResource;


@Push
@Route("CustomerDetailsView")
public class CustomerDetailsView extends Dialog
{

	private Payment  payment;
	private Runnable listener;
	File             file;

	/**
	 *
	 */

	public CustomerDetailsView()
	{
		super();
		this.initUI();
		
	}

	public CustomerDetailsView setPayment(final Payment payment)
	{

		this.payment = payment;

		this.binder.setBean(payment.getCustomer());
		
		return this;
		
	}
	
	public CustomerDetailsView setSavedCallback(final Runnable listener)
	{
		
		this.listener = listener;
		return this;
		
	}

	private Image convertImage(final byte[] imageData)

	{
		
		final StreamResource streamResource = new StreamResource("", new InputStreamFactory()
		{
			@Override
			public InputStream createInputStream()
			{
				if(imageData != null)
				{
					return new ByteArrayInputStream(imageData);
				}
				else
				{
					return null;
				}
			}
		});
		return new Image(streamResource, " ");
	}

	/**
	 * Event handler delegate method for the {@link Tabs} {@link #tabs}.
	 *
	 * @see ComponentEventListener#onComponentEvent(ComponentEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */

	private void tabs_onSelectedChange(final SelectedChangeEvent event)
	{

		final Label        label   = new Label();
		final Notification notif   = new Notification("saved successfully");
		final byte[]       picture = this.payment.getCustomer().getPicture();
		
		final Image            convertImage      = this.convertImage(picture);
		final HorizontalLayout horizontalLayout2 = new HorizontalLayout();
		final Button           downloadButton    = new Button("Download Photo");
		downloadButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
		downloadButton.addThemeVariants(ButtonVariant.LUMO_SUCCESS);
		downloadButton.setSizeUndefined();
		downloadButton.setAutofocus(true);
		
		this.verticalLayout.removeAll();
		convertImage.getStyle().set("borderRadius", "70%");
		convertImage.setWidth("200px");
		convertImage.setHeight("200px");
		label.add("Hi!" + " " + this.payment.getCustomer().getFirstName() + " "
			+ this.payment.getCustomer().getLastName());

		final String selection = event.getSelectedTab().getLabel();
		this.verticalLayout.add(this.tabs);
		this.verticalLayout.setSpacing(true);

		if(selection.contentEquals("Customer Details"))

		{
			
			this.verticalLayout.setVisible(true);
			this.verticalLayout.add(this.tabs);
			this.verticalLayout.add(this.form);

		}
		
		else if(selection.contentEquals("Image Customer"))
		{

			final StreamResource streamResource =
				new StreamResource("fileName.extName", () -> new ByteArrayInputStream(picture));

			downloadButton.addClickListener(e -> {

				if(picture != null)
				{
					
					streamResource.setCacheTime(5);
					
					try
					{
						
						// Process char

						final FileOutputStream fos =
							new FileOutputStream(
								"C:\\Users\\Alharash\\Desktop\\image.jpg");

						{
							fos.write(picture);
						}
						fos.close();

						notif.open();
						notif.setPosition(com.vaadin.flow.component.notification.Notification.Position.BOTTOM_END);
						notif.setDuration(8);

					}
					catch(final IOException eve)
					{
						// TODO Auto-generated catch block
						eve.printStackTrace();
					}
					
				}
			});
			
			horizontalLayout2.add(convertImage);
			horizontalLayout2.setAlignItems(Alignment.START);
			horizontalLayout2.setJustifyContentMode((FlexComponent.JustifyContentMode.CENTER));
			this.verticalLayout.add(horizontalLayout2);
			this.verticalLayout.add("Hallo" + " " + this.payment.getCustomer().getFirstName() + " "
				+ this.payment.getCustomer().getLastName());
			this.verticalLayout.add(downloadButton);
			this.verticalLayout.setPadding(true);
			this.verticalLayout.setAlignItems(Alignment.CENTER);
			downloadButton.getElement().getStyle().set("margin-bottom", "auto");
			this.verticalLayout.setSizeUndefined();

		}

		else if(selection.contentEquals("Drei"))
		
		{
			this.verticalLayout.setVisible(true);
			this.form.setVisible(true);

		}

	}
	
	/**
	 * Event handler delegate method for the {@link Button} {@link #button}.
	 *
	 * @see ComponentEventListener#onComponentEvent(ComponentEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	
	private void button_onClick(final ClickEvent<Button> event)
	{
		final Notification myNotification = new Notification();
		myNotification.setDuration(2000); // Zeige die Notification für 2 Sekunden
		myNotification.setText("Die Informationen wurden gespeichert "); // Setze den Text auf "!"
		myNotification.setPosition(Position.BOTTOM_CENTER); // Die Notification soll von unten in der Mitte erscheinen
		myNotification.addThemeVariants(NotificationVariant.LUMO_SUCCESS); // Die Notification soll eine SUCCESS
																			// Nachricht sein
		
		// Zeige die Notification an
		final Customer customer = this.payment.getCustomer();
		this.binder.setBean(this.payment.getCustomer());
		if(this.payment != null && this.payment.getCustomer() != null)
		{
			this.binder.setBean(this.payment.getCustomer());
			new CustomerDAO().save(customer);
			this.close();
			this.listener.run();
			myNotification.open();
		}
		
	}
	
	/**
	 * Event handler delegate method for the {@link Button} {@link #button2}.
	 *
	 * @see ComponentEventListener#onComponentEvent(ComponentEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void button2_onClick(final ClickEvent<Button> event)
	{
		this.binder.removeBean();
	}

	/* WARNING: Do NOT edit!<br>The content of this method is always regenerated by the UI designer. */
	// <generated-code name="initUI">
	private void initUI()
	{
		this.verticalLayout   = new VerticalLayout();
		this.tabs             = new Tabs();
		this.tab              = new Tab();
		this.tab2             = new Tab();
		this.form             = new FormLayout();
		this.formItem2        = new FormItem();
		this.lblActive        = new Label();
		this.chkActive        = new Checkbox();
		this.formItem3        = new FormItem();
		this.lblFirstName     = new Label();
		this.txtFirstName     = new TextField();
		this.formItem4        = new FormItem();
		this.lblLastName      = new Label();
		this.txtLastName      = new TextField();
		this.formItem         = new FormItem();
		this.lblCustomerId    = new Label();
		this.nrCustomerId     = new NumberField();
		this.formItem5        = new FormItem();
		this.lblEmail         = new Label();
		this.txtEmail         = new TextField();
		this.formItem6        = new FormItem();
		this.lblAddress       = new Label();
		this.cmbAddress       = new ComboBox<>();
		this.formItem7        = new FormItem();
		this.lblLastUpdate    = new Label();
		this.dateLastUpdate   = new DatePicker();
		this.formItem8        = new FormItem();
		this.horizontalLayout = new HorizontalLayout();
		this.button           = new Button();
		this.button2          = new Button();
		this.binder           = new Binder<>();
		
		this.tab.setLabel("Customer Details");
		this.tab2.setLabel("Image Customer");
		this.form.setResponsiveSteps(
			new FormLayout.ResponsiveStep("0px", 1, FormLayout.ResponsiveStep.LabelsPosition.TOP),
			new FormLayout.ResponsiveStep("400px", 2, FormLayout.ResponsiveStep.LabelsPosition.TOP));
		this.lblActive.setText("Active");
		this.chkActive.setLabel("Checkbox");
		this.lblFirstName.setText("FirstName");
		this.lblLastName.setText("LastName");
		this.lblCustomerId.setText("CustomerId");
		this.lblEmail.setText("Email");
		this.lblAddress.setText("Address");
		this.cmbAddress.setDataProvider(StartsWithIgnoreCaseItemFilter.New(this.cmbAddress::getItemLabelGenerator),
			DataProvider.ofCollection(AddressDAO.INSTANCE.findAll()));
		this.cmbAddress.setItemLabelGenerator(ItemLabelGeneratorFactory.NonNull(CaptionUtils::resolveCaption));
		this.lblLastUpdate.setText("LastUpdate");
		this.button.setText("Speichern");
		this.button2.setText("Clear");
		
		this.binder.forField(this.nrCustomerId).withConverter(ConverterBuilder.DoubleToShort().build())
			.bind(Customer::getCustomerId, Customer::setCustomerId);
		this.binder.forField(this.chkActive).withNullRepresentation(false).bind(Customer::isActive,
			Customer::setActive);
		this.binder.forField(this.txtFirstName).withNullRepresentation("").bind(Customer::getFirstName,
			Customer::setFirstName);
		this.binder.forField(this.txtLastName).withNullRepresentation("").bind(Customer::getLastName,
			Customer::setLastName);
		this.binder.forField(this.txtEmail).withNullRepresentation("").bind(Customer::getEmail, Customer::setEmail);
		this.binder.forField(this.cmbAddress).bind(Customer::getAddress, Customer::setAddress);
		this.binder.forField(this.dateLastUpdate)
			.withConverter(ConverterBuilder.LocalDateToUtilDate().systemDefaultZoneId().build())
			.bind(Customer::getLastUpdate, Customer::setLastUpdate);
		
		this.tabs.add(this.tab, this.tab2);
		this.lblActive.setSizeUndefined();
		this.lblActive.getElement().setAttribute("slot", "label");
		this.chkActive.setWidthFull();
		this.chkActive.setHeight(null);
		this.formItem2.add(this.lblActive, this.chkActive);
		this.lblFirstName.setSizeUndefined();
		this.lblFirstName.getElement().setAttribute("slot", "label");
		this.txtFirstName.setWidthFull();
		this.txtFirstName.setHeight(null);
		this.formItem3.add(this.lblFirstName, this.txtFirstName);
		this.lblLastName.setSizeUndefined();
		this.lblLastName.getElement().setAttribute("slot", "label");
		this.txtLastName.setWidthFull();
		this.txtLastName.setHeight(null);
		this.formItem4.add(this.lblLastName, this.txtLastName);
		this.lblCustomerId.setSizeUndefined();
		this.lblCustomerId.getElement().setAttribute("slot", "label");
		this.nrCustomerId.setWidthFull();
		this.nrCustomerId.setHeight(null);
		this.formItem.add(this.lblCustomerId, this.nrCustomerId);
		this.lblEmail.setSizeUndefined();
		this.lblEmail.getElement().setAttribute("slot", "label");
		this.txtEmail.setWidthFull();
		this.txtEmail.setHeight(null);
		this.formItem5.add(this.lblEmail, this.txtEmail);
		this.lblAddress.setSizeUndefined();
		this.lblAddress.getElement().setAttribute("slot", "label");
		this.cmbAddress.setWidthFull();
		this.cmbAddress.setHeight(null);
		this.formItem6.add(this.lblAddress, this.cmbAddress);
		this.lblLastUpdate.setSizeUndefined();
		this.lblLastUpdate.getElement().setAttribute("slot", "label");
		this.dateLastUpdate.setWidthFull();
		this.dateLastUpdate.setHeight(null);
		this.formItem7.add(this.lblLastUpdate, this.dateLastUpdate);
		this.button.setSizeUndefined();
		this.button2.setSizeUndefined();
		this.horizontalLayout.add(this.button, this.button2);
		this.horizontalLayout.setWidthFull();
		this.horizontalLayout.setHeight(null);
		this.formItem8.add(this.horizontalLayout);
		this.form.add(this.formItem2, this.formItem3, this.formItem4, this.formItem, this.formItem5, this.formItem6,
			this.formItem7, this.formItem8);
		this.tabs.setWidthFull();
		this.tabs.setHeight(null);
		this.form.setWidthFull();
		this.form.setHeight(null);
		this.verticalLayout.add(this.tabs, this.form);
		this.verticalLayout.setWidth("452px");
		this.verticalLayout.setHeight("452px");
		this.add(this.verticalLayout);
		this.setWidth("500px");
		this.setHeight("500px");
		
		this.tabs.setSelectedIndex(-1);
		
		this.tabs.addSelectedChangeListener(this::tabs_onSelectedChange);
		this.button.addClickListener(this::button_onClick);
		this.button2.addClickListener(this::button2_onClick);
	} // </generated-code>

	// <generated-code name="variables">
	private Tab               tab, tab2;
	private NumberField       nrCustomerId;
	private VerticalLayout    verticalLayout;
	private HorizontalLayout  horizontalLayout;
	private Label             lblActive, lblFirstName, lblLastName, lblCustomerId, lblEmail, lblAddress, lblLastUpdate;
	private Tabs              tabs;
	private ComboBox<Address> cmbAddress;
	private Binder<Customer>  binder;
	private FormItem          formItem2, formItem3, formItem4, formItem, formItem5, formItem6, formItem7, formItem8;
	private FormLayout        form;
	private Checkbox          chkActive;
	private Button            button, button2;
	private DatePicker        dateLastUpdate;
	private TextField         txtFirstName, txtLastName, txtEmail;
	// </generated-code>
	
}
