package com.uuh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description:
 * Date: 2019年07月25日 23:54
 * Author: cg
 * Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	private int id;
	private String name;
	private float price;
	private Category category;

}
