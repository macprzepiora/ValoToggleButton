# ValoToggleButton Add-on for Vaadin 7

ValoToggleButton is an UI component add-on for Vaadin 7.

It provides a toggle button component that is compatible with Valo theme and its derivatives.
It replaces tgglbtn-v7 addon that's not compatible with Valo.
## Online demo

No online demo yet

## Download release

Official releases of this add-on are available at Vaadin Directory. For Maven instructions, download and reviews, go to http://vaadin.com/addon/valo-toggle-button

## Building and running demo

git clone https://github.com/macprzepiora/ValoToggleButton
mvn clean install
cd demo
mvn jetty:run

To see the demo, navigate to http://localhost:8080/

## Development with Eclipse IDE

For further development of this add-on, the following tool-chain is recommended:
- Eclipse IDE
- m2e wtp plug-in (install it from Eclipse Marketplace)
- Vaadin Eclipse plug-in (install it from Eclipse Marketplace)
- JRebel Eclipse plug-in (install it from Eclipse Marketplace)
- Chrome browser

### Importing project

Choose File > Import... > Existing Maven Projects

Note that Eclipse may give "Plugin execution not covered by lifecycle configuration" errors for pom.xml. Use "Permanently mark goal resources in pom.xml as ignored in Eclipse build" quick-fix to mark these errors as permanently ignored in your project. Do not worry, the project still works fine.

### Debugging server-side

If you have not already compiled the widgetset, do it now by running clean and package Maven targets for valo-toggle-button-root project.

If you have a JRebel license, it makes on the fly code changes faster. Just add JRebel nature to your valo-toggle-button-demo project by clicking project with right mouse button and choosing JRebel > Add JRebel Nature

To debug project and make code modifications on the fly in the server-side, right-click the valo-toggle-button-demo project and choose Debug As > Debug on Server. Navigate to http://localhost:8080/valo-toggle-button-demo/ to see the application.

### Debugging client-side

The most common way of debugging and making changes to the client-side code is superdev mode. To enable it, uncomment devModeRedirectEnabled line from the end of DemoWidgetSet.gwt.xml located under valo-toggle-button-demo resources folder and compile the widgetset once by running vaadin:compile Maven target for valo-toggle-button-demo. Refresh valo-toggle-button-demo project resources by right clicking the project and choosing Refresh. Click "Create SuperDevMode Launch" button on the Vaadin tab of the valo-toggle-button-demo project properties panel to create superder mode code server launch configuration and modify the class path as instructed above. After starting the code server by running SuperDevMode launch as Java application, you can navigate to http://localhost:8080/valo-toggle-button-demo/?superdevmode. Now all code changes you do to your client side will get compiled as soon as you reload the web page. You can also access Java-sources and set breakpoints inside Chrome if you enable source maps from inspector settings.


## Release notes

No releases yet

## Roadmap

This component is developed as a hobby with no public roadmap or any guarantees of upcoming releases.

## Issue tracking

The issues for this add-on are tracked on its github.com page. All bug reports and feature requests are appreciated.

## Contributions

Contributions are welcome, but there are no guarantees that they are accepted as such. Process for contributing is the following:
- Fork this project
- Create an issue to this project about the contribution (bug or feature) if there is no such issue about it already. Try to keep the scope minimal.
- Develop and test the fix or functionality carefully. Only include minimum amount of code needed to fix the issue.
- Refer to the fixed issue in commit
- Send a pull request for the original project
- Comment on the original issue that you have implemented a fix for it

## License & Author

Add-on is distributed under Apache License 2.0. For license terms, see LICENSE.txt.

ValoToggleButton is written by Maciej "Mac" Przepióra, Vaadin Expert at Vaadin Oy

# Developer Guide

## Getting started

Take a look on valo-toggle-button-demo/src/main/java/eu/przepiora/vaadin7/valotogglebutton/demo/DemoUI.java

## Features
