import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AutoTestBranches.class,
        AutoTestStory.class,
        AutoTestButtonBlack.class,
        AutoTestNavigation.class,
        AutoTestSearch.class
}

)
public class TestSuiteKasta {
}
