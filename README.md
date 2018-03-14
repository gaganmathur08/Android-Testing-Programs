# Android-Testing-Programs
This repository contains a project which includes JUnit and UI automation testing using Espresso.

This project contains 4 different packages:
1) ActivityLaunchTest: This packge has an Activity which simply displays the layout associated with it.
Under "androidTest" package you can find it's corresponding test class. Where it is checking whether the activity is launched or not.

2) LaunchOneActivityFromAnotherTest: This package has 2 activities. ActivityTwo is called by ActivityOne.
Under "androidTest" package you can find it's corresponding test class, Where we are checking whether activity two is launched by activity one or not.

3) FragmentLaunchTest: In this paackge we are trying to test whether Fragment is initialized and called by the activity or not. There is an activity named "ActivityTest" which is used n the test class to attach fragment.
Under "androidTest" package there is a FragmentOneTest class which will test this condition.

4) UIAutomationTest: This package contains a simple activity consists of an edittext,button and textview. On click of the button whatever text is entered by the user in edittext will be displayed in the textview below.



