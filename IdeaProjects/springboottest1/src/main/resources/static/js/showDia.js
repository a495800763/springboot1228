var myChart = echarts.init(document.getElementById('main'));

var list =document.getElementById("newid").value;
alert(list);
var mydata=list.toArray();
option = {
	    xAxis: {
	        type: 'category',
	        data: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun']
	    },
	    yAxis: {
	        type: 'value'
	    },
	    series: [{
	        data: mydata,
	        type: 'line'
	    }]
	};
	// 使用刚指定的配置项和数据显示图表。
	myChart.setOption(option);
