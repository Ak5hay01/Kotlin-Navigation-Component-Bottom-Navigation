# Kotlin-Navigation-Component-Bottom-Navigation

Navigation refers to the interactions that allow users to navigate across, into, and back out from the different pieces of content within your app. Android Jetpack's Navigation component helps you implement navigation, from simple button clicks to more complex patterns.

Link: https://developer.android.com/guide/navigation and <br/>
Link: https://developer.android.com/guide/navigation/navigation-getting-started

As its visible there are 3 fragments used Home, Employee and AboutUs, when we click on any of the bottom navigation menu the fragment associated to the menu is added in the fragment container.

We need to create regular menu and just add in the "BottomNavigationView" to show the menu

```
  <com.google.android.material.bottomnavigation.BottomNavigationView
        android:id="@+id/bottomNavigation"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:menu="@menu/bottom_menu"/> // added menu which we need to show 

```

# Home Screen 
![alt text](/screenshots/home.PNG)

# Employee Screen 
![alt text](/screenshots/employee.PNG)

# About Us Screen 
![alt text](/screenshots/aboutus.PNG)
