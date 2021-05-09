import io.cucumber.java.en.*;

public class CheckStep {

    String filePath = "src/test/resources/rbsData.xls";
    @Given("prepare the request")
    public void prepare_the_request() {

        ExcelReader2 ex = new ExcelReader2(filePath,0);
        java.util.Map<String, java.util.Map<String, String>> excelData = null;
        try {
            excelData = ex.getExcelAsMap();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        System.out.println("Excel Data for 2nd row and column- AccountNo : "+excelData.get("2").get("AccountNo"));
        System.out.println("excelData as Map: "+excelData);
    }
    @When("send the request")
    public void send_the_request() {
        System.out.println("check when");
    }
    @Then("validate data from excel for u baby")
    public void validate_data_from_excel_for_u_baby() {
        System.out.println("then");
    }




}
