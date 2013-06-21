$(function(){
	findUsers();
	findUsers2();
	// 検索ボタンのクリックハンドラ
	$("#kensaku").click(function(){
		findUsers();
		findUsers2();
	});
});

function findUsers() {
	var param = { name : $("#paraName").val()};
	$.ajax({
	    url: '../userManager/ajaxListBL.do',
	    data: param,
	    type: 'POST',
	    dataType: 'xml',
	    cache: false,
	    timeout: 3000,
	    success: handleXml,
	    error: function(jqXHR, textStatus, errorThrown) {
	    	alert(textStatus + ' : ' + errorThrown);
	    }
	});
}

function handleXml(xml) {
	var row = '';
	$('#tableData').empty();
	$(xml).find('row').each(function(i){
		var id = $(this).find('id').text();
		var name = $(this).find('name').text();
		var age = $(this).find('age').text();
		var birth = $(this).find('birth').text();
		row = '<tr><td>' + id + '</td><td>' + name + '</td><td>' + age + '</td><td>' + birth + '</td></tr>'
		$('#tableData').append(row);
	});
}

function findUsers2() {
	var param = { name : $("#paraName").val()};
	$.ajax({
	    url: '../userManager/ajaxJSONListBL.do',
	    data: param,
	    type: 'POST',
	    dataType: 'json',
	    cache: false,
	    timeout: 3000,
	    success: handleJSON,
	    error: function(jqXHR, textStatus, errorThrown) {
	    	alert(jqXHR);
	    	alert(textStatus + ' : ' + errorThrown);
	    }
	});
}

function handleJSON(data) {
	var row = '';
	$('#tableData2').empty();
	for(var i in data){
		var id = data[i].id;
		var name = data[i].name;
		var age = data[i].age;
		var birth = data[i].birth;
		row = '<tr><td>' + id + '</td><td>' + name + '</td><td>' + age + '</td><td>' + birth + '</td></tr>'
		$('#tableData2').append(row);
	}
}
