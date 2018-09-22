package ch18.ex5;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


class ItemStockTest {

	@Nested
	@DisplayName("初期状態")
	class Initializing {
		
		private ItemStock stock;
		private Item item;
		
		@BeforeEach
		void setUp() {
			stock = new ItemStock();
			item = new Item("book", 3800);
		}
		
		@Test
		@DisplayName("初期状態で、getNumで0が取得できる。")
		void getNum() {
			assertThat(stock.getNum(item)).isEqualTo(0);
		}
		
		@Test
		@DisplayName("初期状態で、addでItemを追加するとgetNumで1が取得できる。")
		void afterAddOneItem() {
			stock.add(item);
			assertThat(stock.getNum(item)).isEqualTo(1);
		}
	}
	
	@Nested
	@DisplayName("Itemが1つ追加されている状態")
	class AfterAddOneItem {
		private ItemStock stock;
		private Item item;
		
		@BeforeEach
		void setUp() {
			stock = new ItemStock();
			item = new Item("book", 3800);
			stock.add(item);
		}
		
		@Test
		@DisplayName("Itemが1つ追加されている状態で、getNumで1が取得できる")
		void getNum() {
			assertThat(stock.getNum(item)).isEqualTo(1);
		}
		
		@Test
		@DisplayName("Itemが1つ追加されている状態で、addで同じItemオブジェクトを追加するとgetNumで2が取得できる")
		void afterAddSameObject() {
			stock.add(item);
			assertThat(stock.getNum(item)).isEqualTo(2);
		}
		
		@Test
		@DisplayName("Itemが1つ追加されている状態で、addで異なるItemオブジェクトを追加するとgetNumで1が取得できる")
		void afterAddOtherObject() {
			stock.add(new Item("pencil", 999));
			assertThat(stock.getNum(item)).isEqualTo(1);
		}
	}
}
