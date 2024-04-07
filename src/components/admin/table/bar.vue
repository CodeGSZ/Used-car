<template>
    <div>
        <div id="bar">

        </div>
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
                        xAxis: {
                            type: 'category',
                            data: ['星期一', '星期二', '星期三', '星期四', '星期五', '星期六', '星期天']
                        },
                        yAxis: {
                            type: 'value'
                        },
                        series: [
                        {
                            data: [120, 200, 150, 80, 70, 110, 130],
                            type: 'bar',
                            showBackground: true,
                            backgroundStyle: {
                                color: 'rgba(180, 180, 180, 0.2)'
                            }
                        }
                        ]
                    };
            var myChart = document.getElementById("bar");
            var myBar = echarts.init(myChart)
            myBar.setOption(option);
        }
    }
}
</script>

<style scoped>
#bar {
    height: 500px;
    width: 100%;
}
</style>