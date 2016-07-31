package de.escalon.hypermedia.sample.springboot.store;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.stereotype.Component;

import de.escalon.hypermedia.sample.springboot.beans.store.Order;
import de.escalon.hypermedia.sample.springboot.beans.store.Product;
import de.escalon.hypermedia.sample.springboot.model.store.OrderModel;
import de.escalon.hypermedia.sample.springboot.model.store.OrderedItemModel;

import static de.escalon.hypermedia.spring.AffordanceBuilder.linkTo;

import java.util.List;

/**
 * Created by Dietrich on 17.02.2015.
 */
@Component
public class OrderAssembler extends ResourceAssemblerSupport<OrderModel, Order> {

    @Autowired
    private ProductAssembler itemAssembler;

    public OrderAssembler() {
        super(OrderController.class, Order.class);
    }

    @Override
    public Order toResource(OrderModel entity) {
        return createResourceWithId(entity.getId(), entity);
    }

    @Override
    protected Order instantiateResource(OrderModel entity) {
        Order order = super.instantiateResource(entity);
        order.setOrderStatus(entity.getOrderStatus());
        List<OrderedItemModel> orderedItems = entity.getOrderedItems();
        for (OrderedItemModel orderedItemModel : orderedItems) {
            Product product = itemAssembler.instantiateResource(orderedItemModel.orderedItem);
            Object parameters;
            product.add(linkTo(OrderedItemController.class, entity.getId())
                    .slash(orderedItemModel.orderedItemId)
                    .withSelfRel());
            order.addItem(product);
        }
        return order;
    }
}
