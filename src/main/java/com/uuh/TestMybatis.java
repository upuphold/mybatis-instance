package com.uuh;

import com.uuh.entity.Category;
import com.uuh.entity.Product;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description:
 * Date: 2019年07月25日 23:26
 * Author: cg
 * Version: 1.0
 */
public class TestMybatis {

	/*1. 应用程序找Mybatis要数据
2. mybatis从数据库中找来数据
2.1 通过mybatis-config.xml 定位哪个数据库
2.2 通过Category.xml执行对应的select语句
2.3 基于Category.xml把返回的数据库记录封装在Category对象中
2.4 把多个Category对象装在一个Category集合中
3. 返回一个Category集合*/
	public static void main(String[] args) throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();

		/*新增*/
//		Category c = new Category();
//		c.setName("新增加的Category");
//		session.insert("addCategory",c);

		/*删除*/
//		Category b = new Category();
//		b.setId(1);
//		session.delete("deleteCategory",b);

		/*查询*/
//		Category d = session.selectOne("getCategory", 3);

		/*修改*/
//		d.setName("78768");
//		session.update("updateCategory", d);

		/*模糊查询*/
//		List<Category> cs = session.selectList("listCategoryByName","cat");
//		for (Category a : cs) {
//			System.out.println(a.getName());
//		}

		/*多条件查询*/
//		Map<String,Object> params = new HashMap<>();
//		params.put("id", 3);
//		params.put("name", "cat");
//
//		List<Category> cs1 = session.selectList("listCategoryByIdAndName",params);
//		for (Category e : cs1) {
//			System.out.println(e.getName());
//		}

		/*一对多查询*/
//		List<Category> cs2 = session.selectList("listCategories");
//		System.out.println(cs2.toString());

		/*查询所有的*/
//		listAll(session);


		/*多对一查询*/
		List<Product> ps = session.selectList("listProduct");
		for (Product p : ps) {
			System.out.println(p+" 对应的分类是 \t "+ p.getCategory());
		}

		session.commit();
		session.close();

	}

	private static void listAll(SqlSession session) {
		List<Category> cs = session.selectList("listCategory");
		for (Category c : cs) {
			System.out.println(c.getName());
		}
	}
}