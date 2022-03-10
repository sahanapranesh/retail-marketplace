# retail-marketplace

The main purpose of this application is to build a retail marketplace. The use case demands that a retail user must be able to select from a range of products,
add products to the shopping cart and place an order successfully upon making the payment. Subsequently, they must receive the order and be able to return it. 

This repository houses the below applications 
 
* CatalogService - Starts on port 9090, and can be run as a SpringBootApplication. This takes care of building a product catalog
* OrderManagementService - Starts on port 9091, and can be run as a SpringBootApplication. This has a dependency on Axon server to be available. 
                           It is responsible for handling the operations related to Orders. 
* DeliveryService - Responsible for ensuring the delivery of the order. 
* UserService - Responsible for handling the operations related to users of the platform. 