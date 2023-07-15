package productNote.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import productNote.enums.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus status;
	private List<OrderItem> items = new ArrayList<>();
	private Client client = new Client();

	public List<OrderItem> getItems() {
		return items;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Order() {

	}

	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public Double total() {
		Double total = 0d;
		for (OrderItem orderItem : items) {
			orderItem.subTotal();
		}

		return total;
	}

}
