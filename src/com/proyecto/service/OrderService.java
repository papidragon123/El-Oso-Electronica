package com.proyecto.service;

import java.util.List;

import com.proyecto.beans.OrderBean;
import com.proyecto.beans.OrderDetails;
import com.proyecto.beans.TransactionBean;

public interface OrderService {

	public String paymentSuccess(String userName, double paidAmount);

	public boolean addOrder(OrderBean order);

	public boolean addTransaction(TransactionBean transaction);

	public int countSoldItem(String prodId);

	public List<OrderBean> getAllOrders();

	public List<OrderBean> getOrdersByUserId(String emailId);

	public List<OrderDetails> getAllOrderDetails(String userEmailId);

	public String shipNow(String orderId, String prodId);
}
