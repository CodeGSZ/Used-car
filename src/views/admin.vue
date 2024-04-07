<template>
    <div class="box">
        <div>
            <!-- admin组件 -->
            <base-html>
                <!-- 成交订单组件 -->
                    <ordered-html></ordered-html>
                <!-- 正在生效中组件 -->
                    <ordereding-html></ordereding-html>
                <!-- 失败组件 -->
                    <fail-html></fail-html>
                <!-- 柱状图组件 -->
                    <bar-html></bar-html>
                <!-- 饼状图组件 -->
                    <pie-html></pie-html>
                <!-- 折现图组件 -->
                    <line-html></line-html>
            </base-html>
        </div>
        <!-- 显示区域 -->
        <div class="show">
            <router-view />
        </div>
    </div>
</template>

<script>
import BaseHtml from '../components/admin/base.vue'

import OrderedHtml from '../components/admin/order/ordered.vue'
import OrderedingHtml from '../components/admin/order/ordering.vue'
import FailHtml from '../components/admin/order/fail.vue'
import BarHtml from '../components/admin/table/bar.vue'
import PieHtml from '../components/admin/table/pie.vue'
import LineHtml from '../components/admin/table/line.vue'


export default {
    components: {
        BaseHtml,
        OrderedHtml,
        FailHtml,
        OrderedingHtml,
        BarHtml,
        PieHtml,
        LineHtml
    },
}
</script>

<style scoped>
.box{
    display: flex;
    width: 100%;
    height: 100%;
    justify-content: space-between;
    background: #fff;
}
.show {
    height: 100%;
    width: 100%;
    /* border: 1px solid red; */
}
</style>