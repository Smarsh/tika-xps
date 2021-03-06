/*
 * java-axp XPS utility
 * Copyright (C) 2007-2008 Chris Pope
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */

package javaaxp.core.service.model.document.page;


public interface IArcSegment extends ILineSegment{

	/**
	 * Gets the value of the isLargeArc property.
	 * 
	 */
	public abstract boolean isIsLargeArc();

	/**
	 * Gets the value of the point property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public abstract String getPoint();

	/**
	 * Gets the value of the rotationAngle property.
	 * 
	 */
	public abstract double getRotationAngle();

	/**
	 * Gets the value of the size property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public abstract String getSize();

	/**
	 * Gets the value of the sweepDirection property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link STSweepDirection }
	 *     
	 */
	public abstract STSweepDirection getSweepDirection();

}