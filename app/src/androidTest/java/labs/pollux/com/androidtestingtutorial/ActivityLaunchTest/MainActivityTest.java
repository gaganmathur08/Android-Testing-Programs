package labs.pollux.com.androidtestingtutorial.ActivityLaunchTest;

import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import labs.pollux.com.androidtestingtutorial.R;

import static org.junit.Assert.*;

/**
 * Created by Gagan on 14-Mar-18.
 */
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);
    private MainActivity mActivity;


    @Before
    public void setUp() throws Exception {
        mActivity = mActivityTestRule.getActivity();
    }

    @Test
    public void activityTest() {
        View view = mActivity.findViewById(R.id.hellowordtxt);
        assertNotNull(view);
    }

    @After
    public void tearDown() throws Exception {
        mActivity = null;
    }

}