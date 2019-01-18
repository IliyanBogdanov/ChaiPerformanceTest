package Page;

import org.openqa.selenium.support.PageFactory;

import BaseTestFixture.Browser;

public class Page {

public static InkSpacePage  InkSpacePage()
{
	InkSpacePage InkSpacePage=new InkSpacePage();
	PageFactory.initElements(Browser.Driver, InkSpacePage);
	return InkSpacePage;
}


public static InkSpaceLoginPage InkSpaceLoginPage()
{
	InkSpaceLoginPage InkSpaceLoginPage=new InkSpaceLoginPage();
	PageFactory.initElements(Browser.Driver, InkSpaceLoginPage);
	return InkSpaceLoginPage;
}

public static InkSpaceHomePage InkSpaceHomePage()
{
	InkSpaceHomePage InkSpaceHomePage=new InkSpaceHomePage();
	PageFactory.initElements(Browser.Driver, InkSpaceHomePage);
	return InkSpaceHomePage;
}

public static ChaiHomePage ChaiHomePage()
{
	ChaiHomePage ChaiHomePage=new ChaiHomePage();
	PageFactory.initElements(Browser.Driver, ChaiHomePage);
	return ChaiHomePage;
}
	
	
}
