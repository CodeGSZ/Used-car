<template>
    <div>
        <div id="pie"></div>
    </div>
</template>

<script>
import echarts from '../../../../public/static/js/echarts.min.js'
export default {
    name:'Bar',
    data() {
        return {
            
        }
    },
    mounted () {
        this.GetBarDom();
    },
    methods: {
        GetBarDom () {
            var option = {
                title: {
                    text: '车辆月度销售占比图',
                    subtext: '月报数据',
                    left: 'center'
                },
                tooltip: {
                    trigger: 'item'
                },
                legend: {
                    orient: 'vertical',
                    left: 'right'
                },
                series: [
                    {
                    name: '月度报表',
                    type: 'pie',
                    radius: '50%',
                    data: [
                        { value: 1048, name: '一月' },
                        { value: 735, name: '二月' },
                        { value: 580, name: '三月' },
                        { value: 484, name: '四月' },
                        { value: 300, name: '五月' }
                    ],
                    emphasis: {
                        itemStyle: {
                        shadowBlur: 10,
                        shadowOffsetX: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                        }
                    }
                    }
                ]
            };
            var myChart = document.getElementById("pie");
            var myBar = echarts.init(myChart)
            myBar.setOption(option);
        }
    }
}
</script>

<style scoped>
#pie {
    height: 500px;
    width: 100%;
}
</style>