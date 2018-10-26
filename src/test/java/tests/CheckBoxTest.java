package tests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.CheckBoxPage;

public class CheckBoxTest extends BaseTest{

    @Test
    public void singleCheckBoxTest(){

        String outputMessage = new CheckBoxPage(driver).singliCheckBox();

        Assertions.assertThat(outputMessage).isEqualTo("Success - Check box is checked");
    }
}
