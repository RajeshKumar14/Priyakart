package com.app.model;

import javax.persistence.Entity;

@Entity
public class Item {
	private String itemName;
	private String itemType;
	private String transactinDateAndTime;
	private double itemMrp;
	private double marginDiscount;
	private double vendorMargin;
	private double rebateValue;
	private double specialServiceCost;
	private double vat;
	private String service;
	private String transportMode;
	private String details;
	private double avaliableQuantity;
	private String shipmentMode;
	private double modeOfPayment;
	
	public Item() {
		super();
	}
	public Item(String itemName) {
		super();
		this.itemName = itemName;
	}
	public Item(String itemName, String itemType) {
		super();
		this.itemName = itemName;
		this.itemType = itemType;
	}
	public Item(String itemName, String itemType, String transactinDateAndTime) {
		super();
		this.itemName = itemName;
		this.itemType = itemType;
		this.transactinDateAndTime = transactinDateAndTime;
	}
	public Item(String itemName, String itemType, String transactinDateAndTime, double itemMrp) {
		super();
		this.itemName = itemName;
		this.itemType = itemType;
		this.transactinDateAndTime = transactinDateAndTime;
		this.itemMrp = itemMrp;
	}
	public Item(String itemName, String itemType, String transactinDateAndTime, double itemMrp,
			double marginDiscount) {
		super();
		this.itemName = itemName;
		this.itemType = itemType;
		this.transactinDateAndTime = transactinDateAndTime;
		this.itemMrp = itemMrp;
		this.marginDiscount = marginDiscount;
	}
	public Item(String itemName, String itemType, String transactinDateAndTime, double itemMrp, double marginDiscount,
			double vendorMargin) {
		super();
		this.itemName = itemName;
		this.itemType = itemType;
		this.transactinDateAndTime = transactinDateAndTime;
		this.itemMrp = itemMrp;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
	}
	public Item(String itemName, String itemType, String transactinDateAndTime, double itemMrp, double marginDiscount,
			double vendorMargin, double rebateValue) {
		super();
		this.itemName = itemName;
		this.itemType = itemType;
		this.transactinDateAndTime = transactinDateAndTime;
		this.itemMrp = itemMrp;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
	}
	public Item(String itemName, String itemType, String transactinDateAndTime, double itemMrp, double marginDiscount,
			double vendorMargin, double rebateValue, double specialServiceCost) {
		super();
		this.itemName = itemName;
		this.itemType = itemType;
		this.transactinDateAndTime = transactinDateAndTime;
		this.itemMrp = itemMrp;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
		this.specialServiceCost = specialServiceCost;
	}
	public Item(String itemName, String itemType, String transactinDateAndTime, double itemMrp, double marginDiscount,
			double vendorMargin, double rebateValue, double specialServiceCost, double vat) {
		super();
		this.itemName = itemName;
		this.itemType = itemType;
		this.transactinDateAndTime = transactinDateAndTime;
		this.itemMrp = itemMrp;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
		this.specialServiceCost = specialServiceCost;
		this.vat = vat;
	}
	public Item(String itemName, String itemType, String transactinDateAndTime, double itemMrp, double marginDiscount,
			double vendorMargin, double rebateValue, double specialServiceCost, double vat, String service) {
		super();
		this.itemName = itemName;
		this.itemType = itemType;
		this.transactinDateAndTime = transactinDateAndTime;
		this.itemMrp = itemMrp;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
		this.specialServiceCost = specialServiceCost;
		this.vat = vat;
		this.service = service;
	}
	public Item(String itemName, String itemType, String transactinDateAndTime, double itemMrp, double marginDiscount,
			double vendorMargin, double rebateValue, double specialServiceCost, double vat, String service,
			String transportMode) {
		super();
		this.itemName = itemName;
		this.itemType = itemType;
		this.transactinDateAndTime = transactinDateAndTime;
		this.itemMrp = itemMrp;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
		this.specialServiceCost = specialServiceCost;
		this.vat = vat;
		this.service = service;
		this.transportMode = transportMode;
	}
	public Item(String itemName, String itemType, String transactinDateAndTime, double itemMrp, double marginDiscount,
			double vendorMargin, double rebateValue, double specialServiceCost, double vat, String service,
			String transportMode, String details) {
		super();
		this.itemName = itemName;
		this.itemType = itemType;
		this.transactinDateAndTime = transactinDateAndTime;
		this.itemMrp = itemMrp;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
		this.specialServiceCost = specialServiceCost;
		this.vat = vat;
		this.service = service;
		this.transportMode = transportMode;
		this.details = details;
	}
	public Item(String itemName, String itemType, String transactinDateAndTime, double itemMrp, double marginDiscount,
			double vendorMargin, double rebateValue, double specialServiceCost, double vat, String service,
			String transportMode, String details, double avaliableQuantity) {
		super();
		this.itemName = itemName;
		this.itemType = itemType;
		this.transactinDateAndTime = transactinDateAndTime;
		this.itemMrp = itemMrp;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
		this.specialServiceCost = specialServiceCost;
		this.vat = vat;
		this.service = service;
		this.transportMode = transportMode;
		this.details = details;
		this.avaliableQuantity = avaliableQuantity;
	}
	public Item(String itemName, String itemType, String transactinDateAndTime, double itemMrp, double marginDiscount,
			double vendorMargin, double rebateValue, double specialServiceCost, double vat, String service,
			String transportMode, String details, double avaliableQuantity, String shipmentMode) {
		super();
		this.itemName = itemName;
		this.itemType = itemType;
		this.transactinDateAndTime = transactinDateAndTime;
		this.itemMrp = itemMrp;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
		this.specialServiceCost = specialServiceCost;
		this.vat = vat;
		this.service = service;
		this.transportMode = transportMode;
		this.details = details;
		this.avaliableQuantity = avaliableQuantity;
		this.shipmentMode = shipmentMode;
	}
	public Item(String itemName, String itemType, String transactinDateAndTime, double itemMrp, double marginDiscount,
			double vendorMargin, double rebateValue, double specialServiceCost, double vat, String service,
			String transportMode, String details, double avaliableQuantity, String shipmentMode, double modeOfPayment) {
		super();
		this.itemName = itemName;
		this.itemType = itemType;
		this.transactinDateAndTime = transactinDateAndTime;
		this.itemMrp = itemMrp;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
		this.specialServiceCost = specialServiceCost;
		this.vat = vat;
		this.service = service;
		this.transportMode = transportMode;
		this.details = details;
		this.avaliableQuantity = avaliableQuantity;
		this.shipmentMode = shipmentMode;
		this.modeOfPayment = modeOfPayment;
	}
	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", itemType=" + itemType + ", transactinDateAndTime="
				+ transactinDateAndTime + ", itemMrp=" + itemMrp + ", marginDiscount=" + marginDiscount
				+ ", vendorMargin=" + vendorMargin + ", rebateValue=" + rebateValue + ", specialServiceCost="
				+ specialServiceCost + ", vat=" + vat + ", service=" + service + ", transportMode=" + transportMode
				+ ", details=" + details + ", avaliableQuantity=" + avaliableQuantity + ", shipmentMode=" + shipmentMode
				+ ", modeOfPayment=" + modeOfPayment + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(avaliableQuantity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((details == null) ? 0 : details.hashCode());
		temp = Double.doubleToLongBits(itemMrp);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + ((itemType == null) ? 0 : itemType.hashCode());
		temp = Double.doubleToLongBits(marginDiscount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(modeOfPayment);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(rebateValue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((service == null) ? 0 : service.hashCode());
		result = prime * result + ((shipmentMode == null) ? 0 : shipmentMode.hashCode());
		temp = Double.doubleToLongBits(specialServiceCost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((transactinDateAndTime == null) ? 0 : transactinDateAndTime.hashCode());
		result = prime * result + ((transportMode == null) ? 0 : transportMode.hashCode());
		temp = Double.doubleToLongBits(vat);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(vendorMargin);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (Double.doubleToLongBits(avaliableQuantity) != Double.doubleToLongBits(other.avaliableQuantity))
			return false;
		if (details == null) {
			if (other.details != null)
				return false;
		} else if (!details.equals(other.details))
			return false;
		if (Double.doubleToLongBits(itemMrp) != Double.doubleToLongBits(other.itemMrp))
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		if (itemType == null) {
			if (other.itemType != null)
				return false;
		} else if (!itemType.equals(other.itemType))
			return false;
		if (Double.doubleToLongBits(marginDiscount) != Double.doubleToLongBits(other.marginDiscount))
			return false;
		if (Double.doubleToLongBits(modeOfPayment) != Double.doubleToLongBits(other.modeOfPayment))
			return false;
		if (Double.doubleToLongBits(rebateValue) != Double.doubleToLongBits(other.rebateValue))
			return false;
		if (service == null) {
			if (other.service != null)
				return false;
		} else if (!service.equals(other.service))
			return false;
		if (shipmentMode == null) {
			if (other.shipmentMode != null)
				return false;
		} else if (!shipmentMode.equals(other.shipmentMode))
			return false;
		if (Double.doubleToLongBits(specialServiceCost) != Double.doubleToLongBits(other.specialServiceCost))
			return false;
		if (transactinDateAndTime == null) {
			if (other.transactinDateAndTime != null)
				return false;
		} else if (!transactinDateAndTime.equals(other.transactinDateAndTime))
			return false;
		if (transportMode == null) {
			if (other.transportMode != null)
				return false;
		} else if (!transportMode.equals(other.transportMode))
			return false;
		if (Double.doubleToLongBits(vat) != Double.doubleToLongBits(other.vat))
			return false;
		if (Double.doubleToLongBits(vendorMargin) != Double.doubleToLongBits(other.vendorMargin))
			return false;
		return true;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getTransactinDateAndTime() {
		return transactinDateAndTime;
	}
	public void setTransactinDateAndTime(String transactinDateAndTime) {
		this.transactinDateAndTime = transactinDateAndTime;
	}
	public double getItemMrp() {
		return itemMrp;
	}
	public void setItemMrp(double itemMrp) {
		this.itemMrp = itemMrp;
	}
	public double getMarginDiscount() {
		return marginDiscount;
	}
	public void setMarginDiscount(double marginDiscount) {
		this.marginDiscount = marginDiscount;
	}
	public double getVendorMargin() {
		return vendorMargin;
	}
	public void setVendorMargin(double vendorMargin) {
		this.vendorMargin = vendorMargin;
	}
	public double getRebateValue() {
		return rebateValue;
	}
	public void setRebateValue(double rebateValue) {
		this.rebateValue = rebateValue;
	}
	public double getSpecialServiceCost() {
		return specialServiceCost;
	}
	public void setSpecialServiceCost(double specialServiceCost) {
		this.specialServiceCost = specialServiceCost;
	}
	public double getVat() {
		return vat;
	}
	public void setVat(double vat) {
		this.vat = vat;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getTransportMode() {
		return transportMode;
	}
	public void setTransportMode(String transportMode) {
		this.transportMode = transportMode;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public double getAvaliableQuantity() {
		return avaliableQuantity;
	}
	public void setAvaliableQuantity(double avaliableQuantity) {
		this.avaliableQuantity = avaliableQuantity;
	}
	public String getShipmentMode() {
		return shipmentMode;
	}
	public void setShipmentMode(String shipmentMode) {
		this.shipmentMode = shipmentMode;
	}
	public double getModeOfPayment() {
		return modeOfPayment;
	}
	public void setModeOfPayment(double modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}
	
	
}
