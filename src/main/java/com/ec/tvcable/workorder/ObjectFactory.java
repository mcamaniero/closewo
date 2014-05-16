
package com.ec.tvcable.workorder;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ec.tvcable.workorder package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Result_QNAME = new QName("http://soap.integration.fsm.comarch.com/", "Result");
    private final static QName _CloseWorkOrder_QNAME = new QName("http://soap.integration.fsm.comarch.com/", "CloseWorkOrder");
    private final static QName _ApplicationException_QNAME = new QName("http://soap.integration.fsm.comarch.com/", "ApplicationException");
    private final static QName _UpdateWorkOrder_QNAME = new QName("http://soap.integration.fsm.comarch.com/", "UpdateWorkOrder");
    private final static QName _SPCommand_QNAME = new QName("http://soap.integration.fsm.comarch.com/", "SPCommand");
    private final static QName _AdministrationUnitId_QNAME = new QName("", "id");
    private final static QName _AdministrationUnitAdministrationUnit_QNAME = new QName("", "administrationUnit");
    private final static QName _CustomerBusinessName_QNAME = new QName("", "businessName");
    private final static QName _CustomerLastName_QNAME = new QName("", "lastName");
    private final static QName _CustomerLocation_QNAME = new QName("", "location");
    private final static QName _CustomerEmail_QNAME = new QName("", "email");
    private final static QName _CustomerPhoneNumber2_QNAME = new QName("", "phoneNumber2");
    private final static QName _CustomerPhoneNumber1_QNAME = new QName("", "phoneNumber1");
    private final static QName _CustomerFirstName_QNAME = new QName("", "firstName");
    private final static QName _CustomerContacts_QNAME = new QName("", "contacts");
    private final static QName _CustomerPhoneNumber3_QNAME = new QName("", "phoneNumber3");
    private final static QName _TaskListCustomer_QNAME = new QName("", "customer");
    private final static QName _InventoryNode_QNAME = new QName("", "node");
    private final static QName _InventoryItems_QNAME = new QName("", "items");
    private final static QName _LocationBuildingNo_QNAME = new QName("", "buildingNo");
    private final static QName _LocationStreetId_QNAME = new QName("", "streetId");
    private final static QName _LocationCityId_QNAME = new QName("", "cityId");
    private final static QName _LocationDescription_QNAME = new QName("", "description");
    private final static QName _LocationLongitude_QNAME = new QName("", "longitude");
    private final static QName _LocationStreetName_QNAME = new QName("", "streetName");
    private final static QName _LocationLatitude_QNAME = new QName("", "latitude");
    private final static QName _LocationFlatNo_QNAME = new QName("", "flatNo");
    private final static QName _LocationCityAdministrationUnit_QNAME = new QName("", "cityAdministrationUnit");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ec.tvcable.workorder
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link UpdateWorkOrderResponse }
     * 
     */
    public UpdateWorkOrderResponse createUpdateWorkOrderResponse() {
        return new UpdateWorkOrderResponse();
    }

    /**
     * Create an instance of {@link WorkOrderItem }
     * 
     */
    public WorkOrderItem createWorkOrderItem() {
        return new WorkOrderItem();
    }

    /**
     * Create an instance of {@link SpCommand }
     * 
     */
    public SpCommand createSpCommand() {
        return new SpCommand();
    }

    /**
     * Create an instance of {@link ApplicationException }
     * 
     */
    public ApplicationException createApplicationException() {
        return new ApplicationException();
    }

    /**
     * Create an instance of {@link TimeInterval }
     * 
     */
    public TimeInterval createTimeInterval() {
        return new TimeInterval();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link ItemKey }
     * 
     */
    public ItemKey createItemKey() {
        return new ItemKey();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link Contacts }
     * 
     */
    public Contacts createContacts() {
        return new Contacts();
    }

    /**
     * Create an instance of {@link AdditionalAttribute }
     * 
     */
    public AdditionalAttribute createAdditionalAttribute() {
        return new AdditionalAttribute();
    }

    /**
     * Create an instance of {@link Node }
     * 
     */
    public Node createNode() {
        return new Node();
    }

    /**
     * Create an instance of {@link TasksList }
     * 
     */
    public TasksList createTasksList() {
        return new TasksList();
    }

    /**
     * Create an instance of {@link Items }
     * 
     */
    public Items createItems() {
        return new Items();
    }

    /**
     * Create an instance of {@link Inventory }
     * 
     */
    public Inventory createInventory() {
        return new Inventory();
    }

    /**
     * Create an instance of {@link TaskList }
     * 
     */
    public TaskList createTaskList() {
        return new TaskList();
    }

    /**
     * Create an instance of {@link AssignedExecutor }
     * 
     */
    public AssignedExecutor createAssignedExecutor() {
        return new AssignedExecutor();
    }

    /**
     * Create an instance of {@link Attributes }
     * 
     */
    public Attributes createAttributes() {
        return new Attributes();
    }

    /**
     * Create an instance of {@link AdministrationUnit }
     * 
     */
    public AdministrationUnit createAdministrationUnit() {
        return new AdministrationUnit();
    }

    /**
     * Create an instance of {@link Item.RelatedItems }
     * 
     */
    public Item.RelatedItems createItemRelatedItems() {
        return new Item.RelatedItems();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateWorkOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.integration.fsm.comarch.com/", name = "Result")
    public JAXBElement<UpdateWorkOrderResponse> createResult(UpdateWorkOrderResponse value) {
        return new JAXBElement<UpdateWorkOrderResponse>(_Result_QNAME, UpdateWorkOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkOrderItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.integration.fsm.comarch.com/", name = "CloseWorkOrder")
    public JAXBElement<WorkOrderItem> createCloseWorkOrder(WorkOrderItem value) {
        return new JAXBElement<WorkOrderItem>(_CloseWorkOrder_QNAME, WorkOrderItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.integration.fsm.comarch.com/", name = "ApplicationException")
    public JAXBElement<ApplicationException> createApplicationException(ApplicationException value) {
        return new JAXBElement<ApplicationException>(_ApplicationException_QNAME, ApplicationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkOrderItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.integration.fsm.comarch.com/", name = "UpdateWorkOrder")
    public JAXBElement<WorkOrderItem> createUpdateWorkOrder(WorkOrderItem value) {
        return new JAXBElement<WorkOrderItem>(_UpdateWorkOrder_QNAME, WorkOrderItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpCommand }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.integration.fsm.comarch.com/", name = "SPCommand")
    public JAXBElement<SpCommand> createSPCommand(SpCommand value) {
        return new JAXBElement<SpCommand>(_SPCommand_QNAME, SpCommand.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "id", scope = AdministrationUnit.class)
    public JAXBElement<String> createAdministrationUnitId(String value) {
        return new JAXBElement<String>(_AdministrationUnitId_QNAME, String.class, AdministrationUnit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdministrationUnit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "administrationUnit", scope = AdministrationUnit.class)
    public JAXBElement<AdministrationUnit> createAdministrationUnitAdministrationUnit(AdministrationUnit value) {
        return new JAXBElement<AdministrationUnit>(_AdministrationUnitAdministrationUnit_QNAME, AdministrationUnit.class, AdministrationUnit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "businessName", scope = Customer.class)
    public JAXBElement<String> createCustomerBusinessName(String value) {
        return new JAXBElement<String>(_CustomerBusinessName_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "lastName", scope = Customer.class)
    public JAXBElement<String> createCustomerLastName(String value) {
        return new JAXBElement<String>(_CustomerLastName_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Location }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "location", scope = Customer.class)
    public JAXBElement<Location> createCustomerLocation(Location value) {
        return new JAXBElement<Location>(_CustomerLocation_QNAME, Location.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "email", scope = Customer.class)
    public JAXBElement<String> createCustomerEmail(String value) {
        return new JAXBElement<String>(_CustomerEmail_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "phoneNumber2", scope = Customer.class)
    public JAXBElement<String> createCustomerPhoneNumber2(String value) {
        return new JAXBElement<String>(_CustomerPhoneNumber2_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "phoneNumber1", scope = Customer.class)
    public JAXBElement<String> createCustomerPhoneNumber1(String value) {
        return new JAXBElement<String>(_CustomerPhoneNumber1_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "firstName", scope = Customer.class)
    public JAXBElement<String> createCustomerFirstName(String value) {
        return new JAXBElement<String>(_CustomerFirstName_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Contacts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "contacts", scope = Customer.class)
    public JAXBElement<Contacts> createCustomerContacts(Contacts value) {
        return new JAXBElement<Contacts>(_CustomerContacts_QNAME, Contacts.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "phoneNumber3", scope = Customer.class)
    public JAXBElement<String> createCustomerPhoneNumber3(String value) {
        return new JAXBElement<String>(_CustomerPhoneNumber3_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "customer", scope = TaskList.class)
    public JAXBElement<Customer> createTaskListCustomer(Customer value) {
        return new JAXBElement<Customer>(_TaskListCustomer_QNAME, Customer.class, TaskList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Node }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "node", scope = Inventory.class)
    public JAXBElement<Node> createInventoryNode(Node value) {
        return new JAXBElement<Node>(_InventoryNode_QNAME, Node.class, Inventory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Items }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "items", scope = Inventory.class)
    public JAXBElement<Items> createInventoryItems(Items value) {
        return new JAXBElement<Items>(_InventoryItems_QNAME, Items.class, Inventory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "buildingNo", scope = Location.class)
    public JAXBElement<String> createLocationBuildingNo(String value) {
        return new JAXBElement<String>(_LocationBuildingNo_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "streetId", scope = Location.class)
    public JAXBElement<String> createLocationStreetId(String value) {
        return new JAXBElement<String>(_LocationStreetId_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "cityId", scope = Location.class)
    public JAXBElement<String> createLocationCityId(String value) {
        return new JAXBElement<String>(_LocationCityId_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "description", scope = Location.class)
    public JAXBElement<String> createLocationDescription(String value) {
        return new JAXBElement<String>(_LocationDescription_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "longitude", scope = Location.class)
    public JAXBElement<BigDecimal> createLocationLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LocationLongitude_QNAME, BigDecimal.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "streetName", scope = Location.class)
    public JAXBElement<String> createLocationStreetName(String value) {
        return new JAXBElement<String>(_LocationStreetName_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "latitude", scope = Location.class)
    public JAXBElement<BigDecimal> createLocationLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LocationLatitude_QNAME, BigDecimal.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "flatNo", scope = Location.class)
    public JAXBElement<String> createLocationFlatNo(String value) {
        return new JAXBElement<String>(_LocationFlatNo_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdministrationUnit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "cityAdministrationUnit", scope = Location.class)
    public JAXBElement<AdministrationUnit> createLocationCityAdministrationUnit(AdministrationUnit value) {
        return new JAXBElement<AdministrationUnit>(_LocationCityAdministrationUnit_QNAME, AdministrationUnit.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "customer", scope = SpCommand.class)
    public JAXBElement<Customer> createSpCommandCustomer(Customer value) {
        return new JAXBElement<Customer>(_TaskListCustomer_QNAME, Customer.class, SpCommand.class, value);
    }

}
