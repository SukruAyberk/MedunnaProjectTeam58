package stepDefinitions.dbSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;
import utilities.DatabaseUtility;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class US001 {
    @Given("user connects to the database")
    public void user_connects_to_the_database() throws SQLException {
        DatabaseUtility.createConnection();
    }
    @Given("user gets the {string} from {string} table")
    public void user_gets_the_from_table(String column, String table) {
        String myQuery = "Select "+column+" from "+table;
        DBUtils.executeQuery(myQuery);
    }
    @Given("verify {string} table {string} column contains {string} data")
    public void verify_table_column_contains_data(String table, String column, String data) {


        List<Object> allColumnData=DBUtils.getColumnData("select * from "+table,column);
        System.out.println(allColumnData);
        List<Object> expectedData = new ArrayList<>();
        expectedData.add(data);
        Assert.assertTrue(allColumnData.containsAll(expectedData));
    }
    @Then("close the database connection")
    public void close_the_database_connection() {

        DBUtils.closeConnection();
    }
}
