
package com.develogment.sod.ui;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletContext;

import com.develogment.sod.dal.CustomerDAO;
import com.develogment.sod.dal.PaymentDAO;
import com.develogment.sod.dal.RentalDAO;
import com.develogment.sod.dal.StaffDAO;
import com.develogment.sod.domain.Customer;
import com.develogment.sod.domain.Payment;
import com.develogment.sod.domain.Rental;
import com.develogment.sod.domain.Staff;
import com.develogment.sod.ui.PhotoComponent.TestRendere;
import com.rapidclipse.framework.server.data.converter.ConverterBuilder;
import com.rapidclipse.framework.server.data.renderer.CaptionRenderer;
import com.rapidclipse.framework.server.data.renderer.RenderedComponent;
import com.rapidclipse.framework.server.resources.CaptionUtils;
import com.rapidclipse.framework.server.ui.ItemLabelGeneratorFactory;
import com.rapidclipse.framework.server.ui.StartsWithIgnoreCaseItemFilter;
import com.rapidclipse.framework.server.ui.filter.FilterComponent;
import com.rapidclipse.framework.server.ui.filter.GridFilterSubjectFactory;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.FormItem;
import com.vaadin.flow.component.grid.ColumnTextAlign;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.BigDecimalField;
import com.vaadin.flow.component.upload.FinishedEvent;
import com.vaadin.flow.component.upload.Receiver;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.data.provider.DataProvider;
import com.vaadin.flow.data.selection.SelectionEvent;
import com.vaadin.flow.data.selection.SelectionListener;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.server.VaadinServlet;


@PageTitle("Grid Test")
@Entity(name = "customer")
@Route(value = "GridTest", layout = MainContainer.class)

public class PaymentGrid extends VerticalLayout implements Receiver, RouterLayout
{
	@PersistenceContext
	private EntityManager em;

	// database connection settings

	/**
	 *
	 */
	private File                  file;
	private ByteArrayOutputStream outStream = null;

	public File getFile()
	{
		return this.file;
	}

	public PaymentGrid()
	{
		super();
		this.initUI();
		
		this.upload.setReceiver(this);
	}
	
	@Override
	public OutputStream receiveUpload(final String fileName, final String mimeType)
	{
		this.outStream = new ByteArrayOutputStream();
		final File temporaryDirectory =
			(File)VaadinServlet.getCurrent().getServletContext().getAttribute(ServletContext.TEMPDIR);
		this.file = new File(temporaryDirectory + fileName);

		return this.outStream;

	}

	public Payment getSelectedPayment()
	{
		final Set<Payment> selectedItems = this.theGrid.getSelectedItems();
		if(selectedItems != null && selectedItems.size() > 0)
		{
			final Payment payment = selectedItems.stream().findFirst().get();
			return payment;
		}

		return null;

	}

	/**
	 * Event handler delegate method for the {@link Button} {@link #btnNew}.
	 *
	 * @see ComponentEventListener#onComponentEvent(ComponentEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void btnNew_onClick(final ClickEvent<Button> event)
	{
		this.binder.setBean(new Payment());
		this.form.setVisible(true);
		
	}

	/**
	 * Event handler delegate method for the {@link Button} {@link #btnSave}.
	 *
	 * @see ComponentEventListener#onComponentEvent(ComponentEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void btnSave_onClick(final ClickEvent<Button> event)
	{
		if(this.binder.isValid())
		{
			final Payment bean = this.binder.getBean();

			final boolean isNew = bean.getPaymentId() == null;

			PaymentDAO.INSTANCE.save(bean);

			if(isNew)
			{
				this.theGrid.setItems(PaymentDAO.INSTANCE.findAll());
				this.theGrid.select(bean);
			}
			else
			{
				this.theGrid.getDataProvider().refreshItem(bean);
			}

		}
		
	}

	public void refresh()
	{
		
		this.theGrid.getDataProvider().refreshAll();
	}
	
	/**
	 * Event handler delegate method for the {@link Grid} {@link #theGrid}.
	 *
	 * @see SelectionListener#selectionChange(SelectionEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void theGrid_selectionChange(final SelectionEvent<Grid<Payment>, Payment> event)
	{
		final Payment selectedPayment = this.getSelectedPayment();
		if(selectedPayment != null)
		{
			this.binder.setBean(selectedPayment);
			this.form.setVisible(true);
		}
		else
		{
			this.form.setVisible(false);
		}
		
	}
	
	/**
	 * Event handler delegate method for the {@link Upload} {@link #upload}.
	 *
	 * @see ComponentEventListener#onComponentEvent(ComponentEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void upload_onFinished(final FinishedEvent event)
	{
		if(this.outStream != null)
		{
			
			final byte[] byteArray = this.outStream.toByteArray();
			
			final Payment payment = this.getSelectedPayment();
			if(payment != null && payment.getCustomer() != null)
			{
				final String   mimeType = event.getMIMEType();
				final Customer customer = payment.getCustomer();
				customer.setPicture(byteArray);
				customer.setMime(mimeType);
				new CustomerDAO().save(customer);
			}
			
		}
	}
	
	/**
	 * Event handler delegate method for the {@link Button} {@link #btnDelete}.
	 *
	 * @see ComponentEventListener#onComponentEvent(ComponentEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void btnDelete_onClick(final ClickEvent<Button> event)
	{
	}

	/* WARNING: Do NOT edit!<br>The content of this method is always regenerated by the UI designer. */
	// <generated-code name="initUI">
	private void initUI()
	{
		this.horizontalLayout = new HorizontalLayout();
		this.form             = new FormLayout();
		this.formItem         = new FormItem();
		this.lblAmount        = new Label();
		this.bigdAmount       = new BigDecimalField();
		this.formItem2        = new FormItem();
		this.lblCustomer      = new Label();
		this.cmbCustomer      = new ComboBox<>();
		this.formItem3        = new FormItem();
		this.lblLastUpdate    = new Label();
		this.dateLastUpdate   = new DatePicker();
		this.formItem4        = new FormItem();
		this.lblPaymentDate   = new Label();
		this.datePaymentDate  = new DatePicker();
		this.formItem5        = new FormItem();
		this.lblRental        = new Label();
		this.cmbRental        = new ComboBox<>();
		this.formItem6        = new FormItem();
		this.lblStaff         = new Label();
		this.cmbStaff         = new ComboBox<>();
		this.upload           = new Upload();
		this.div              = new Div();
		this.btnNew           = new Button();
		this.btnSave          = new Button();
		this.btnDelete        = new Button();
		this.binder           = new Binder<>();
		this.verticalLayout2  = new VerticalLayout();
		this.filterComponent  = new FilterComponent();
		this.theGrid          = new Grid<>(Payment.class, false);

		this.form
			.setResponsiveSteps(new FormLayout.ResponsiveStep("0px", 1, FormLayout.ResponsiveStep.LabelsPosition.TOP));
		this.lblAmount.setText("Amount");
		this.lblCustomer.setText("Customer");
		this.cmbCustomer.setDataProvider(StartsWithIgnoreCaseItemFilter.New(this.cmbCustomer::getItemLabelGenerator),
			DataProvider.ofCollection(CustomerDAO.INSTANCE.findAll()));
		this.cmbCustomer.setItemLabelGenerator(ItemLabelGeneratorFactory.NonNull(CaptionUtils::resolveCaption));
		this.lblLastUpdate.setText("LastUpdate");
		this.lblPaymentDate.setText("PaymentDate");
		this.lblRental.setText("Rental");
		this.cmbRental.setDataProvider(StartsWithIgnoreCaseItemFilter.New(this.cmbRental::getItemLabelGenerator),
			DataProvider.ofCollection(RentalDAO.INSTANCE.findAll()));
		this.cmbRental.setItemLabelGenerator(ItemLabelGeneratorFactory.NonNull(CaptionUtils::resolveCaption));
		this.lblStaff.setText("Staff");
		this.cmbStaff.setDataProvider(StartsWithIgnoreCaseItemFilter.New(this.cmbStaff::getItemLabelGenerator),
			DataProvider.ofCollection(StaffDAO.INSTANCE.findAll()));
		this.cmbStaff.setItemLabelGenerator(ItemLabelGeneratorFactory.NonNull(CaptionUtils::resolveCaption));
		this.upload.setMinWidth("1");
		this.div.setMinWidth("1");
		this.btnNew.setText("New");
		this.btnSave.setText("Save");
		this.btnDelete.setText("Delete");
		this.filterComponent.setSearchText("Search  Payment Id,Amount ,Customer ");
		this.theGrid.setPageSize(400);
		this.theGrid.addColumn(Payment::getPaymentId).setKey("paymentId").setHeader("Id").setSortable(true)
			.setFlexGrow(0);
		this.theGrid.addColumn(Payment::getAmount).setKey("amount").setHeader("Amount").setSortable(true)
			.setAutoWidth(true)
			.setFlexGrow(0);
		this.theGrid.addColumn(new CaptionRenderer<>(Payment::getCustomer)).setKey("customer").setHeader("Customer")
			.setSortable(false).setAutoWidth(true);
		this.theGrid.addColumn(Payment::getPaymentDate).setKey("paymentDate").setHeader("Paymynet Date")
			.setSortable(true)
			.setAutoWidth(true);
		this.theGrid.addColumn(Payment::getLastUpdate).setKey("lastUpdate").setHeader("Last Upate").setSortable(true)
			.setAutoWidth(true);
		this.theGrid.addColumn(new CaptionRenderer<>(Payment::getRental)).setKey("rental").setHeader("Rental")
			.setSortable(false);
		this.theGrid.addColumn(new CaptionRenderer<>(Payment::getStaff)).setKey("staff").setHeader("Staff")
			.setSortable(false);
		this.theGrid.addColumn(RenderedComponent.Renderer(TestRendere::new)).setKey("renderer").setSortable(false)
			.setFlexGrow(0).setTextAlign(ColumnTextAlign.END);
		this.theGrid.setDataProvider(DataProvider.ofCollection(PaymentDAO.INSTANCE.findAll()));
		this.theGrid.setSelectionMode(Grid.SelectionMode.SINGLE);

		this.binder.forField(this.bigdAmount).bind(Payment::getAmount, Payment::setAmount);
		this.binder.forField(this.cmbCustomer).bind(Payment::getCustomer, Payment::setCustomer);
		this.binder.forField(this.dateLastUpdate)
			.withConverter(ConverterBuilder.LocalDateToUtilDate().systemDefaultZoneId().build())
			.bind(Payment::getLastUpdate, Payment::setLastUpdate);
		this.binder.forField(this.datePaymentDate)
			.withConverter(ConverterBuilder.LocalDateToUtilDate().systemDefaultZoneId().build())
			.bind(Payment::getPaymentDate, Payment::setPaymentDate);
		this.binder.forField(this.cmbRental).bind(Payment::getRental, Payment::setRental);
		this.binder.forField(this.cmbStaff).bind(Payment::getStaff, Payment::setStaff);

		this.filterComponent.connectWith(this.theGrid.getDataProvider());
		this.filterComponent.setFilterSubject(GridFilterSubjectFactory.CreateFilterSubject(this.theGrid,
			Arrays.asList("amount", "customer.firstName", "customer.lastName", "paymentDate", "paymentId"),
			Arrays.asList("amount", "customer.lastName", "paymentId")));

		this.lblAmount.setSizeUndefined();
		this.lblAmount.getElement().setAttribute("slot", "label");
		this.bigdAmount.setWidthFull();
		this.bigdAmount.setHeight(null);
		this.formItem.add(this.lblAmount, this.bigdAmount);
		this.lblCustomer.setSizeUndefined();
		this.lblCustomer.getElement().setAttribute("slot", "label");
		this.cmbCustomer.setWidthFull();
		this.cmbCustomer.setHeight(null);
		this.formItem2.add(this.lblCustomer, this.cmbCustomer);
		this.lblLastUpdate.setSizeUndefined();
		this.lblLastUpdate.getElement().setAttribute("slot", "label");
		this.dateLastUpdate.setWidthFull();
		this.dateLastUpdate.setHeight(null);
		this.formItem3.add(this.lblLastUpdate, this.dateLastUpdate);
		this.lblPaymentDate.setSizeUndefined();
		this.lblPaymentDate.getElement().setAttribute("slot", "label");
		this.datePaymentDate.setWidthFull();
		this.datePaymentDate.setHeight(null);
		this.formItem4.add(this.lblPaymentDate, this.datePaymentDate);
		this.lblRental.setSizeUndefined();
		this.lblRental.getElement().setAttribute("slot", "label");
		this.cmbRental.setWidthFull();
		this.cmbRental.setHeight(null);
		this.formItem5.add(this.lblRental, this.cmbRental);
		this.btnNew.setWidthFull();
		this.btnNew.setHeight(null);
		this.btnSave.setWidthFull();
		this.btnSave.setHeight(null);
		this.btnDelete.setWidthFull();
		this.btnDelete.setHeight(null);
		this.div.add(this.btnNew, this.btnSave, this.btnDelete);
		this.lblStaff.setSizeUndefined();
		this.lblStaff.getElement().setAttribute("slot", "label");
		this.cmbStaff.setWidthFull();
		this.cmbStaff.setHeight(null);
		this.upload.setSizeUndefined();
		this.div.setSizeFull();
		this.formItem6.add(this.lblStaff, this.cmbStaff, this.upload, this.div);
		this.form.add(this.formItem, this.formItem2, this.formItem3, this.formItem4, this.formItem5, this.formItem6);
		this.filterComponent.setWidthFull();
		this.filterComponent.setHeight(null);
		this.theGrid.setSizeFull();
		this.verticalLayout2.add(this.filterComponent, this.theGrid);
		this.verticalLayout2.setFlexGrow(1.0, this.theGrid);
		this.form.setWidth("350px");
		this.form.setHeight(null);
		this.verticalLayout2.setSizeFull();
		this.horizontalLayout.add(this.form, this.verticalLayout2);
		this.horizontalLayout.setSizeFull();
		this.add(this.horizontalLayout);
		this.setSizeFull();

		this.upload.addFinishedListener(this::upload_onFinished);
		this.btnNew.addClickListener(this::btnNew_onClick);
		this.btnSave.addClickListener(this::btnSave_onClick);
		this.btnDelete.addClickListener(this::btnDelete_onClick);
		this.theGrid.addSelectionListener(this::theGrid_selectionChange);
	} // </generated-code>

	// <generated-code name="variables">
	private BigDecimalField    bigdAmount;
	private HorizontalLayout   horizontalLayout;
	private VerticalLayout     verticalLayout2;
	private Label              lblAmount, lblCustomer, lblLastUpdate, lblPaymentDate, lblRental, lblStaff;
	private Div                div;
	private FilterComponent    filterComponent;
	private ComboBox<Staff>    cmbStaff;
	private Binder<Payment>    binder;
	private FormItem           formItem, formItem2, formItem3, formItem4, formItem5, formItem6;
	private ComboBox<Customer> cmbCustomer;
	private FormLayout         form;
	private Button             btnNew, btnSave, btnDelete;
	private Grid<Payment>      theGrid;
	private DatePicker         dateLastUpdate, datePaymentDate;
	private Upload             upload;
	private ComboBox<Rental>   cmbRental;
	// </generated-code>
	
}
