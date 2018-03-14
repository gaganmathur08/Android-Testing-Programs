package labs.pollux.com.androidtestingtutorial.FragmentLaunchTest;

import android.support.test.rule.ActivityTestRule;
import android.view.View;
import android.widget.RelativeLayout;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import labs.pollux.com.androidtestingtutorial.R;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static org.junit.Assert.*;

/**
 * Created by Gagan on 14-Mar-18.
 */
public class FragmentOneTest {

    @Rule
    public ActivityTestRule<ActivityTest> mActivityTestRule = new ActivityTestRule<ActivityTest>(ActivityTest.class);
    private ActivityTest mActivityTest;

    @Before
    public void setUp() throws Exception {
        mActivityTest = mActivityTestRule.getActivity();
    }

    @Test
    public void testFrgamentLaunch() {
        RelativeLayout rlContainer = mActivityTest.findViewById(R.id.test_container);
        assertNotNull(rlContainer);
        FragmentOne fragmentOne = FragmentOne.newInstance("", "");

        mActivityTest.getSupportFragmentManager().beginTransaction().add(rlContainer.getId(), fragmentOne).commitAllowingStateLoss();

        getInstrumentation().waitForIdleSync();

        View view = fragmentOne.getView().findViewById(R.id.fragment_txt);
        assertNotNull(view);
    }

    @After
    public void tearDown() throws Exception {
        mActivityTest = null;
    }

}