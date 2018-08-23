package FptShop;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Common.Common;
import FptShop.PageFactory;

public class FptShopTests {

	@BeforeSuite
	public void setUp() throws Exception {
		Common.config();
	}

	@AfterMethod
	public void tearDown() {
		 PageFactory.AbstractPage().closePage();
	}

	@BeforeMethod
	public void prepair() throws Exception {
		// Open HomePage
//		PageFactory.HomePage().open();
	}

	@AfterSuite
	public void finishSuite() {
	}

	@Test(description = "TC 011b: Verify Installment Buying An Item By Select Item At News Page Successfully")
	public void TC011b_Installment_Buying_By_Select_Item_At_News_Page() throws Exception {
		// Open HomePage
		PageFactory.HomePage().open();
		// Select News button at HomePage
		PageFactory.HomePage().openNewsPage();
		// Select an item at NewsPage
		PageFactory.NewsPage().selectItem();
		// Check if item available at ItemDetailPage
		if (!PageFactory.ItemDetailPage().checkItemStatus()) {
			PageFactory.ItemDetailPage().contactWhenAvailable();
		} else {
			// Select Installment Buying at ItemDetailPage
			PageFactory.ItemDetailPage().installmentBuying();
			// Fill information at InstallmentBuyingPage
			PageFactory.InstallmentBuyingPage().fillInformationInstallmentBuying();
			// VP: Successfully Installment Buying
			PageFactory.InstallmentBuyingPage().checkInstallmentBuyingResult();
		}
	}

	@Test(description = "TC 011a: Verify Order An Item At News Page Successfully")
	public void TC011a_Order_By_Select_Item_At_News_Page() throws Exception {
		// Open HomePage
		PageFactory.HomePage().open();
		// Select News button at HomePage
		PageFactory.HomePage().openNewsPage();
		// Select an item at NewsPage
		PageFactory.NewsPage().selectItem();
		// Check if item available at ItemDetailPage
		if (!PageFactory.ItemDetailPage().checkItemStatus()) {
			PageFactory.ItemDetailPage().contactWhenAvailable();
		} else {
			// Select Buy Now at ItemDetailPage
			PageFactory.ItemDetailPage().buyNow();
			// Select Checkout at CartPage
			PageFactory.CartPage().checkOut();
			// VP: Check order result at OrderResultPage
			PageFactory.OrderResultPage().checkOrderResult();
		}

	}

	@Test(description = "TC 010b: Verify Installment Buying Through Installment Buying Category Page Successfully")
	public void TC010b_Installment_Buying_Through_Installment_Buying_Category_Page() throws Exception {
		// Open HomePage
		PageFactory.HomePage().open();
		// Search for Category at HomePage
		PageFactory.HomePage().selectInstallmentBuyingCategory();
		// Click an item at InstallmentBuyingCategoryPage
		PageFactory.InstallmentBuyingCategoryPage().selectItem();
		// Check if item available at ItemDetailPage
		if (!PageFactory.ItemDetailPage().checkItemStatus()) {
			PageFactory.ItemDetailPage().contactWhenAvailable();
		} else {
			// Select Installment Buying at ItemDetailPage
			PageFactory.ItemDetailPage().installmentBuying();
			// Fill information at InstallmentBuyingPage
			PageFactory.InstallmentBuyingPage().fillInformationInstallmentBuying();
			// VP: Successfully Installment Buying
			PageFactory.InstallmentBuyingPage().checkInstallmentBuyingResult();
		}
	}

	@Test(description = "TC 010a: Verify Installment Buying At Installment Buying Category Page Successfully")
	public void TC010a_Installment_Buying_Through_Installment_Buying_Category_Page() throws Exception {
		// Open HomePage
		PageFactory.HomePage().open();
		// Search for Category at HomePage
		PageFactory.HomePage().selectInstallmentBuyingCategory();
		// Click a Installment Buying button at InstallmentBuyingCategoryPage
		PageFactory.InstallmentBuyingCategoryPage().installmentBuying();
		// Fill information at InstallmentBuyingPage
		PageFactory.InstallmentBuyingPage().fillInformationInstallmentBuying();
		// VP: Successfully Installment Buying
		PageFactory.InstallmentBuyingPage().checkInstallmentBuyingResult();
	}

	@Test(description = "TC 009c: Verify Installment Buying An Item By Select Item At Category Page Successfully")
	public void TC009c_Installment_Buying_By_Select_Item_At_Category_Page() throws Exception {
		// Open HomePage
		PageFactory.HomePage().open();
		// Search for Category at HomePage
		PageFactory.HomePage().selectCategory();
		// Select item at CategoryPage
		PageFactory.CategoryPage().selectItem();
		// Check if item available at ItemDetailPage
		if (!PageFactory.ItemDetailPage().checkItemStatus()) {
			PageFactory.ItemDetailPage().contactWhenAvailable();
		} else {
			// Select Installment Buying at ItemDetailPage
			PageFactory.ItemDetailPage().installmentBuying();
			// Fill information at InstallmentBuyingPage
			PageFactory.InstallmentBuyingPage().fillInformationInstallmentBuying();
			// VP: Successfully Installment Buying
			PageFactory.InstallmentBuyingPage().checkInstallmentBuyingResult();
		}
	}

	@Test(description = "TC 009b: Verify ShopBooking An Item By Select Item At Category Page Successfully")
	public void TC009b_Order_By_Select_Item_At_Category_Page() throws Exception {
		// Open HomePage
		PageFactory.HomePage().open();
		// Search for Category at HomePage
		PageFactory.HomePage().selectCategory();
		// Select item at CategoryPage
		PageFactory.CategoryPage().selectItem();
		// Check if item available at ItemDetailPage
		if (!PageFactory.ItemDetailPage().checkItemStatus()) {
			PageFactory.ItemDetailPage().contactWhenAvailable();
		} else {
			// Select ShopBooking at ItemDetailPage
			PageFactory.ItemDetailPage().shopBooking();
			// Select Checkout at CartPage
			PageFactory.CartPage().checkOut();
			// VP: Check order result at OrderResultPage
			PageFactory.OrderResultPage().checkOrderResult();
		}
	}

	@Test(description = "TC 009a: Verify Order An Item By Select Item At Category Page Successfully")
	public void TC009a_Order_By_Select_Item_At_Category_Page() throws Exception {
		// Open HomePage
		PageFactory.HomePage().open();
		// Search for Category at HomePage
		PageFactory.HomePage().selectCategory();
		// Select item at CategoryPage
		PageFactory.CategoryPage().selectItem();
		// Check if item available at ItemDetailPage
		if (!PageFactory.ItemDetailPage().checkItemStatus()) {
			PageFactory.ItemDetailPage().contactWhenAvailable();
		} else {
			// Select Buy Now at ItemDetailPage
			PageFactory.ItemDetailPage().buyNow();
			// Select Checkout at CartPage
			PageFactory.CartPage().checkOut();
			// VP: Check order result at OrderResultPage
			PageFactory.OrderResultPage().checkOrderResult();
		}
	}

	@Test(description = "TC 008c: Verify Installment Buying An Item By Select Brand At Category Page Successfully")
	public void TC008c_Installment_Buying_By_Select_Brand_At_Category_Page() throws Exception {
		// Open HomePage
		PageFactory.HomePage().open();
		// Search for item at HomePage
		PageFactory.HomePage().selectCategory();
		// Select PriceRange at CategoryPage
		PageFactory.CategoryPage().selectBrand();
		// Select item at BrandPAge
		PageFactory.BrandPage().selectItem();
		// Check if item available at ItemDetailPage
		if (!PageFactory.ItemDetailPage().checkItemStatus()) {
			PageFactory.ItemDetailPage().contactWhenAvailable();
		} else {
			// Select Installment Buying at ItemDetailPage
			PageFactory.ItemDetailPage().installmentBuying();
			// Fill information at InstallmentBuyingPage
			PageFactory.InstallmentBuyingPage().fillInformationInstallmentBuying();
			// VP: Successfully Installment Buying
			PageFactory.InstallmentBuyingPage().checkInstallmentBuyingResult();
		}
	}

	@Test(description = "TC 008b: Verify ShopBooking An Item By Select Brand At Category Page Successfully")
	public void TC008b_Order_By_Select_Brand_At_Category_Page() throws Exception {
		// Open HomePage
		PageFactory.HomePage().open();
		// Search for item at HomePage
		PageFactory.HomePage().selectCategory();
		// Select Brand at CategoryPage
		PageFactory.CategoryPage().selectBrand();
		// Select item at BrandPage
		PageFactory.BrandPage().selectItem();
		// Check if item available at ItemDetailPage
		if (!PageFactory.ItemDetailPage().checkItemStatus()) {
			PageFactory.ItemDetailPage().contactWhenAvailable();
		} else {
			// Select Buy Now at ItemDetailPage
			PageFactory.ItemDetailPage().buyNow();
			// Select Checkout at CartPage
			PageFactory.CartPage().checkOut();
			// VP: Check order result at OrderResultPage
			PageFactory.OrderResultPage().checkOrderResult();
		}
	}

	@Test(description = "TC 008a: Verify Order An Item By Select Brand At Category Page Successfully")
	public void TC008a_Order_By_Select_Brand_At_Category_Page() throws Exception {
		// Open HomePage
		PageFactory.HomePage().open();
		// Search for item at HomePage
		PageFactory.HomePage().selectCategory();
		// Select Brand at CategoryPage
		PageFactory.CategoryPage().selectBrand();
		// Select item at BrandPage
		PageFactory.BrandPage().selectItem();
		// Check if item available at ItemDetailPage
		if (!PageFactory.ItemDetailPage().checkItemStatus()) {
			PageFactory.ItemDetailPage().contactWhenAvailable();
		} else {
			// Select Buy Now at ItemDetailPage
			PageFactory.ItemDetailPage().buyNow();
			// Select Checkout at CartPage
			PageFactory.CartPage().checkOut();
			// VP: Check order result at OrderResultPage
			PageFactory.OrderResultPage().checkOrderResult();
		}
	}

	@Test(description = "TC 007c: Verify Installment Buying An Item By Select Price Range At Category Page Successfully")
	public void TC007c_Installment_Buying_By_Select_Price_Range_At_Category_Page() throws Exception {
		// Open HomePage
		PageFactory.HomePage().open();
		// Search for item at HomePage
		PageFactory.HomePage().selectCategory();
		// Select PriceRange at CategoryPage
		PageFactory.CategoryPage().selectPriceRange();
		// Select item at BrandPage
		PageFactory.BrandPage().selectItem();
		// Check if item available at ItemDetailPage
		if (!PageFactory.ItemDetailPage().checkItemStatus()) {
			PageFactory.ItemDetailPage().contactWhenAvailable();
		} else {
			// Select Installment Buying at ItemDetailPage
			PageFactory.ItemDetailPage().installmentBuying();
			// Fill information at InstallmentBuyingPage
			PageFactory.InstallmentBuyingPage().fillInformationInstallmentBuying();
			// VP: Successfully Installment Buying
			PageFactory.InstallmentBuyingPage().checkInstallmentBuyingResult();
		}
	}

	@Test(description = "TC 007b: Verify ShopBooking An Item By Select Price Range At Category Page Successfully")
	public void TC007b_Order_By_Select_Price_Range_At_Category_Page() throws Exception {
		// Open HomePage
		PageFactory.HomePage().open();
		// Search for item at HomePage
		PageFactory.HomePage().selectCategory();
		// Select PriceRange at CategoryPage
		PageFactory.CategoryPage().selectPriceRange();
		// Select item at BrandPAge
		PageFactory.BrandPage().selectItem();
		// Check if item available at ItemDetailPage
		if (!PageFactory.ItemDetailPage().checkItemStatus()) {
			PageFactory.ItemDetailPage().contactWhenAvailable();
		} else {
			// Select Buy Now at ItemDetailPage
			PageFactory.ItemDetailPage().shopBooking();
			// Select Checkout at CartPage
			PageFactory.CartPage().checkOut();
			// VP: Check order result at OrderResultPage
			PageFactory.OrderResultPage().checkOrderResult();
		}
	}

	@Test(description = "TC 007a: Verify Order An Item By Select Price Range At Category Page Successfully")
	public void TC007a_Order_By_Select_Price_Range_At_Category_Page() throws Exception {
		// Open HomePage
		PageFactory.HomePage().open();
		// Search for item at HomePage
		PageFactory.HomePage().selectCategory();
		// Select PriceRange at CategoryPage
		PageFactory.CategoryPage().selectPriceRange();
		// Select item at BrandPAge
		PageFactory.BrandPage().selectItem();
		// Check if item available at ItemDetailPage
		if (!PageFactory.ItemDetailPage().checkItemStatus()) {
			PageFactory.ItemDetailPage().contactWhenAvailable();
		} else {
			// Select Buy Now at ItemDetailPage
			PageFactory.ItemDetailPage().buyNow();
			// Select Checkout at CartPage
			PageFactory.CartPage().checkOut();
			// VP: Check order result at OrderResultPage
			PageFactory.OrderResultPage().checkOrderResult();
		}
	}

	@Test(description = "TC 006d: Verify Installment Buying By Select An Item At Ranking Page Successfully")
	public void TC006d_Installment_Buying_Through_Ranking_Page() throws Exception {
		// Open HomePage
		PageFactory.HomePage().open();
		// Select a RankingPage at HomePage
		PageFactory.HomePage().selectRankingPage();
		// Select item at RankingPage
		PageFactory.RankingPage().selectItem();
		// Check if item available at ItemDetailPage
		if (!PageFactory.ItemDetailPage().checkItemStatus()) {
			PageFactory.ItemDetailPage().contactWhenAvailable();
		} else {
			// Select InstallBuying at ItemDetailPage
			PageFactory.ItemDetailPage().installmentBuying();
			// Fill information at InstallmentBuyingPage
			PageFactory.InstallmentBuyingPage().fillInformationInstallmentBuying();
			// VP: Successfully Installment Buying
			PageFactory.InstallmentBuyingPage().checkInstallmentBuyingResult();
		}
	}

	@Test(description = "TC 006c: Verify ShopBooking By Select An Item At Ranking Page Successfully")
	public void TC006c_Order_Item_Through_Ranking_Page() throws Exception {
		// Open HomePage
		PageFactory.HomePage().open();
		// Select a RankingPage at HomePage
		PageFactory.HomePage().selectRankingPage();
		// Select item at RankingPage
		PageFactory.RankingPage().selectItem();
		// Check if item available at ItemDetailPage
		if (!PageFactory.ItemDetailPage().checkItemStatus()) {
			PageFactory.ItemDetailPage().contactWhenAvailable();
		} else {
			// Select ShopBooking at ItemDetailPage
			PageFactory.ItemDetailPage().shopBooking();
			// Select Checkout at CartPage
			PageFactory.CartPage().checkOut();
			// VP: Check order result at OrderResultPage
			PageFactory.OrderResultPage().checkOrderResult();
		}
	}

	@Test(description = "TC 006b: Verify Order By Select An Item At Ranking Page Successfully")
	public void TC006b_Order_Item_Through_Ranking_Page() throws Exception {
		// Open HomePage
		PageFactory.HomePage().open();
		// Select a RankingPage at HomePage
		PageFactory.HomePage().selectRankingPage();
		// Select item at RankingPage
		PageFactory.RankingPage().selectItem();
		// Check if item available at ItemDetailPage
		if (!PageFactory.ItemDetailPage().checkItemStatus()) {
			PageFactory.ItemDetailPage().contactWhenAvailable();
		} else {
			// Select Buy Now at ItemDetailPage
			PageFactory.ItemDetailPage().buyNow();
			// Select Checkout at CartPage
			PageFactory.CartPage().checkOut();
			// VP: Check order result at OrderResultPage
			PageFactory.OrderResultPage().checkOrderResult();
		}
	}

	@Test(description = "TC 006a: Verify Order An Item At Ranking Page Successfully")
	public void TC006a_Order_Item_Through_Ranking_Page() throws Exception {
		// Open HomePage
		PageFactory.HomePage().open();
		// Select a RankingPage at HomePage
		PageFactory.HomePage().selectRankingPage();
		// Select OrderNowButton at RankingPage
		PageFactory.RankingPage().orderNow();
		// VP: Successfully Order An Item Through RankingPage
		PageFactory.RankingPage().checkOrderResult();
	}

	@Test(description = "TC 005c: Verify Installment Buying An Item Through Category Successfully")
	public void TC005c_Installment_Buying_Item_By_Category() throws Exception {
		// Open HomePage
		PageFactory.HomePage().open();
		// Select a random best buy item at HomePage
		PageFactory.HomePage().selectBestBuyItem();
		// Check if item available at ItemDetailPage
		if (!PageFactory.ItemDetailPage().checkItemStatus()) {
			PageFactory.ItemDetailPage().contactWhenAvailable();
		} else {
			// Select InstallBuying at ItemDetailPage
			PageFactory.ItemDetailPage().installmentBuying();
			// Fill information at InstallmentBuyingPage
			PageFactory.InstallmentBuyingPage().fillInformationInstallmentBuying();
			// VP: Successfully Installment Buying
			PageFactory.InstallmentBuyingPage().checkInstallmentBuyingResult();
		}
	}

	@Test(description = "TC 005b: Verify Order Best Buy Item By ShopBookingLink Through Category Successfully")
	public void TC005b_Order_Best_Buy_Item_By_Category() throws Exception {
		// Open HomePage
		PageFactory.HomePage().open();
		// Select a random best buy item at HomePage
		PageFactory.HomePage().selectBestBuyItem();
		// Check if item available at ItemDetailPage
		if (!PageFactory.ItemDetailPage().checkItemStatus()) {
			PageFactory.ItemDetailPage().contactWhenAvailable();
		} else {
			// Select ShopBooking at ItemDetailPage
			PageFactory.ItemDetailPage().shopBooking();
			// Select Checkout at CartPage
			PageFactory.CartPage().checkOut();
			// VP: Check order result at OrderResultPage
			PageFactory.OrderResultPage().checkOrderResult();
		}
	}

	@Test(description = "TC 005a: Verify Order Best Buy Item By BuyNowButton Through Category Successfully")
	public void TC005a_Order_Best_Buy_Item_By_Category() throws Exception {
		// Open HomePage
		PageFactory.HomePage().open();
		// Select a random best buy item at HomePage
		PageFactory.HomePage().selectBestBuyItem();
		// Check if item available at ItemDetailPage
		if (!PageFactory.ItemDetailPage().checkItemStatus()) {
			PageFactory.ItemDetailPage().contactWhenAvailable();
		} else {
			// Select Buy Now at ItemDetailPage
			PageFactory.ItemDetailPage().buyNow();
			// Select Checkout at CartPage
			PageFactory.CartPage().checkOut();
			// VP: Check order result at OrderResultPage
			PageFactory.OrderResultPage().checkOrderResult();
		}
	}

	@Test(description = "TC 004c: Verify Installment Buying An Item Through Category Successfully")
	public void TC004c_Installment_Buying_By_Category() throws Exception {
		// Open HomePage
		PageFactory.HomePage().open();
		// Select a Brand at HomePage
		PageFactory.HomePage().selectBrand();
		// Select an item at BrandPage
		PageFactory.BrandPage().selectItem();
		// Check if item available at ItemDetailPage
		if (!PageFactory.ItemDetailPage().checkItemStatus()) {
			PageFactory.ItemDetailPage().contactWhenAvailable();
		} else {
			// Select InstallBuying at ItemDetailPage
			PageFactory.ItemDetailPage().installmentBuying();
			// Fill information at InstallmentBuyingPage
			PageFactory.InstallmentBuyingPage().fillInformationInstallmentBuying();
			// VP: Successfully Installment Buying
			PageFactory.InstallmentBuyingPage().checkInstallmentBuyingResult();
		}
	}

	@Test(description = "TC 004b: Verify Order An Item By ShopBookingLink Through Category Successfully")
	public void TC004b_Order_Item_By_Category() throws Exception {
		// Open HomePage
		PageFactory.HomePage().open();
		// Select a Brand at HomePage
		PageFactory.HomePage().selectBrand();
		// Select item at BrandPage
		PageFactory.BrandPage().selectItem();
		// Check if item available at ItemDetailPage
		if (!PageFactory.ItemDetailPage().checkItemStatus()) {
			PageFactory.ItemDetailPage().contactWhenAvailable();
		} else {
			// Select InstallBuying at ItemDetailPage
			PageFactory.ItemDetailPage().shopBooking();
			// Select Checkout at CartPage
			PageFactory.CartPage().checkOut();
			// VP: Check order result at OrderResultPage
			PageFactory.OrderResultPage().checkOrderResult();
		}
	}

	@Test(description = "TC 004a: Verify Order An Item By BuyNowButton Through Category Successfully")
	public void TC004a_Order_Item_By_Category() throws Exception {
		// Open HomePage
		PageFactory.HomePage().open();
		// Select a Brand at HomePage
		PageFactory.HomePage().selectBrand();
		// Select item at BrandPage
		PageFactory.BrandPage().selectItem();
		// Check if item available at ItemDetailPage
		if (!PageFactory.ItemDetailPage().checkItemStatus()) {
			PageFactory.ItemDetailPage().contactWhenAvailable();
		} else {
			// Select Buy Now at ItemDetailPage
			PageFactory.ItemDetailPage().buyNow();
			// Select Checkout at CartPage
			PageFactory.CartPage().checkOut();
			// VP: Check order result at OrderResultPage
			PageFactory.OrderResultPage().checkOrderResult();
		}
	}

	@Test(description = "TC 003c: Verify Installment Buying An Item After Selecting Item At HomePage Successfully")
	public void TC003c_Installment_Buying_By_Selecting_Item_At_HomePage() throws Exception {
		// Open HomePage
		PageFactory.HomePage().open();
		// Select random item at HomePage
		PageFactory.HomePage().selectItem();
		// Check if item available at ItemDetailPage
		if (!PageFactory.ItemDetailPage().checkItemStatus()) {
			PageFactory.ItemDetailPage().contactWhenAvailable();
		} else {
			// Select InstallBuying at ItemDetailPage
			PageFactory.ItemDetailPage().installmentBuying();
			// Fill information at InstallmentBuyingPage
			PageFactory.InstallmentBuyingPage().fillInformationInstallmentBuying();
			// VP: Successfully Installment Buying
			PageFactory.InstallmentBuyingPage().checkInstallmentBuyingResult();
		}
	}

	@Test(description = "TC 003b: Verify Order An Item By ShopBookingLink After Selecting Item At HomePage Successfully")
	public void TC003b_Order_By_Selecting_Item_At_HomePage() throws Exception {
		// Open HomePage
		PageFactory.HomePage().open();
		// Select random item at HomePage
		PageFactory.HomePage().selectItem();
		// Check if item available at ItemDetailPage
		if (!PageFactory.ItemDetailPage().checkItemStatus()) {
			PageFactory.ItemDetailPage().contactWhenAvailable();
		} else {
			// Select Buy Now at ItemDetailPage
			PageFactory.ItemDetailPage().shopBooking();
			// Select Checkout at CartPage
			PageFactory.CartPage().checkOut();
			// VP: Check order result at OrderResultPage
			PageFactory.OrderResultPage().checkOrderResult();
		}
	}

	@Test(description = "TC 003a: Verify Order An Item By BuyNowButton After Selecting Item At HomePage Successfully")
	public void TC003a_Order_By_Selecting_Item_At_HomePage() throws Exception {
		// Open HomePage
		PageFactory.HomePage().open();
		// Select random item at HomePage
		PageFactory.HomePage().selectItem();
		// Check if item available at ItemDetailPage
		if (!PageFactory.ItemDetailPage().checkItemStatus()) {
			PageFactory.ItemDetailPage().contactWhenAvailable();
		} else {
			// Select Buy Now at ItemDetailPage
			PageFactory.ItemDetailPage().buyNow();
			// Select Checkout at CartPage
			PageFactory.CartPage().checkOut();
			// VP: Check order result at OrderResultPage
			PageFactory.OrderResultPage().checkOrderResult();
		}
	}

	@Test(description = "TC 002c: Verify Installment Buying An Item By Advanced Searching Successfully")
	public void TC002c_Installment_Buying_By_Advanced_Searching() throws Exception {
		// Open HomePage
		PageFactory.HomePage().open();
		// Search for an item at HomePage
		PageFactory.HomePage().advancedSearchItem();
		// Select the item at SearchResultPage
		PageFactory.SearchResultPage().selectItem();
		// Check if item available at ItemDetailPage
		if (!PageFactory.ItemDetailPage().checkItemStatus()) {
			PageFactory.ItemDetailPage().contactWhenAvailable();
		} else {
			// Select InstallBuying at ItemDetailPage
			PageFactory.ItemDetailPage().installmentBuying();
			// Fill information at InstallmentBuyingPage
			PageFactory.InstallmentBuyingPage().fillInformationInstallmentBuying();
			// VP: Successfully Installment Buying
			PageFactory.InstallmentBuyingPage().checkInstallmentBuyingResult();
		}
	}

	@Test(description = "TC 002b: Verify Shopbooking An Item By Advanced Searching Successfully")
	public void TC002b_Order_By_Advanced_Searching() throws Exception {
		// Open HomePage
		PageFactory.HomePage().open();
		// Search for item at HomePage
		PageFactory.HomePage().advancedSearchItem();
		// Select item at SearchResultPage
		PageFactory.SearchResultPage().selectItem();
		// Check if item available at ItemDetailPage
		if (!PageFactory.ItemDetailPage().checkItemStatus()) {
			PageFactory.ItemDetailPage().contactWhenAvailable();
		} else {
			// Select Buy Now at ItemDetailPage
			PageFactory.ItemDetailPage().buyNow();
			// Select Checkout at CartPage
			PageFactory.CartPage().checkOut();
			// VP: Check order result at OrderResultPage
			PageFactory.OrderResultPage().checkOrderResult();
		}
	}

	@Test(description = "TC 002a: Verify Order An Item By Advanced Searching Successfully")
	public void TC002a_Order_By_Advanced_Searching() throws Exception {
		// Open HomePage
		PageFactory.HomePage().open();
		// Search for item at HomePage
		PageFactory.HomePage().advancedSearchItem();
		// Select item at SearchResultPage
		PageFactory.SearchResultPage().selectItem();
		// Check if item available at ItemDetailPage
		if (!PageFactory.ItemDetailPage().checkItemStatus()) {
			PageFactory.ItemDetailPage().contactWhenAvailable();
		} else {
			// Select Buy Now at ItemDetailPage
			PageFactory.ItemDetailPage().buyNow();
			// Select Checkout at CartPage
			PageFactory.CartPage().checkOut();
			// VP: Check order result at OrderResultPage
			PageFactory.OrderResultPage().checkOrderResult();
		}
	}

	@Test(description = "TC 001c: Verify Installment Buying An Item By Search Suggestion Successfully")
	public void TC001c_Installment_Buying_By_Search_Suggestion() throws Exception {
		// Open HomePage
		PageFactory.HomePage().open();
		// Search for item at HomePage
		PageFactory.HomePage().suggestionSearchItem();
		// Check if item available at ItemDetailPage
		if (!PageFactory.ItemDetailPage().checkItemStatus()) {
			PageFactory.ItemDetailPage().contactWhenAvailable();
		} else {
			// Select Installment Buying at ItemDetailPage
			PageFactory.ItemDetailPage().installmentBuying();
			// Fill information at InstallmentBuyingPage
			PageFactory.InstallmentBuyingPage().fillInformationInstallmentBuying();
			// VP: Successfully Installment Buying
			PageFactory.InstallmentBuyingPage().checkInstallmentBuyingResult();
		}
	}

	@Test(description = "TC 001b: Verify ShopBooking An Item By Search Suggestion Successfully")
	public void TC001b_Order_By_Search_Suggestion() throws Exception {
		// Open HomePage
		PageFactory.HomePage().open();
		// Search for item at HomePage
		PageFactory.HomePage().suggestionSearchItem();
		// Check if item available at ItemDetailPage
		if (!PageFactory.ItemDetailPage().checkItemStatus()) {
			PageFactory.ItemDetailPage().contactWhenAvailable();
		} else {
			// Select ShopBooking at ItemDetailPage
			PageFactory.ItemDetailPage().shopBooking();
			// Select Checkout at CartPage
			PageFactory.CartPage().checkOut();
			// VP: Check order result at OrderResultPage
			PageFactory.OrderResultPage().checkOrderResult();
		}
	}

	@Test(description = "TC 001a: Verify Order An Item By Search Suggestion Successfully")
	public void TC001a_Order_By_Search_Suggestion() throws Exception {
		// Open HomePage
		PageFactory.HomePage().open();
		// Search for item at HomePage
		PageFactory.HomePage().suggestionSearchItem();
		// Check if item available at ItemDetailPage
		if (!PageFactory.ItemDetailPage().checkItemStatus()) {
			PageFactory.ItemDetailPage().contactWhenAvailable();
		} else {
			// Select Buy Now at ItemDetailPage
			PageFactory.ItemDetailPage().buyNow();
			// Select Checkout at CartPage
			PageFactory.CartPage().checkOut();
			// VP: Check order result at OrderResultPage
			PageFactory.OrderResultPage().checkOrderResult();
		}
	}
}
