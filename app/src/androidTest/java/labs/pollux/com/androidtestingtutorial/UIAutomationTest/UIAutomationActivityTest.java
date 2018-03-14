package labs.pollux.com.androidtestingtutorial.UIAutomationTest;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import labs.pollux.com.androidtestingtutorial.R;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Created by Gagan on 14-Mar-18.
 */
public class UIAutomationActivityTest {

    @Rule
    public ActivityTestRule<UIAutomationActivity> mActivityTestRule = new ActivityTestRule<UIAutomationActivity>(UIAutomationActivity.class);
    private String eName = "Gagan";

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testRule(){
        //enter text in edittext
        Espresso.onView(withId(R.id.edt_txt)).perform(typeText(eName));
        //close soft keyboard
        Espresso.closeSoftKeyboard();
        //click on change button
        Espresso.onView(withId(R.id.change_txt_btn)).perform(click());
        //check for changed string in textview
        Espresso.onView(withId(R.id.changed_txt)).check(matches(withText(eName)));
    }

    @After
    public void tearDown() throws Exception {
    }

}