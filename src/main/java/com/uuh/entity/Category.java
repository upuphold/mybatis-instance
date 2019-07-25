package com.uuh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Description:
 * Date: 2019年07月25日 22:05
 * Author: cg
 * Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {

	private int id;
	private String name;
	List<Product> products;
}
