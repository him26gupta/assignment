$(document).ready(function() {
	var table = $('#atmLocation').DataTable({
		"sAjaxSource" : "/atmLocations",
		"sAjaxDataProp" : "",
		"aoColumns" : [ {
			"mData" : "address.street"
		}, {
			"mData" : "address.housenumber"
		}, {
			"mData" : "address.postalcode"
		}, {
			"mData" : "address.city"
		}, {
			"mData" : "address.geoLocation.lat"
		}, {
			"mData" : "address.geoLocation.lng"
		}, {
			"mData" : "distance"
		}, {
			"mData" : "type"
		} ]
	})
});