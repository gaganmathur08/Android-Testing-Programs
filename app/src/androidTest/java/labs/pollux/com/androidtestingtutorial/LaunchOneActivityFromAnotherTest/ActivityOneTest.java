package labs.pollux.com.androidtestingtutorial.LaunchOneActivityFromAnotherTest;

import android.app.Instrumentation;
import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import labs.pollux.com.androidtestingtutorial.LaunchOneActivityFromAnotherTest.ActivityOne;
import labs.pollux.com.androidtestingtutorial.LaunchOneActivityFromAnotherTest.ActivityTwo;
import labs.pollux.com.androidtestingtutorial.R;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

/**
 * Created by Gagan on 14-Mar-18.
 */
public class ActivityOneTest {

    @Rule
    public ActivityTestRule<ActivityOne> mActivityOneTestRule = new ActivityTestRule<ActivityOne>(ActivityOne.class);
    private ActivityOne mActivityOne;
    Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(ActivityTwo.class.getName(), null, false);

    @Before
    public void setUp() throws Exception {
        mActivityOne = mActivityOneTestRule.getActivity();
    }

    @Test
    public void testLaunchOfSecondActivityOnButtonClick() {
        View view = mActivityOne.findViewById(R.id.go_to_btn);

        assertNotNull(view);

        onView(withId(R.id.go_to_btn)).perform(click());

        ActivityTwo activityTwo = (ActivityTwo) getInstrumentation().waitForMonitorWithTimeout(monitor,4000);
        assertNotNull(activityTwo);
    }

    @After
    public void tearDown() throws Exception {
    }

}