# In-app billing in Kivy Applications

This repository contains an application structure that works with Kivy, which allows you to make in-app purchases using the Google Play Billing Library 6.0.1.

You can use it for Purchased Consumable Products.
There are no subscription modules.

You must define the items used in the application as consumable products via the Google play console.

Don't forget to define the items in the googleplayapi.py file and main.py

You can access the license key used in the application in the following way:
  1- Open Play Console and select the app.
  2- Go to the Monetization setup page(Monetize > Monetization setup).
  3- Your license key is under "Licensing."
  4- Define license key in main.py and buildozer.spec


<img width="461" alt="BillingStructure" src="https://github.com/LionReal/GooglePlayBilling/assets/79577465/a9b72b77-b51f-48c7-a4c2-1000753cecdf">

Example Video:

https://github.com/LionReal/GooglePlayBilling/assets/79577465/448ef0ed-302d-4263-9bef-0ddcdf25dcde


Links:

https://developer.android.com/google/play/billing/integrate


https://medium.com/androiddevelopers/working-with-google-play-billing-part-2-b859b55426d2


