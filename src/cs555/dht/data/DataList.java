package cs555.dht.data;

import java.util.ArrayList;

public class DataList {

	ArrayList<DataItem> dataList;

	//================================================================================
	// Constructor
	//================================================================================
	public DataList() {
		dataList = new ArrayList<DataItem>();
	}


	//================================================================================
	// Data list manipulation
	//================================================================================
	public void addData(DataItem d) {
		if (!contains(d)) {
			dataList.add(d);
		}
	}

	//================================================================================
	// Accessor methods
	//================================================================================
	// Returns a list of data items >= to id
	public ArrayList<DataItem> subsetToMove(String id) {
		return null;
	}
	
	//================================================================================
	// House Keeping
	//================================================================================
	public String toString() {
		String s = "";

		for (DataItem d : dataList){
			s += d.toString();
		}

		return s;
	}

	// Override contains method
	public boolean contains(DataItem d) {
		for (DataItem item : dataList) {
			if (item.equals(d)) {
				return true;
			}
		}

		return false;
	}
}
