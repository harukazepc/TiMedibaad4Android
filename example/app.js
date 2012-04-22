// This is a test harness for your module
// You should do something interesting in this harness 
// to test out the module and to provide instructions 
// to users on how to use it by example.


// open a single window
var window = Ti.UI.createWindow({
	backgroundColor:'white'
});
var label = Ti.UI.createLabel();
window.add(label);

// TODO: write your module tests here
var timedibaad4android = require('tv.harukaze.ti.medibaad.android');

// set site_id
timedibaad4android.setAuid('111981');
// create admaker view
var medibaadView = timedibaad4android.createMedibaadView({bottom:0});

window.add(medibaadView);
window.open();
