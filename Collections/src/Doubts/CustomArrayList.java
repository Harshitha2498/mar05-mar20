package com.mar21.customMap;
package Doubts;
import java.util.ArrayList;

@SuppressWarnings("serial")
class CustomArrayList<Custom> extends ArrayList<Custom> {

	@Override
	public boolean contains(Object o) {
            for (Custom key : this) {
                if ((Custom)key.getId()==0) {
                    return o.getName();
                }
            }
        return false;
	}

	
	@Override
	public Custom get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
}
